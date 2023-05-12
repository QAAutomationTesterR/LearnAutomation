package javaExercises;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Swapping using third variable
int x;

int y ;

int temp;

x = 5;
y = 9;

 temp = x ;
 
 x = y;
 
 y = temp;
 
 System.out.println(x +" "+ y);
 
 //Swapping not using third variable
 
 x = x+y;
 
 y = x-y;
 
 x=x-y;
	}

}
