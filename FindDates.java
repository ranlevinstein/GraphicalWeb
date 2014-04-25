import java.util.LinkedList;
import java.util.List;

public class Main1 {
	public static void main()
    {
		// April 1, 1976
		// April-1-,-1976
		List<String> timeline  = new LinkedList<>();
		List<String> meanings = new LinkedList<>();
        String input = "As of May 2013, Apple maintains 408 retail stores. On September 30, 2013, Apple surpassed Coca-Cola to become the world's most valuable brand in the Omnicom Group's 'Best Global Brands' report.";
        input = input.replace(".", " .");
        input = input.replace(",", " ,");
        System.out.println("Input (After minor format changes): \n" +input);
        String[] words = input.split(" ");
        String[] months = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        
        for(int i=1;i<words.length;i++)
        {
            try
            { 
                int a = 0;
                if(isNum(words[i])){a = Integer.parseInt(words[i].replaceAll("[a-zA-Z]",""));}
                for(int j = 0; j < months.length; j++){
                    //System.out.println(words[i-1] + "   ,    " + months[j]);
                	
                	//Date format #1
                	if(words[i-1].equals(","))
                	{
                		
                		try{
                			
                		if(words[i-3].equals(months[j]))
            			{
                			//System.out.println(words[i-3]);
                			for(int d=1;d<32;d++)
                    		{
                				//System.out.println(d+words[i-2]);
                    			if(words[i-2].equals(""+d))
                    			{
                    				//System.out.println("Eureka! "+ d);
                    				
                    				String meaningWords="";
                                	timeline.add(months[j]+","+a);
                                	for(int m=i+1;m<words.length;m++)
                                	{
                                		if(words[m].equals("."))
                                			break;
                                		
                                		else
                                			meaningWords+=words[m]+" ";
                                	}
                                	//System.out.println(meaningWords);
                                	meanings.add(meaningWords);
                    				break;
                    			}
                    		}
            			}
                		
                		}
                		catch (NullPointerException npe)
                		{
                			System.out.println("NULL POINTER");
                		}
                		
                	}
                	
                	
                	//Date format #2
                    if (words[i-1].equals(months[j])){
                    	//if(words[i])
                    	try{
                    	 int b = Integer.parseInt(words[i+2]);
                    	}catch(NumberFormatException nfe)
                    	{
                    	//System.out.println();
                    	String meaningWords="";
                    	timeline.add(months[j]+","+a);
                    	for(int m=i+1;m<words.length;m++)
                    	{
                    		if(words[m].equals("."))
                    			break;
                    		
                    		else
                    			meaningWords+=words[m]+" ";
                    	}
                    	//System.out.println(meaningWords);
                    	meanings.add(meaningWords);
                    	}
                       // System.out.println(months[j]+","+a);
                    }
                }
                
            
            }catch(NumberFormatException nfe)
            {
   
            }
        }
        
        //clean meanings
        for(int i=0;i<timeline.size();i++){
        	if(meanings.get(i).charAt(0) == ',' || meanings.get(i).charAt(1) == ' ')
        	    meanings.set(i, meanings.get(i).substring(2));
        }
        
      System.out.println("Output:");
      System.out.println(timeline.size() + " events happend");
        for(int i=0;i<timeline.size();i++)
        {
        	System.out.print(timeline.get(i));
        	System.out.println(" - "+meanings.get(i));
        }
    }

    public static boolean isNum(String in){
        if(in.contains("1"))return true;
        if(in.contains("2"))return true;
        if(in.contains("3"))return true;
        if(in.contains("4"))return true;
        if(in.contains("5"))return true;
        if(in.contains("6"))return true;
        if(in.contains("7"))return true;
        if(in.contains("8"))return true;
        if(in.contains("9"))return true;
        if(in.contains("0"))return true;
            return false;
    }
}

