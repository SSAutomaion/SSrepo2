
public class SquarePerimeter {
	public static void main(String[] args) {

		int n = 5;

		for (int a=1; a<=n; a++ )
         
		{
		for (int b=1; b<=n; b++ )

		{
	    if( a>=2 && b>=2 && a<=4 && b<=4)
	    {
	    	System.out.print("  ");
	    } 
	    else
	    {
	    	System.out.print(" *");
	    }
		  
		}   
		    System.out.println();
		}
	    }
  
}
