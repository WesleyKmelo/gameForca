//import java.util.Scanner;

import java.util.Scanner;

import util.codeWord;
import util.getWord;
import util.getWordWebScraping;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;


public class App {
    public static void main(String[] args) throws Exception { 

        Scanner entLetra = new Scanner(System.in);
        String ss= "s";

        while (ss.equalsIgnoreCase("s")) {
            
            try {
                
                // UTILIZANDO API
                //codeWord.codeWordString(getWord.getWord()); /* <= INSTÂNCIA do codeWord passando o retorno String do metodo de GetWord */
                
                //UTILIZANDO WEBSCRAPPING
                codeWord.codeWordString(getWordWebScraping.getWordScrapping());
                
            } catch (Exception e) {
                System.out.println("  A palavra não foi gerada\nO aplicativo será encerrado!!!");
            }
            
            System.out.print("\n  Deseja jogar Novamente?\n >>> 's' para SIM 'n' para NÃO ==> ");
            ss = entLetra.nextLine();
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
        }
    }
  }

