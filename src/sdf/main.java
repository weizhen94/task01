package sdf;

import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class main{
    public static void main(String[] args) throws IOException {
   
        FileReader reader = new FileReader("cat_in_the_hat.txt"); 
        Scanner scanner = new Scanner(reader); 
        Map<String, Integer> wordCount = new HashMap<>(); 
        
        while (scanner.hasNextLine()){
        String sentence = scanner.nextLine(); 
        
        String cleanSentence = sentence.replaceAll("\\p{P}", "");
        String upperCaseSentence = cleanSentence.toUpperCase(); 
        String[] splitWords = upperCaseSentence.split(" "); 

        for(String justWords:splitWords){
    
            if(!wordCount.containsKey(justWords)){
                wordCount.put(justWords, 1); 
            } else {
                wordCount.put(justWords, wordCount.get(justWords)+1);
            }
        }
        Stream<Map.Entry<String, Integer>> sortedWordCount = wordCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(10); 
        sortedWordCount.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        
        }
     scanner.close();
     reader.close(); 
    }
}