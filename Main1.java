// 

import java.util.LinkedList;
import java.util.List;
import java.util.regex.*;

public class Main1 {
	
	
    static List<String> matchingResults = new LinkedList<>();
    static List<String> fullWords  = new LinkedList<>();
    
    static List<String> step2Words  = new LinkedList<>();
    static List<String> finalDates = new LinkedList<>();
    static int arrofDates [];
    static int sortedDates[];
    static List<String> meanings = new LinkedList<>();
    
    public static void main(String[]args)
    {
 
        //April 1, 1976
        // April-1-,-1976
        //January|February|March|April|May|June|July|August|September|October|November|December 
        String input = "Apple is the world's second-largest information technology company by revenue after Samsung Electronics, and the world's third-largest mobile phone maker after Samsung and Nokia.[6] Fortune magazine named Apple the most admired company in the United States in 2008, and in the world from 2008 to 2012.[7][8][9][10][11] On September 30, 2013, Apple surpassed Coca-Cola to become the world's most valuable brand in the Omnicom Group's Best Global Brands report.[12] However, the company has received criticism for its contractors' labor practices, and for Apple's own environmental and business practices. As of May 2013, Apple maintains 408 retail stores in fourteen countries[13][14] as well as the online Apple Store and iTunes Store,[15] the latter of which is the world's largest music retailer.[16] Apple is the largest publicly traded corporation in the world by market capitalization, with an estimated market capitalization of $446 billion by January, 2014.[17] As of September 29, 2012, the company had 72,800 permanent full-time employees and 3,300 temporary full-time employees worldwide. Its worldwide annual revenue in 2013 totalled $170 billion.[18] As of Q1 2014, Apple's five-year growth average is 39% for top line growth and 45% for bottom line growth. In May 2013, Apple entered the top ten of the Fortune 500 list of companies for the first time, rising 11 places above its 2012 ranking to take the sixth position.[19]";
        String[] words = input.split(" ");
        String[] months = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        //System.out.println(input);
        //^[^abc]*
        System.out.println("Full Dates:");
        regexFinder("((In )|(in )|(On )|(on )|(As of )|(as of ))?(((In )|(in ))|(January|February|March|April|May|June|July|August|September|October|November|December)) ?([0-9]{1,2})?,? ?[0-9]{1,4}",input);  
        System.out.println("Partial:");
        
        
        for(int i=0;i<fullWords.size();i++)
        	regexDates(2,"(((January|February|March|April|May|June|July|August|September|October|November|December) ?([0-9]{1,2})?,? ?[0-9]{1,4})|[0-9]{3,4})",fullWords.get(i));
        
        
        System.out.println("Fully partial:");
        for(int i=0;i<step2Words.size();i++)
        {
        	regexDates(3,"[0-9]{3,4}",step2Words.get(i));
        }
        
        
        arrofDates= new int[finalDates.size()];
        sortedDates = new int[finalDates.size()];
        
        for(int i=0;i<arrofDates.length;i++)
        {
        	arrofDates[i] = Integer.parseInt(finalDates.get(i));
        }
        sortedDates = sort(arrofDates);
        
        System.out.println("Sorted by date: ");
        for(int i = 0; i<sortedDates.length;i++)
        {
        	
        	System.out.println("Date: "+sortedDates[i]);
        	System.out.println("What happened: "+meanings.get(i));
        }
    /*    for(int i = 0; i < timeline.size(); i++){
            System.out.println(timeline.get(i));
            System.out.println(meanings.get(i));
        }*/
    }
    public static void regexDates(int step,String regex, String checker)
    {
    	  Pattern checkRegex = Pattern.compile(regex);
    	    Matcher matchRegex = checkRegex.matcher(checker);
    	    //System.out.println(matchRegex.find());
    	    while(matchRegex.find())
    	    {
    	        if(matchRegex.group().length() != 0)
    	        {
    	            System.out.println(matchRegex.group().trim());
    	        	if(step==2)
    	        	{
    	        		step2Words.add(matchRegex.group().trim());
    	        	}
    	        	else if(step==3)
    	        	{
    	        		finalDates.add(matchRegex.group().trim());
    	        	}
    	        }
    	   
    	        //System.out.println(findSentence(checker, matchRegex.start(), matchRegex.end()));
    	    }
    	  
    }
    public static void regexFinder(String regex, String checker)
    {
        //System.out.println("hello");
    Pattern checkRegex = Pattern.compile(regex);
    Matcher matchRegex = checkRegex.matcher(checker);
    //System.out.println(matchRegex.find());
    while(matchRegex.find())
    {
        if(matchRegex.group().length() != 0)
        {
            System.out.println(matchRegex.group().trim());
        	fullWords.add(matchRegex.group().trim());
        	
        }
   
        System.out.println(findSentence(checker, matchRegex.start(), matchRegex.end()));
        meanings.add(findSentence(checker, matchRegex.start(), matchRegex.end()));
    }
  
 }
    
 
 public static String findSentence(String checker, int start, int end){
     int i;
     for(i = start;  i == 0 || checker.charAt(i) != '.'; i--){}
     int sentenceStart = i;
     for(i = end; i == checker.length()-1 || checker.charAt(i) != '.'; i++){}
     int sentenceEnd = i;
     return checker.substring(sentenceStart+1, sentenceEnd).replace(checker.substring(start, end+1), "");
 }



public static int[] sort(int[] data){
	  int len = data.length;
	  int key = 0;
	  int i = 0;
	  for(int j = 1;j<len;j++){
	    key = data[j];
	    i = j-1;
	    while(i>=0 && data[i]>key){
	      data[i+1] = data[i];
	      i = i-1;
	      data[i+1]=key;
	    }
	  }
	  return data;
	 }}
