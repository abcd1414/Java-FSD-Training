import java.io.FileWriter;
import java.io.IOException;
public class SmapleCreate2
{
	public static void main(String[] args) throws IOException
	{
	String str="This is just some sample content for writting into a file";
	FileWriter f =new FileWriter("D:sampleoutWritter.txt");
	for(int i=0;i<str.length();i++)
	{
		f.write(str.charAt(i));
	}
    f.write("\n");
	char[] arr={'a','b','c','d','e','f','g','h','i'};
	f.write(arr); 
	f.write("\n");
	f.write(arr, 1,5);
	f.write("\n");
	f.write(str, 6,14);
	f.write("\n");
	
	System.out.println("finished writting");
	f.close();
	}
}