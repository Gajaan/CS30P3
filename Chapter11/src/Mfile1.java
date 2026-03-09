import java.io.File;
import java.util.Scanner;

public class Mfile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File textFiles;
Scanner input = new Scanner(System.in);
String fileName;

System.out.println("enter the file name: ");
fileName = input.nextLine();

textFiles = new File(fileName);

if(textFiles.exists()) {
	System.out.println("File exists");
}
else
{
	System.out.println("File does not exist");
}

	}

}
