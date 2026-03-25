class A extends Thread{  // Extending Thread class — run() defines what this thread does
    public  void run()
    {
        for(int i=1;i<5;i++)
            {
                System.out.println("hi");
                try {
                    Thread.sleep(10); // Pause this thread for 10ms — lets other thread get CPU time
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }
}
}
class B extends Thread{  // Second thread class — runs independently from A
    public  void run()
    {
        for(int i=1;i<5;i++)
            {
                System.out.println("hello");
    }
}
}
class thread{
    public static void main(String[] args) {
        A o1=new A();
        B ob2=new B();
        o1.start();  // start() creates a new thread and calls run() — do NOT call run() directly
        try {
                    Thread.sleep(2); // Small delay so t1 gets a head start before t2 begins
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        ob2.start(); // Start second thread — both threads now run concurrently
        
    }
}