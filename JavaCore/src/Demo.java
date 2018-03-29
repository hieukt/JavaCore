
public class Demo {
	private int age;
	private String name;
	
	final private String MY_COUNTRY = "VIETNAM";
	
	public boolean connectDatabase(String address,String username,String password) {
		return true;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		char c = 65;
		System.out.println(c);
		byte b =127;
		System.out.println(b);
		short s = 255;
		System.out.println(s);
		int i = 123456;
		System.out.println(i);
		long l = 45678;
		System.out.println(l);
		float f = 4.5f;
		System.out.println(f);
		double d = 34.5;
		System.out.println(d);
		 
		b = (byte)i;
		System.out.println("i = " + i + "b = " + b);
		Demo demo = new Demo();
		System.out.println(demo.age);
	}
}
