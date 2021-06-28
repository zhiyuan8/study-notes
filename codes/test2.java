import java.util.*;

public class test2 {
	
	public class Data {
		int x;
		int y;
		public Data(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	Data createData(int x, int y){
		return new Data(x,y);
	}

	public static void main(String[] args){
        test2 test = new test2(); // way 2: step 1, create an instance of own class
		Data data = test.createData(1,2); //  way 2: step 2, use method to create Data class
	}
}