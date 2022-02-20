//Write a program to implement throws keyword.

import java.io.*;  
class Throws1{  
 void method()throws IOException
 {  
  throw new IOException("error occur");  
 }  
}  
public class pgm4{  
   public static void main(String args[]){  
    try{  
    Throws1 a=new Throws1();  
    a.method();  
    }catch(Exception e){System.out.println("exception handled");
    }     
  
    System.out.println("Normal flow is Executed");  
  }  
}