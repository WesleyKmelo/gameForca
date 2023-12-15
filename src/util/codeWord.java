package util;

//codifica uma palavra em um string de * e depois
//chama o método da classe GuessWord passando  2 parametros
public class codeWord {
    public static void codeWordString(String selectedWord){

        char[] arrLetras = selectedWord.toCharArray();

        for (int i=0;i<arrLetras.length;i++){
            arrLetras[i] = '*';
        }

        String codeWordStr = new String(arrLetras);
        System.out.println("=========================================\n   A palavra foi selecionada e codificada\n   => "+ codeWordStr+"\n");

        guessWord.guessWord(selectedWord,codeWordStr);
    }

   
}
