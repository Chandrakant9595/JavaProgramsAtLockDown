package assessment_1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadHTMLContent {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://www.w3schools.com/html/html_responsive.asp");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(url.openStream());
		
		StringBuffer sb = new StringBuffer();
	      while(sc.hasNext()) {
	         sb.append(sc.next());
	         //System.out.println(sc.next());
	      }
	      
	      String result = sb.toString();
	      System.out.println(result);
	      //Removing the HTML tags
	      result = result.replaceAll("<[^>]*>", "");
	      System.out.println("Contents of the web page: "+result);
	}

}
