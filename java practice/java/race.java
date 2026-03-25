class Counter
{
	int count;
	public synchronized void increment() // synchronized: only one thread can run this at a time — prevents race condition
	{
		count++;
	}
}
class race{
    public static void main(String[] args) throws InterruptedException{   
    	
    	Counter c=new Counter();
    	
    	Runnable obj1=()->  // Lambda Runnable: defines what thread 1 will do
    	{
    		for(int i=1;i<=10000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Runnable obj2=()->  // Lambda Runnable: defines what thread 2 will do
    	{
    		for(int i=1;i<=10000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Thread t1=new Thread(obj1); // Create thread 1 with obj1 task
    	Thread t2=new Thread(obj2); // Create thread 2 with obj2 task
    	 	
    	t1.start(); // Start thread 1 — runs obj1 concurrently
    	t2.start(); // Start thread 2 — runs obj2 concurrently
    	
    	t1.join(); // Main thread waits here until t1 finishes
    	t2.join(); // Main thread waits here until t2 finishes
    	
    	System.out.println(c.count); // Should print 20000 if synchronized correctly
    }
}

    

