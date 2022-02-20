//3 Create two arraylist of strings to take First_name and Last_name of the students, and print their whole name.


import java.util.ArrayList;  
class ArrayListName
{  
 public static void main(String args[])
 {  
  ArrayList<String> fname=new ArrayList<String>();  
  ArrayList<String> lname=new ArrayList<String>();
  ArrayList<String> wname=new ArrayList<String>();
  fname.add("Pooja");  
  fname.add("Meera");  
  fname.add("Ram"); 
  lname.add("Raj");  
  lname.add("Shree");  
  lname.add("Kumar"); 
  for(int i=0;i<fname.size(); i++)
  {
  	wname.add(fname.get(i)+" "+lname.get(i));
  }
  System.out.println("full name:");
  System.out.println();
  for(String i:wname)
  {
  	System.out.println(i);
  }
 }  
}  