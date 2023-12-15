package util;

import java.util.Scanner;

/* classe que adivinha a palavra através de comparação
 * Eqto a palavra selecionada for diferente a palavra codificada, verifica se o char 
 * inputado existe na palavra e se existir substitui o * pelo char
 */

public class guessWord {
    public static void guessWord(String selectedWord, String codeWordStr){

        Scanner entLetra = new Scanner(System.in);
        
        System.out.println("----- Tente descobrir qual é palavra codificada -----");
        System.out.println("");

        int contador = 0;
        String word="";
        boolean somar = false;       
        
        char[] chrSelectedWord = selectedWord.toCharArray();
        char[] chrCodeWordStr = codeWordStr.toCharArray();
        


           while (!word.equals(selectedWord)) {
               if (somar) {
                  contador++;
               }        
               
               if (contador ==7){
                    drawForca.drawForca(contador);
                    System.out.println("  ##### Você não adivinhou a palavra escolhida #####");
                    System.out.println("        A palavra escolhida foi  \'"+selectedWord+"\'");
                return;
               }
            /* a função drawforca desenha uma matriz de chars simulando o desenho da forca
             * A variavel somar controla o contador determinando se quando essa função for chamada
             * a matriz deve ser redesenhada com elementos da forca
             */
            drawForca.drawForca(contador);
            System.out.print("\n   Digite uma letra => ");
            char letra  =  entLetra.nextLine().toLowerCase().charAt(0); //<= recebe string e converte primeira posição como char
                
              somar=true;
                
              for (int i=0;i<chrSelectedWord.length;i++){
                if(chrSelectedWord[i]==letra){
                    chrCodeWordStr[i]=letra;
                    somar = false;
                }
            }
                
           // System.out.println("");
            word = new String(chrCodeWordStr);
            System.out.print("---------------------------\n   PALAVRA =>  "+word);  
            System.out.print("\n---------------------------\n");  

        }

        System.out.println("-----------------------------------");
        System.out.println("     Parabéns\n   Você acertou a palavra escolhida !!!");
        System.out.println("-----------------------------------");
        //entLetra.close();

    }    
}
