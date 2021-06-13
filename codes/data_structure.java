import java.util.*;


public class data_structure {
	public static void main(String[] args){

	// 1. Array
		//String[] strArr=new String[3];
		double[] fArr = new double[]{2.2,1.1,3.3};
		Arrays.sort(fArr); // sort
		System.out.println("fArr = " + Arrays.toString(fArr));
		System.out.println("1.1 locates at " + Arrays.binarySearch(fArr,1.1)); // 0, 1.1 can be found
		System.out.println("1.5 locates at " + Arrays.binarySearch(fArr,1.5)); // -2, insert at 2nd position, index 1
		float [] fArr2 = new float[]{1.1f,2.2f,3.3f};
		double [] fArr3 = new double[]{1.1,2.2,3.3};
		System.out.println("fArr2 = " + Arrays.toString(fArr2));
		// array1.equals(array2) is the same as array1 == array2, i.e. is it the same array. As @alf points out it's not what most people expect.
		// Arrays.equals(array1, array2) compares the contents of the arrays.
		// System.out.println( "Array equals : " + Arrays.equals(fArr,fArr2) ); // must compare same type of array, compilation fail
		System.out.println( ".equals() : " + fArr.equals(fArr2) ); // false, double with float, will fail
		
		Arrays.fill(fArr,1.0);
		System.out.println("after fill, fArr = " + Arrays.toString(fArr));

		double[] fArrCopy = Arrays.copyOfRange(fArr,0,1);
		System.out.println("fArrCopy = " + Arrays.toString(fArrCopy));

		// Collection
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		Iterator<Integer> it = nums.iterator(); // Get the iterator
		while(it.hasNext()) { // hasNext() & next()
  			System.out.print(it.next());
		}
		System.out.print("\n");

	// 2. ArrayList
		// Way 1: List<Type> obj = new ArrayList<>(Arrays.asList(A, B, ...));
        List<Double> list = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        list.addAll( new ArrayList<Double>( List.of(4.0, 5.0, 6.0) ) );
		System.out.println( "list = " + Arrays.toString(list.toArray()) );
        
        // Way 2: 
        List<Double> listTemp = new ArrayList<>();
        listTemp.add(1.0);
        listTemp.add(2.0);

        System.out.println("listTemp  = " + listTemp.toArray().toString() + " list containsAll = " 
        	+ list.containsAll(listTemp) ); // containsAll
        list.removeAll(listTemp); // removeAll
        System.out.println( "After removeAll, list  = " + Arrays.toString(list.toArray()) );

        // way 3: List<Type> obj = new ArrayList<>(List.of(A, B, ...));
        List<Double> list2 = new ArrayList<>(List.of(1.0, 2.0, 3.0));

        // way 4: use another collection
        List<Double> list3 = new ArrayList<>(list);
        System.out.println("create from another list, list3 = " + Arrays.toString(list3.toArray()));

        // index ArrayList
        System.out.println( "list[0]= " + list.get(0) ); // get the element of a specified index within the list.

        // remove if n can be divided by 3
        System.out.println( "Before removeIf, list= " + Arrays.toString(list.toArray()) ); // [3.0, 4.0, 5.0, 6.0]
        list.removeIf(n -> (n % 3 == 0));
        System.out.println( "After removeIf, list= " + Arrays.toString(list.toArray()) ); // [4.0, 5.0]

        // binarySearch
        int idx = Collections.binarySearch(list,5.0);
        System.out.println( "Binary Search 5.0, idx = " + idx);
	}
}