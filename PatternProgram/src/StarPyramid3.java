
public class StarPyramid3 {
	 public static void main(String args[])
	   {
	       int row = 5;
	       for (int a=1; a<=row; a++ )
	   {
	       for (int b=row; b>=a; b-- )
	   {
	       System.out.print(" ");
	   }
	       for (int b=1; b<=a ; b++ )
	   {
	       System.out.print(" *");
	   }
	       System.out.println();
	   }
	     
	   }
}
