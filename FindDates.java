public class main {
	public static void main(String []args)
	{
		String input = "As of May 2013, Apple maintains 408 retail stores";
		String []convert=input.split(",");
		input = convert.toString();
		System.out.println(input);
		String[] splited = input.split(" ");
		
		for(int i=0;i<splited.length;i++)
		{
			try
			{
				
			int z=Integer.parseInt(splited[i]);
			System.out.println(z);
			
			}catch(NumberFormatException nfe)
			{
			
			}
			
			
		}
		
		
	}
}


