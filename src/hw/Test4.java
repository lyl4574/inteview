package hw;
//Which instantiates an instance of Inner?
//
//A. new Inner(); // At line 3
//
//B. new Inner(); // At line 8
//
//C. new o.Inner(); // At line 8
//
//D. new Outer.Inner(); // At line 8//new Outer().new Inner()
public class Test4{

	 public void someOuterMethod() {

		 new Inner();

	 }

	 public class Inner{}

	 public static void main( String[]argv ) {

		 Test4 o = new Test4();

		Inner in = o.new Inner();
		new Test4().new Inner();

	 }

	 }
