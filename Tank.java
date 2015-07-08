package 第三天作业1到6;

public class Tank extends Weapon{
	 public void attack(){
		 System.out.println("Tank attack.");
	 }
	 public void move() {
		System.out.println("Tank move.");
	}
	 public static void main(String[] args){
		Tank tank=new Tank();
		tank.attack();
		tank.move();
	 }
}
