import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class main {
	static String wikiT = "Apple_Inc.";
 	static String strURL = "http://en.wikipedia.org/w/api.php?format=json&action=query&titles="+wikiT+"&prop=extracts&rvprop=content";
    
	 public static void main(String[] args) throws IOException {
		 	
		 URL url = new URL(strURL);
		 BufferedReader reader = null;

		 try {
		     reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

		     for (String line; (line = reader.readLine()) != null;) {
		         System.out.println(line);
		     }
		 } finally {
		     if (reader != null) try { reader.close(); } catch (IOException ignore) {}
		 }
	    }
}
