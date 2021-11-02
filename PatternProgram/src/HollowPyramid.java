
public class HollowPyramid {
	public static void main(String[] args) {
		
		for (int a=1; a<=4; a++ )
		
		{
		for (int b=1; b<=7; b++ )
			{
			
		if ( a==4 || a+b==5 || b-a==3)
          {
		System.out.print("*");
		}
		
          else
		 {

	     	System.out.print(" ");
		  }
	      }
		     System.out.println();
		}
		}
}
