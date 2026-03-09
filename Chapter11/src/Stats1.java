import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

public class Stats1 {

	public static void main(String[] args) {
		
		File textFiles;
		File dataFile= new File("../Chapter11/src/test.txt");
		FileReader in;
		BufferedReader readFile;

		String stName, score;
		
		double scorevalue;
		double lowscore=100;
		double highscore=0;
		double avgScore;
		int numscores =0;
		double totalScore = 0;
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		try
		{
			in= new FileReader(dataFile);
			readFile= new BufferedReader(in);
			while((stName = readFile.readLine()) !=null) {
				
				score=readFile.readLine();
				System.out.println(stName +""+score);
				numscores +=1;
				scorevalue=Double.parseDouble(score);
				totalScore = scorevalue;
				
				if(scorevalue<lowscore) {
					lowscore=scorevalue;
					if(scorevalue > highscore) {
						highscore=scorevalue;
					}
					
				
				}
				
			}
			
			
			avgScore=totalScore/numscores;
			System.out.println("low score =" +percent.format(lowscore/100));;
			System.out.println("highscore= "+percent.format(highscore/100));
			System.out.println("average score="+percent.format(avgScore/100));
			
			readFile.close();
			in.close();
			
		}
	catch(FileNotFoundException e) {
		
		System.out.println("File does not exist");
		System.err.println("FileNotFoundException" +e.getMessage());
	}
		catch(IOException e) {
			System.out.println("Problem  reading files");
			System.err.println("IOException"+e.getMessage());
		}
		
		
	}

}
