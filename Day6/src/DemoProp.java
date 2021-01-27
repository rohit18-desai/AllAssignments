import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DemoProp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop  = new Properties();
		FileReader fr = new FileReader("demo.txt");
		prop.load(fr);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("city"));
		
		
	
		//saving state of an object in file
		//deserailization ---reading state of object from file
		
	}

}
