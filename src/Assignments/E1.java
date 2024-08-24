/*1. How to create a class, object, method and its signature*/

package Assignments;

//creating a class

public class E1 {
	//method and its signature
	
	public void value(int a)
	{
		System.out.print("value:"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an object
		E1 obj = new E1();
		
		//calling the method
		obj.value(20);
	}

}
