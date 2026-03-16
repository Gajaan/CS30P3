import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Mfile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File textFiles;
		String fileName;
		Scanner input = new Scanner(System.in);
		
		
		textFiles = new File("../Chapter11/src/zzz.txt");
		if(textFiles.exists()) {
			System.out.println("zzz.txt File exists");
		}
		else
		{
			try {
				textFiles.createNewFile();
			}
			catch(IOException e)
			{
				System.out.println("File could not be created");
				System.err.println("IOException" +e.getMessage());
			}
			
			System.out.println("Would you like to keep (k) or delete (d) the file");
			String response = input.next();
			
			if(response.equalsIgnoreCase("d")) {
				if(textFiles.delete()) {
					System.out.println("zzz.text file deleted");
					
				}
				
			}
			else {
				System.out.println("zzz.text is kept");
			}
			
		}
	}
	
}
