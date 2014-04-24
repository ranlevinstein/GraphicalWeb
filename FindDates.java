public class main {
	public static void main(String []args)
    {
        String input = "As of May 2013, Apple maintains 408 retail stores";
        
        input = input.replace(".", "  .");
        input = input.replace(",", " ,");
        String[] words = input.split(" ");
        String[] months = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        for(int i=1;i<words.length;i++)
        {
            try
            { 
                int a = Integer.parseInt(words[i]);
                for(int j = 0; j < months.length; j++){
                    if (words[i-1] == months[j]){
                        System.out.println(a);
                    }
                }
                
            
            }catch(NumberFormatException nfe)
            {
   
            }
        }
        System.out.println(input);
    }
}


