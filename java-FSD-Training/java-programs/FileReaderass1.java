import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
public class FileReaderass1
{
	public static void main(String[] args) throws IOException
	{
	
	FileReader f =new FileReader("D:AssignmentfileCreate.txt");
	int i;
	BufferedReader b= new BufferedReader(f);
	while((i=b.read())!=-1)
	{
		System.out.println((char)i);

	}
	b.close();
	Scanner sc=new Scanner(f);
	StringBuffer s=new StringBuffer();
	while(sc.hasNext())
	{
		s.append(" "+sc.nextLine());
	}
	System.out.println(s);
	f.close();
	
	}
}