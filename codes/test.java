import java.util.*;

public class Test {
	public static void main(String[] args) {
		Data d = new Data(1,2);
	}

	public static class Data { // way 1: add static
		int x;
		int y;
		public Data(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}