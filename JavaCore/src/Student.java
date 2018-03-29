
public class Student {
	public String name = "Hieu";
	public int age = 26;
	public void showStudent() {
		System.out.println("Name " + name);
		System.out.println("Age " + age);
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.showStudent();
	}
}
