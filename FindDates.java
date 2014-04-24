public class main {
	public static void main(String []args)
    {
        String input = "As of May 2013, Apple maintains 408 retail stores";
        input = input.replace(".", "  .");
        input = input.replace(",", " ,");
        String[] splited = input.split(" ");
        for(int i=0;i<splited.length;i++)
        {
            try
            { 
                int a = Integer.parseInt(splited[i]);
                System.out.println(a);
            }catch(NumberFormatException nfe)
            {
   
            }
            
   
        }
        System.out.println(input);
    }
}


