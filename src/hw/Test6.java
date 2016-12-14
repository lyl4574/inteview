package hw;
// 方法名可以和构造方法同名
public class Test6 {
	Test6(){
		System.out.println("df");
	}
	private int Test6(){
		System.out.println("df1");
		return 4;
	}
	public static void main(String[] args) {
		new Test6().Test6();
	}
}
