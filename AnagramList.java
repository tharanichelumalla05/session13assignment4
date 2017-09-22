/*showing the set of anagrams from a list of words*/

package jumbledorder;//created package as jumbledorder

import java.util.ArrayList;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class AnagramList { //creating a class AnagramList
	                   //classes are the basics of opps(object oriented programming)
	//Here public is a access modifier which defines who can access this method


	public static void main(String[] args) { //creating a main method
		// TODO Auto-generated method stub
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		
		List<String> list = new ArrayList<String>();//created an object
		
		//here in the we are adding the list of String values
		list.add("listen");//adding listen
		list.add("pot");//adding pot
		list.add("part");//adding part
		list.add("opt");//adding opt
		list.add("trap");//adding trap
		list.add("silent");//adding silence
		list.add("top");//adding top
		list.add("hello");//adding hello
		list.add("hits");//adding hits
		list.add("what");//adding what
		list.add("shit");//adding shit
		
		    System.out.println(findAnagrams(list)); //it prints all the anagrams
		                                           //system is used to return code
		                                           //out is static member
		                                          //println is used to print text and gives output
     
	}
	//here we have taken a method of Map which shows a value list of anagrams and a key of String and input is list of words
		private static Map<String, List<String>>findAnagrams (List<String> words){
			 Map<String, List<String>> anagrams= null;  // created a HashMap string as a key and list as string 
			 
			 if(words == null || words.size() ==0){  //here it is check the list of words of is empty and return as null
				 return null;//returning
				 
			 }
			    anagrams = new HashMap<String, List<String>>(); //HashMap is an implementation and we are implementing the anagrams 
			   
			    // for example pot takes the word and get into the charArray and sorted them after that they comes to string and forms a string 
			    for(String word : words){                    //creating a for loop which checks the words which we have given
			    	char [] charArray = word.trim().toCharArray();
			    	Arrays.sort(charArray);
			    	String sortedWord = String.valueOf(charArray);
			    	
			    	if(anagrams.containsKey(sortedWord)){            //here it checks weather contains a key and get the sorted word 
			    		  List<String> newList = anagrams.get(sortedWord);     
			    		  newList.add(word);
			    		  anagrams.put(sortedWord, newList);//we put a new list of sorted word
			    		  
			    	}
			    	else{                  //  if the map doesn't contain the sorted word we are creating a new array list of type string
			    		List<String> list = new ArrayList<String>();//list
			    		list.add(word);//add word
			    		anagrams.put(sortedWord, list);//sorted word
			    	}
			    }
			 return anagrams; //this returns the anagrams
		}
	}