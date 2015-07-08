package 第三天作业1到6;

public class WarShip {
	public void attack(){
		 System.out.println("WarShip attack.");
	 }
	 public void move() {
		System.out.println("WarShip move.");
	}
	 public static void main(String[] args){
		 WarShip warShip=new WarShip();
		 warShip.attack();
		 warShip.move();
	 }
}
