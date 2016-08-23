package func;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Func {
    ArrayList<String> imagesArr = new ArrayList<String>();



    public ArrayList<String> jsMet (String inputData) {
        Document doc = null;
        try {
            // fetch the document over HTTP
            doc = Jsoup.connect("http://giphy.com/search/" + inputData).get();

            // get the page title
            String title = doc.title();
            System.out.println("title: " + title);

            // get all links in page
            Elements images = doc.select("img[src]");
            for (Element image : images) {
                imagesArr.add(image.attr("data-animated"));
                // get the value from the href attribute
                //System.out.println("\nimg: " + image.attr("data-animated"));
                //System.out.println("text: " + image.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        imagesArr.removeAll(Arrays.asList("",null));

        System.out.println(imagesArr.toString());
        return imagesArr;

        //----------------------------------------------
 /*   String json = new Gson().toJson(imagesArr);

        File file1 = new File("../images.json");

    try {

        //FileWriter file = new FileWriter("c:\\test.json");
        FileWriter file = new FileWriter(file1);

        file.write(json);
        file.flush();
        file.close();
        System.out.println(file1.getAbsolutePath());
    } catch (IOException e) {
        e.printStackTrace();



    }*/








    }




//-----------------------------------------





}
