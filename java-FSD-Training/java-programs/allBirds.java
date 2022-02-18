class Bird{
void sound(){System.out.println("sounds beutiful");
}
}
class Peacock extends Bird{
void fly(){System.out.println("flyyy...");}
}
class girlPeacock extends Peacock{
void dance(){System.out.println("dance...");
}
}
class boyPeacock extends Peacock{
void scream(){System.out.println("scream..");
}}
class allBirds{
	public static void main(String[] args) {
	boyPeacock p=new boyPeacock();
	p.scream();
	p.fly();
	p.sound();
	}
}
