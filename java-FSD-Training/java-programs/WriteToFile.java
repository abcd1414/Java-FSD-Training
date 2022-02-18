import java.io.FileWriter;  
import java.io.IOException;
import java.util.*;
public class WriteToFile
 {
  public static void main(String[] args)
   {
    Scanner sc= new Scanner(System.in);
    String w= sc.nextLine();
    try {
      FileWriter myWriter = new FileWriter("D:demo.txt");
      myWriter.write(w);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
     
    }
  }
  }