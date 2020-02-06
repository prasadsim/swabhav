package passByValue;

public class PassParameter {
	public static void main(String[] args) {
		int RollNo = 1001, Age = 21, Code = 10;
		String Name="Ash";
		display(RollNo,Age,Name);
			
		}

	public static void display(int a, int b, String c) {
		System.out.println(a + "\t" + b + "\t" + c);
	}
	
}
