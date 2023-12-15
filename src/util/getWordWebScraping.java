package util;

import java.net.URL;

import org.jsoup.*;
import org.jsoup.nodes.Document;


public class getWordWebScraping {

    /* UTILIZANDO WEB SCRAPPING
     * 
     * Devido escassez de api's que forneçam palavras aleatórias, foi necessária utilizar técnicas de
     * webscraapping para raspar dados de determinada página. No caso, uma palavra gerada aleatoriamente
     * 
     * Utilizando a biblioteca JOSUP é possivel fazer essa conexão com os sites atuais.
     */
    public static String getWordScrapping() throws Exception{
        URL url = new URL("https://www.palavrasaleatorias.com/?fs=1&fs2=0&Submit=Nova+palavra");

        Document doc = Jsoup.connect(url.toString()).get(); 
        String word = doc.getElementsByAttributeValueContaining("style","font-size:3em; color:#6200C5;").text();       
       //System.out.println(doc.getElementsByAttributeValueContaining("style","font-size:3em; color:#6200C5;").text());
       // System.out.println(word);
        return word;
    }
    
}
