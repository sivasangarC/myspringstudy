// class Z
// {
	
// }

// class A implements Runnable
// {
// 	public void run()
// 	{
// 		for(int i=1;i<=5;i++)
// 		{
// 			System.out.println("Hi");
// 			try {
// 				Thread.sleep(10);
// 			}catch(InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }

// class B implements Runnable
// {
// 	public void run()
// 	{
// 		for(int i=1;i<=5;i++)
// 		{
// 			System.out.println("Hello");
// 			try {
// 				Thread.sleep(10);
// 			}catch(InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }

class runnable{
    public static void main(String[] args) throws NumberFormatException {   
    	
//    	A obj1=new A();
//    	B obj2=new B();
//    	Runnable obj1=new A();
//    	Runnable obj2=new B();
    	
    	
//    	Runnable obj1=new Runnable()
//    	{
//    		public void run()
//    		{
//    			for(int i=1;i<=5;i++)
//    			{
//    				System.out.println("Hello");
//    				try {
//    					Thread.sleep(10);
//    				}catch(InterruptedException e) {
//    					e.printStackTrace();
//    				}
//    			}
//    		}
//   		};
    	//annonymous class for lamba function it always uses in functiona; interface
        //class can be created with reference object

    	Runnable obj1=()->
    	class Z
{
	
}

class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Demo {
    public static void main(String[] args) throws NumberFormatException {   
    	
//    	A obj1=new A();
//    	B obj2=new B();
//    	Runnable obj1=new A();
//    	Runnable obj2=new B();
    	
    	
//    	Runnable obj1=new Runnable()
//    	{
//    		public void run()
//    		{
//    			for(int i=1;i<=5;i++)
//    			{
//    				System.out.println("Hello");
//    				try {
//    					Thread.sleep(10);
//    				}catch(InterruptedException e) {
//    					e.printStackTrace();
//    				}
//    			}
//    		}
//   		};
    	 
    	Runnable obj1=()->
    	 {
    		for(int i=1;i<=5;i++)
    		{
    			System.out.println("Hi");
    			try {Thread.sleep(10);
                    
                }catch(InterruptedException e) {e.printStackTrace();}
    		}
    	 };
    	
    	Runnable obj2=()->
    	{
    		for(int i=1;i<=5;i++)
    		{
    			System.out.println("Hello");
    			try {Thread.sleep(10);}catch(InterruptedException e) {e.printStackTrace();}
    		}
    	};
    	
    	Thread t1=new Thread(obj1);
    	Thread t2=new Thread(obj2);
    	 	
    	t1.start();
    	t2.start();
    }
    
}
    	
    	Runnable obj2=()->
    	{
    		for(int i=1;i<=5;i++)
    		{
    			System.out.println("Hello");
    			try {Thread.sleep(10);}catch(InterruptedException e) {e.printStackTrace();}
    		}
    	};
    	
    	Thread t1=new Thread(obj1);
    	Thread t2=new Thread(obj2);
    	 	
    	t1.start();
    	t2.start();
    }
    
}
//by using annanums class reduce the line of code this is easy to code
//threads