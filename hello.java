package work;
import java.util.Scanner;
public class hello {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		int num=input.nextInt();
		Machine m1=new Machine();
		Machine m2=new Machine(name,num);
		m2.setMachine("Hello",12);
		num= m1.getAge();
		Machine.displaycount();
		System.out.println(m2);
		//Casting 
		int val=2004;
		double dval=192.12;
		val=(int)dval;
		System.out.println(val);
	}
}
