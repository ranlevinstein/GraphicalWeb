import java.util.LinkedList;
import java.util.List;

public class main {
	public static void main(String []args)
    {
		
		List<String> timeline  = new LinkedList<>();
		List<String> meanings = new LinkedList<>();
        String input = "As of May 2013, Apple maintains 408 retail stores. Bla Bla Bla";
        
        input = input.replace(".", " .");
        input = input.replace(",", " ,");
       // System.out.println("Input: " +input);
        String[] words = input.split(" ");
        String[] months = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        
        for(int i=1;i<words.length;i++)
        {
            try
            { 
                int a = Integer.parseInt(words[i]);
                for(int j = 0; j < months.length; j++){
                    //System.out.println(words[i-1] + "   ,    " + months[j]);
                    if (words[i-1].equals(months[j])){
                    	String meaningWords="";
                    	timeline.add(months[j]+","+a);
                    	for(int m=i+1;m<words.length;m++)
                    	{
                    		if(words[m].equals("."))
                    			break;
                    		
                    		else
                    			meaningWords+=words[m]+" ";
                    	}
                    	System.out.println(meaningWords);
                    	//meanings.add(words)
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
        	System.out.println(" What happened: ");
        }
      
    }
}

