package sdf;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class main{
    public static void main(String[] args) throws FileNotFoundException {
   
        FileReader reader = new FileReader("cat_in_the_hat.txt"); 
        Scanner scanner = new Scanner(reader); 
        HashMap<String, Integer> wordCount = new HashMap<>(); 
        
        while (scanner.hasNextLine()){
        String sentence = scanner.nextLine(); 
        

        String cleanSentence = sentence.replaceAll("\\p{P}", "");
        String upperCaseSentence = cleanSentence.toUpperCase(); 
        String[] splitWords = upperCaseSentence.split(" "); 

        for(String justWords:splitWords){
            System.out.println(justWords);
            if(!wordCount.containsKey(justWords)){
                wordCount.put(justWords, 1); 
            } else {
                wordCount.put(justWords, wordCount.get(justWords)+1);
            }
        }
        ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<HashMap<String, Integer>>();
        arrayList.add(wordCount);

        System.out.println(arrayList);
        }

    scanner.close(); 
    }
}