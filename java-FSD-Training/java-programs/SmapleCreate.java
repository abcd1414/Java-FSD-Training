import java.io.FileWriter;
import java.io.IOException;
public class SmapleCreate
{
	public static void main(String[] args) throws IOException
	{
	String str="hello iam here";
	String str1="Playground";
	String file="D:NewOutput.txt";

	FileWriter f =new FileWriter(file);
	for(int i=0;i<str.length();i++)
	{
		f.write(str.charAt(i));
	}

	char[] c={'a','b','c','d'};
	f.write(c); //used to write char array into file writer
	f.write(str1,0,3);//write the portion of string
	f.append(str, 2,6);//appending porion of th string
	f.write('a');//write a single chracter
	System.out.println(f.getEncoding());//return the default character
	f.flush();
	f.close();
	System.out.println("finished writting");
	}
}