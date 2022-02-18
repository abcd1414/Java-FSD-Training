class Class {
    void cls()
    {
        System.out.println("class is going on");
    }
}
class Java extends Class{
   void cls()
    {
        System.out.println("java class");
    }
}
class Computer {
    void cls()
    {
        System.out.println("computer class");
    }
}
class Python extends Computer {
    void cls()
    {
        System.out.println("python class");
    }
}
class Main {
    public static void main(String[] args)
    {

       Class obj1 =new Class();
        obj1.cls();
       Class obj2=new Java();
        obj2.cls();
       Computer obj3=new Computer();
        obj3.cls();
       Computer obj4=new Python();
        obj4.cls();
    }
}