package eduLessons;

public class Calculator {

	
	public int add(int arg1, int arg2) {
		arg1=100;
		int results= arg1+arg2;
		return results;
	}
	public int add(int arg1, int arg2, int arg3) {
		arg1=100;
		int results= arg1+arg2+arg3;
		return results;
	}

	public static void main(String[] args) {
	Calculator cal=new Calculator();
	int arg1=10;
	int arg2=30;
	int arg3=40;
	int result=arg1+arg2+arg3;
	System.out.println("printing arg1 before passing it by value:"+result);
	
	int results=cal.add(10,30);
	System.out.println("result of addition is: "+ results);

    int result2=cal.add(10,30,40);
	System.out.println("result of addition is: "+ result2);

	}

}
