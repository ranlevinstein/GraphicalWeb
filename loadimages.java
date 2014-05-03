package images;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
//src=.+?".+?"
	static String lastSentence = null;
	static String imgsrc = null;
	//static String strURL ="http://en.wikipedia.org/w/api.php?action=query&titles=Stackoverflow";
	static String originalName = null;
	static String wikiT = "Apple Inc.";
	//
 	static String strURL;
	//static String strURL = "http://www.amazon.com/";
	 public static void main(String[] args) throws IOException {
		 System.out.println(getImage(wikiT));
		 System.out.println(getName());
	    }
	 
	 public static String getImage(String name)
	 {
		 wikiT = name;
		 originalName = wikiT;
		 wikiT = wikiT.replace(" ","_");
		 strURL = "http://en.wikipedia.org/w/api.php?action=parse&format=json&page="+wikiT;
		 wikiT = wikiT.split("_")[0];
		 URL url = null;
		try {
			url = new URL(strURL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 BufferedReader reader = null;
		 //src=.+?".+?"
		 try {
		     try {
				reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		     try {
				for (String line; (line = reader.readLine()) != null;) {
					 if(regexFinder("src=.+?\".+?\"",line,1))
					 {
						 
					 }
				     //System.out.println(line);
				     
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 } finally {
		     if (reader != null) try { reader.close(); } catch (IOException ignore) {}
		 }
		 
		 
		 String trimedName = lastSentence.substring(8, lastSentence.length()-2);
		 //System.out.println(trimedName);
		return trimedName;
	 }
	 
	 public static String getName()//Execute after the function getImage!!!
	 {
		return originalName; 
	 }
	 
	 
	   public static boolean regexFinder(String regex, String checker, int findwhat)
	    {
		   
	        //System.out.println("hello");
	    Pattern checkRegex = Pattern.compile(regex);
	    Matcher matchRegex = checkRegex.matcher(checker);
	    //System.out.println(matchRegex.find());
	    while(matchRegex.find())
	    {
	        if(matchRegex.group().length() != 0)
	        {
	            //System.out.println(matchRegex.group().trim());
	            //fullWords.add(matchRegex.group().trim());
	        	if(findwhat==1)
	        	{
	        		//System.out.println(matchRegex.group().trim());
	        		lastSentence=matchRegex.group().trim();
	        		if(regexFinder(wikiT,matchRegex.group().trim(),2))
	        		{
	        			return true;
	        		}
	        		
	        	}
	        	else if(findwhat==2)
	        	{//We Found MICROSOFT!!!!!!!!!
	        		
	        		
	        		return true;
	        		
	        	}
	        }
	        
	        //System.out.println(findSentence(checker, matchRegex.start(), matchRegex.end()));
	        //meanings.add(findSentence(checker, matchRegex.start(), matchRegex.end()));
	    }
		return false;
	  
	 }
}
