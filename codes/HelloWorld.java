import java.util.*;

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

		// List to Array
		// List<Integer> courseList = new LinkedList<>(Arrays.asList(1, 2, 3));
		// int[] numbers = new int[courseList.size()];
		
		// // numbers = courseList.toArray(); //  Since primitives can't be used as generic arguments, toArray can't return int[]
		// System.out.println(numbers);

		// // Linkedlist to ArrayList
		// Object[] a = new ArrayList<>(courseList);
		// List<Integer> courseList2 = Arrays.toString(a);
		// System.out.println(courseList2);


	}
}
