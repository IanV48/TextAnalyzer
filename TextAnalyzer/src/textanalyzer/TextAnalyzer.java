package textanalyzer;

import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 *
 * @author Ian Vasily
 */
public class TextAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file;
        FileReader reader;
        String s = "";
        //Read from passage.txt
        try
        {
            file = new File(System.getProperty("user.dir") + "\\src\\textanalyzer\\passage.txt");
            reader = new FileReader(file);
            int i;
            while ((i=reader.read())!= -1)
            {
		s = s + (char)i;
            }
        }
        catch(Exception e)
        {
            System.out.println("Error in reading passage");
        }
        
        //Count our words and also make a list of each word
        Methods methods = new Methods();
        ArrayList<String> list = methods.wordsplit(s);
        System.out.println("Word Count: " + list.size());
        System.out.println();
        
        //Make an ordered list of our words and print off the top ten from it
        //(accounts for the possibility that we have less than 10 words)
        ArrayList<Word> words = methods.wordsort(list);
        int topten = 10;
        if(words.size()<topten){
            topten = words.size();
        }
        for(int i=0; i<topten;i++){
            System.out.println("Word #" + (i+1) + ": " + words.get(i).word());
            System.out.println("Instances: " + words.get(i).instances());
            System.out.println();
        }
        
        //Finds the final sentence containing the top word
        String topword = words.get(0).word();
        String lastsentence = methods.lastsentencewithword(s, topword);
        System.out.println(lastsentence);
        
    }
}
