package work;

public class Machine{
	private int age;
	private String name;
	private static float tcount=0f;
	public Machine() {
		this("Deflaut",0);
	}
	public Machine(String name,int age) {
		System.out.println("Machine Created");
		this.name=name;
		this.age=age;
		tcount++;
	}
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Age is ").append(this.age).append(" Name is ").append(this.name);
		return sb.toString();
	}
	public static void displaycount(){
		System.out.printf("%-5.2f", tcount);
	}
	public void setMachine(String name,int age) {
		System.out.println("Set Machine Name to "+name+" and Age to "+age);
		this.setName(name);
		this.setAge(age);
	}
 	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
}