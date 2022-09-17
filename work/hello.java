package work;
import java.util.Scanner;
import scr1.Car;
import java.util.ArrayList;//Generics and Wildcards(?)
public class hello {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<Machine> mlist=new ArrayList<Machine>();
		ArrayList<Car> clist=new ArrayList<Car>();
		clist.add(new Car());
		clist.add(new Car(12));
		mlist.add(new Machine("m1",12));
		mlist.add(new Machine());
		showlist(mlist);
		showlist1(clist);
		showlist2(clist);
		showlist2(mlist);
		
		showlist3(clist);
		input.close();
	}
	public static void showlist(ArrayList<Machine> list) {
		for(Machine value:list) {
			System.out.println(value.toString());
		}
				}
	//WildCard
			public static void showlist1(ArrayList<?> list) {
				for(Object value:list) {
					System.out.println(value);
				}			
	}
			public static void showlist2(ArrayList<? extends Machine> list) {
				for(Machine value:list) {
					System.out.println(value.getAge());
				}			
	}
			public static void showlist3(ArrayList<? extends Car> list) {
				for(Car value:list) {
					System.out.println(value.getnum());
				}			

			}
}

