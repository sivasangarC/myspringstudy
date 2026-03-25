class exceptionthrow {
    public static void main(String[] args) {
    	
//    	int i=2;
    	int i=0;
    	int j=0;
 
    	
    	try
    	{
    		j=18/i;
    		if(j==0)
    			throw new ArithmeticException("I don't want to do print zero"); // Manually throw exception with custom message
    	}
    	catch(ArithmeticException e) // Catches divide-by-zero or manually thrown ArithmeticException
    	{
    		j=18/i;
    		System.out.println("that is default output"+e);
    	}
    	
    	catch(Exception e) // Catches any other exception not caught above (parent of all exceptions)
    	{
    		System.out.println("Something went wrong."+e);
    	}
    	System.out.println(j);
    	System.out.println("Bye");
    }
}
