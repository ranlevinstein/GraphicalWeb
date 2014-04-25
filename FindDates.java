import java.util.LinkedList;
import java.util.List;

public class main {
	public static void main(String []args)
    {
		// April 1, 1976
		// April-1-,-1976
		List<String> timeline  = new LinkedList<>();
		List<String> meanings = new LinkedList<>();
        String input = "As of May 2013, Apple maintains 408 retail stores. On April 1, 1976 Apple Computers was founded by Steve Jobs and Steve Wozniak.";
        
        input = input.replace(".", " .");
        input = input.replace(",", " ,");
        System.out.println("Input (After minor format changes): \n" +input);
        String[] words = input.split(" ");
        String[] months = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        
        for(int i=1;i<words.length;i++)
        {
            try
            { 
                int a = Integer.parseInt(words[i]);
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
        
        
        System.out.println("Output:");
        for(int i=0;i<timeline.size();i++)
        {
        	System.out.print("Date: "+timeline.get(i));
        	System.out.println(" -What happened: "+meanings.get(i));
        }
      
    }
}

