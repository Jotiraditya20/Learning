package scr1;
import work.Machine;
public class Car extends Machine {
	private int carno;
	public Car() {
		System.out.println("Car created");
		carno=0;
	}
	public Car(int x) {
		System.out.println("Car created");
		carno=x;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("CArno:").append(carno);
		return sb.toString();
		
	}
	public int getnum() {
		return this.carno;
	}

	public static void main(String[] args) {
		Machine m3=new Machine();
		Car c1=new Car();
		c1.setMachine("Hello", 63);
		Machine.displaycount();
		System.out.println("\n"+m3.toString());
	}

}
