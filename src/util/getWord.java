package util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import model.Word;


/* Não é uma boa prática colocar todo acesso e processamento da api
em uma mesma classe mas essa api retorna apenas uma string de um Json
entaõ nao seria preciso criar um service pra isso */

/* Para acessar os dados de um JSON é necessário que seja criada uma classe com os mesmos
 * atributos do Json junto com getters e setters. 
 * 
 * Em seguida utilizando a biblioteca Gson do google.com , converter com o metodo 
 * fromJson e passando a string e o modelo da classe .
 */

public class getWord{

    public  static String getWord() throws IOException {

  
       URL url = new URL("https://api.dicionario-aberto.net/random");

    //    /* FORMA DE CONSUMIR API BASEADO EM CLASSES */

    //     HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

    //     InputStream input = conexao.getInputStream(); // <= retorna os dados vindos do objeto conexao 
    //     BufferedReader br = new BufferedReader(new InputStreamReader(input,"UTF-8")); //<= cria um objeto capaz de ler todas as linhas criadas no objeto input
       
    //     /* INICIALIZAÇÃO DAS VARIÁVEIS */
    //     String wordAux="";
    //     StringBuilder word = new StringBuilder();

    //     while ((wordAux=br.readLine())!=null) { /* a cada linha do objeto br que for lida, essa linha é atribuida na variavel wordaux  */
    //         word.append(wordAux); /* a linha wordaux lida é passada para variavel word */
    //     }


    //     String objJsonString = word.toString();

    //     Gson gsonString = new Gson();
    //     Word selectedWord = gsonString.fromJson(objJsonString, Word.class);
        
    //    //System.out.println( selectedWord.getWord());
      
    //  return selectedWord.getWord();


    /* FORMA DE CONSUMIR API SEM UTILIZAR CLASSES 
     * acessando apenas um atributo do JSON
       vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv*/

    InputStream input = url.openStream(); /* <= criação do tipo de entrada de dados */
    Reader reader = new InputStreamReader(input,"UTF-8"); /* converte os dados recebidos no input para caracteres */
    Scanner linhaJson = new Scanner(reader); /*<= criação de objeto que vai permitir ler o fluxo de dados de entrada(reader) */

    String jString = linhaJson.nextLine();

    JsonObject jsonObject = JsonParser.parseString(jString).getAsJsonObject();   
    String word = jsonObject.get("word").getAsString();

    linhaJson.close();
    return word;
   // return "cavalo";
  }
}