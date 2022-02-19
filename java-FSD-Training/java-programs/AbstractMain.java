abstract class Courses {
abstract void exam();
abstract void treat();
void study(){
System.out.println("study study");
}
class Engg extends Courses{
public void exam() {
System.out.println("writing exam");
}
}
class Doctor extends Courses
{
public void treat() {
System.out.println("take treatement");
}
}
class AbstractMain {
public static void main(String[] args) {
Engg e = new Engg();
Doctor d= new Doctor();
e.exam();
e.treat();
e.study();
}
}