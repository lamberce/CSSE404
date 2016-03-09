// put lexer code in this file
import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;


public class simpleLexer {
	private static String inputFile = "lexerInput.txt";
	private static HashMap<Character, String> keywordMap = new HashMap<Character, String>();

    public static void main(String []args){
    	keywordMap.put('+', "\nplus");
    	keywordMap.put('-', "\nminus");    	

    	List<String> lines = null;
        try {
        	lines = Files.readAllLines(Paths.get(inputFile), StandardCharsets.UTF_8);
        } catch(Exception e) {
        	System.out.println("Error reading file");
        }

        for(String line : lines){
        	boolean previousInt = true;
        	for(char c : line.toCharArray()){
        		if(keywordMap.containsKey(c)){
        			System.out.print(keywordMap.get(c));
        			previousInt = false;
        		} else {
        			if(!previousInt){
        				System.out.println();
        				previousInt = true;
        			}
        			System.out.print(c);
        		}
        	}
        }
        System.out.println();
    }
}


