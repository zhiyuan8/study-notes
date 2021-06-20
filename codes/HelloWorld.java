import java.util.*;

// public class FreshJuice {
//    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
//    FreshJuiceSize size = FreshJuiceSize.SMALL; // default value
// }

// public class Test {
//    int x = 0;
//    Test(){}
//    Test(int i){ x=i;}
// }

public class HelloWorld {
	public static void main(String[] args){

		System.out.println("Hello World");
		// FreshJuice juice = new FreshJuice();
		// juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		// System.out.println("Fresh Juice size = " + juice.size);

		// Integer Array <=> Integer List
		// method 1, add
		int[] array = new int[] { 1, 2, 3 }; // use []
		List<Integer> arrayList = new ArrayList<>(); // use <>
		for (int a:array){
			arrayList.add(a);
		}
		System.out.println( Arrays.toString( ( arrayList.toArray() ) ) );

		// method 2, Arrays.asList(), only works for hard-typed constructor
		List<Integer> arrayList2 = Arrays.asList(1,2,3); // change from Array to List
		System.out.println( Arrays.toString( ( arrayList2.toArray() ) ) );

		// method 3, 1-line solution, use stream
		// List<Integer> arrayList3 = Arrays.stream(array).boxed().collect(Collectors.toList()); // java.util.stream
		// System.out.println(arrayList3.toArray().toString());

		// Integer List <=> Integer array
		// method 1: get
		int[] array2 = new int[3];
		for (int i=0; i<arrayList2.size(); i++){
			array[i] = arrayList.get(i);
		}
		System.out.println( Arrays.toString( ( array ) ) );

		// method 2: 


	}
}
