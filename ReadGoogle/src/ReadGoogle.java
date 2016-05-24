import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ReadGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url=null;
		URLConnection urlc=null;
		try
		{
		url = new URL("http://yahoo.com/");
		urlc= url.openConnection();
		}
		catch(Exception e)
		{
			System.out.println("Cannot connect to the file");
		}
		try(InputStreamReader reader = new InputStreamReader(urlc.getInputStream(),"UTF8");
				BufferedReader br= new BufferedReader(reader);
				FileOutputStream fos= new FileOutputStream("google.html");)
		{
			while(true)
			{
				String readline=br.readLine();
				if(readline!=null)
				{
					fos.write(readline.getBytes());
		
					
				}
				else
				{
					break;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
