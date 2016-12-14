package hw;
//In overridden method you can not assign weaker privileges
public class Test3 {
	class A {                                                       
		protected int method1(int a, int b) { return 0; }               
	}                                                               
	
	class b extends A{
//		public int method1(int a, int b) { return 0; }
//		private int method1(int a, int b) { return 0; } //X
		private int method1(int a, long b) { return 0; }  
//		public Long method1(int a, int b) { return 0; }  // X
//		static protected int method1(int a, int b) { return 0; }  // X
	}

}
