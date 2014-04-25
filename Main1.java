import java.util.LinkedList;
import java.util.List;
import java.util.regex.*;

public class Main1 {
	public static void main(String[]args)
    {
		//April 1, 1976
		// April-1-,-1976
		List<String> timeline  = new LinkedList<>();
		List<String> meanings = new LinkedList<>();
        String input = "As of May 2013, Apple maintains 408 retail stores. On September 30, 2013, Apple surpassed Coca-Cola to become the world's most valuable brand in the Omnicom Group's 'Best Global Brands' report.";
        input = input.replace(".", " .");
        input = input.replace(",", " ,");
        System.out.println("Input (After minor format changes): \n" +input);
        String[] words = input.split(" ");
        String[] months = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        //System.out.println(input);
        regexChecker("\\s[0-9]{4}\\s",input);
      
        
      System.out.println("Output:");
      System.out.println(timeline.size() + " events happend");
        for(int i=0;i<timeline.size();i++)
        {
        	System.out.print(timeline.get(i));
        	System.out.println(" - "+meanings.get(i));
        }
    }
	
	public static void regexChecker(String str, String checker)
	{
		//System.out.println("hello");
		Pattern checkRegex = Pattern.compile(str);
		Matcher matchRegex = checkRegex.matcher(checker);
		//System.out.println(matchRegex.find());
		while(matchRegex.find())
		{
			if(matchRegex.group().length() != 0)
			{
				System.out.println(matchRegex.group().trim());
			}
		
			System.out.println("S i: "+ matchRegex.start());
			System.out.println("E i: "+matchRegex.end());
		}
		
	}

}