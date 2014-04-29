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
        String input = "In 1987 Gates was listed as a billionaire in Forbes magazine's 400 Richest People in America issue, just days before his 32nd birthday. As the world's youngest self-made billionaire, he was worth $1.25 billion, over $900 million more than he'd been worth the year before, when he'd debuted on the list.[104] Time magazine named Gates one of the 100 people who most influenced the 20th century, as well as one of the 100 most influential people of 2004, 2005, and 2006. Time also collectively named Gates, his wife Melinda and U2's lead singer Bono as the 2005 Persons of the Year for their humanitarian efforts.[105] In 2006, he was voted eighth in the list of Heroes of our time.[106] Gates was listed in the Sunday Times power list in 1999, named CEO of the year by Chief Executive Officers magazine in 1994, ranked number one in the Top 50 Cyber Elite by Time in 1998, ranked number two in the Upside Elite 100 in 1999 and was included in The Guardian as one of the Top 100 influential people in media in 2001.[107] According to Forbes, Gates was ranked as the fourth most powerful person in the world in 2012,[108] up from fifth in 2011.[109] In 1994, he was honored as the twentieth Distinguished Fellow of the British Computer Society. Gates has received honorary doctorates from Nyenrode Business Universiteit, Breukelen, The Netherlands, in 2000;[110] the Royal Institute of Technology, Stockholm, Sweden, in 2002;[111] Waseda University, Tokyo, Japan, in 2005; Tsinghua University, Beijing, China, in April 2007;[112] Harvard University in June 2007;[113] the Karolinska Institutet, Stockholm, in January 2008,[114] and Cambridge University in June 2009.[115] He was also made an honorary trustee of Peking University in 2007.[116] Gates was made an honorary Knight Commander of the Order of the British Empire (KBE) by Queen Elizabeth II in 2005.[117] He and his wife were awarded the Order of the Aztec Eagle in November 2006 for their philanthropic work around the world in the areas of health and education, particularly in Mexico, and specifically in the program Un país de lectores.[118] Gates received the 2010 Bower Award for Business Leadership from The Franklin Institute for his achievements at Microsoft and his philanthropic work.[119] Also in 2010 he was honored with the Silver Buffalo Award by the Boy Scouts of America, its highest award for adults, for his service to youth.[120] Entomologists named Bill Gates' flower fly, Eristalis gatesi, in his honor in 1997.[121]";
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
     for(i = start;  i > -1 && checker.charAt(i) != '.'; i--){}
     int sentenceStart = i;
     for(i = end; i < checker.length() && checker.charAt(i) != '.'; i++){}
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
