package sdf;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main{
    public static void main(String[] args) throws FileNotFoundException {
   
        FileReader reader = new FileReader("cat_in_the_hat.txt"); 
        Scanner scanner = new Scanner(reader); 
        Map<String, Integer> wordCount = new HashMap<>(); 
        
        while (scanner.hasNextLine()){
        String sentence = scanner.nextLine(); 

        String cleanSentence = sentence.replaceAll("\\p{P}", "");
        
        String[] splitWords = cleanSentence.split(" "); 

        for(String justWords:splitWords){
            System.out.println(justWords);
        }
        }

    scanner.close(); 
    }
}