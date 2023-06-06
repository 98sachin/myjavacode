package myjava;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		
		//for printing INEURON
		for(int i=0; i<n; i++)
		{
			// for I
			
			for(int j=0; j<n; j++)
			{
				if(j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			// for N
			
			for(int j=0; j<n; j++)
			{
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			// for E
			
			for(int j=0; j<n; j++)
			{
				if(j==0 || i==0 && j<n-1 || i==(n-1)/2 && j<n-1 || i==n-1 && j<n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			//for U
			
			for(int j=0; j<n; j++)
			{
				if(j==0 && i<n-1 || i==n-1 && j>0 && j<n-1 || j==n-1 && i<n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			// for R
			
			for(int j=0; j<n ; j++)
			{
				if((j==0 || i==0 && j<n-1) || (j==n-1 && i<(n-1)/2 && i>0) || (i==(n-1)/2 && j<n-1) || i==j && i>(n-1)/2 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			// for O
			
			for(int j=0; j<n; j++)
			{
				if(j==0 && i>0 && i<n-1 || i==n-1 && j>0 && j<n-1 || j==n-1 && i<n-1 && i>0 || i==0 && j>0 && j<n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			// for N
			
			for(int j=0; j<n; j++)
			{
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		//==================================================
		
		for(int i=0; i<3; i++)
	    {
	    	System.out.println();
	    }
		
		//==================================================
		
		
		n=4;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(i+1);
			}
			System.out.println();
		}
		
		//====================================================
		for(int i=0; i<3; i++)
		{
			System.out.println();
		}
		//====================================================
		
		n=14;
		
		 for(int i=0; i<n; i++)
	        {
			 for(int j=0; j<n; j++)
			 {
				 if(i==0 || j==0|| i==n-1 || j==n-1 ||i+j<=(n-1)/2 || j-i>=(n-1)/2)
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
	    	
	    	//================================================
	    	for(int i=0; i<3; i++)
	    	{
	    		System.out.println();
	    	}
	    	//================================================
	    	
	    n=14;
	    
	    for(int i=0; i<n; i++)
	    {
	    	for(int j=0; j<n; j++)
	    	{
	    	    if(j==0 && i>(n-1)/2 || i==n-1 || j==n-1 && i>(n-1)/2 || i-j>=(n-1)/2 || j+i>=(n-1)+(n-1)/2)
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
	    
    	//================================================
    	for(int i=0; i<3; i++)
    	{
    		System.out.println();
    	}
    	//================================================
    	
    	n=14;
    	
    	for(int i=0; i<n; i++)
    	{
    		for(int j=0; j<n; j++)
    		{
    			if(i==0 || j==0 || i==n-1 || i+j<=(n-1)/2 || i-j>=(n-1)/2)
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
