package sdf;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class main{
    public static void main(String[] args) throws FileNotFoundException {

        double wordCount = 0; 

        FileReader reader = new FileReader("cat_in_the_hat.txt"); 
        Scanner scanner = new Scanner(reader); 

        String sentence = scanner.nextLine(); 

        while (scanner.hasNextLine()){
        if (sentence.equalsIgnoreCase ("mother")){
            wordCount++; 
            System.out.println("The frequency of the word is " + wordCount);
        } 
    }


        scanner.close(); 
    }
}