//import java.java.util.*

class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
   FreshJuiceSize size = FreshJuiceSize.SMALL; // default value
}

class Test {
   int x = 0;
   Test(){}
   Test(int i){ x=i;}
}

public class HelloWorld {
	public static void main(String[] args){

		System.out.println("Hello World");
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("Fresh Juice size = " + juice.size);

	}
}
