package eduLessons;

public class Array {

	public static void main(String[] args) {
		
		
	//making some changes on code.
		//int[] arrayOfInteger=new int[]{5,6,7};
		int[] array= {2,4,6,8,10};
		int[][] multidimentionalArray= {{1,2},{3,4},{5,6}};
		
		System.out.println(array[0]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println("size of multidimentional array" +multidimentionalArray[1][1]);
		System.out.println("size of multidimentional array" +multidimentionalArray[1][2]);
        
		
		
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		System.out.println(cars.length);
		
		for (int i = 0; i < cars.length; i++) {
			  System.out.println(cars[i]);
			}
		
		for (String i : cars) {
		  System.out.println(i);
		}
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x); 
		
		for (int i = 0; i < myNumbers.length; ++i) {
		      for(int j = 0; j < myNumbers[i].length; ++j) {
		        System.out.println(myNumbers[i][j]);
		      }
		    }
		

}
}