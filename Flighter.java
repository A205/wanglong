package 第三天作业1到6;

public class Flighter {
	 public void attack(){
		 System.out.println("Flighter attack.");
	 }
	 public void move() {
		System.out.println("Flighter move.");
	}
	 public static void main(String[] args){
		 Flighter flighter=new Flighter();
		 flighter.attack();
		 flighter.move();
	 }
}
