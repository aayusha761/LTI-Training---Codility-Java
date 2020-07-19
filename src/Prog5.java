public class Prog5 {
	public static void main(String[] args) {
		fun1(1);
		fun2(1);
		fun3();
	}
	
	public static void fun1(int x) {
		while(x<=10) {
			System.out.println(x);
			x++;
		}
	}
	public static void fun2(int x) {
		do {
			System.out.println(x);
			x++;
		}
		while(x<=10);
	}
	
	public static void fun3() {
		int[] arr = {10,20,30,40};
		for(int no:arr)
			System.out.println(no);
	}
}