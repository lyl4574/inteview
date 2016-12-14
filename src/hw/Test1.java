package hw;
/*字符串在编译过程中，1234和welcome都被编译到了常量池中，在调用changeStr(str)的过程中，
首先将，str的引用传递给了changeStr(保存在在栈里），然后在这里面更改str的值，
		相当于在（栈中将传递给changeStr的引用）的值变化了，但是当changeStr结束之后，
		栈就清空了，因此（原来的引用）并没有发生变化。*/

/*此处应该考察Java方法参数传递特性。Java方法调用中，只存在值传递调用。
此处，实参str是引用变量，由于java方法调用是值传递，所以形参str得到的是实参str的一个拷贝。
此时形参str和实参str均指向字符串"1234"。
然后，在changeStr方法中，形参str指向了一个新的字符串"welcom"，而后方法结束，
形参str被销毁。而实参str仍然指向字符串"1234"。*/
public class Test1 {
	
    public static void changeStr(String str){

        str="welcome";

    }

    public static void main(String[] args) {

        String str="1234";

        changeStr(str);

        System.out.println(str);

    }

}
