package com.codetest.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.regex.*; 

public class ComputerCourse {
	

	
	public  List <Boolean> ipAddressCheck(String fileName){
		
		
        List<String> list = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

            
            list = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        List <Boolean> boolList = new ArrayList<>();
    for (String line : list){
    	Boolean bool= new Boolean(isValidIPAddress(line));
    	boolList.add(bool);
    	
    }
	
	return boolList;
		
		
	
		
	}
	
	
	public  boolean isValidIPAddress(String ip) 
    { 
  

        String zeroTo255 
            = "(\\d{1,2}|(0|1)\\"
              + "d{2}|2[0-4]\\d|25[0-5])"; 
  

        String regex 
            = zeroTo255 + "\\."
              + zeroTo255 + "\\."
              + zeroTo255 + "\\."
              + zeroTo255; 
  
    
        Pattern p = Pattern.compile(regex); 
  
   
        if (ip == null) { 
            return false; 
        } 
  
   
        Matcher m = p.matcher(ip); 
  
       
        return m.matches(); 
    } 
  
	
	
	
	public  List <Boolean> bracketCheck(String fileName){
		
		
	        List<String> list = new ArrayList<>();

	        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

	            
	            list = br.lines().collect(Collectors.toList());

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        List <Boolean> boolList = new ArrayList<>();
	    for (String line : list){
	    	Boolean bool= new Boolean(isBalanced(line));
	    	boolList.add(bool);
	    	
	    }
		
		return boolList;
	}
	
	
	
	
	
	
	public  boolean isBalanced(String brackets) {
       
        Map<Character, Character> braces = new HashMap<>();
        braces.put('(', ')');
        braces.put('[',']');
        braces.put('{','}');

       
        if (brackets.length() % 2 != 0) {
            return false;
        }

        Stack<Character> halfBraces = new Stack();
        for(char ch: brackets.toCharArray()) {
            if (braces.containsKey(ch)) {
                halfBraces.push(braces.get(ch));
            }
     
            else if(halfBraces.isEmpty() || ch != halfBraces.pop()) {
                return false;
            }
        }
        return halfBraces.isEmpty();
    }

}
