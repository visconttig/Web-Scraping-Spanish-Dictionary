import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class DataFromWeb {

    private static Object Element;

    public static void main(String[] args){
        try {
            Document document = Jsoup.connect("https://dle.rae.es/perro").get();

            Element = document.getElementById("resultados");
            //TEST
            System.out.println(Element.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
