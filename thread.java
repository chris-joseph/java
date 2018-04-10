import java.io.*;
class tre implements Runnable
{
	public void run()
	{
		try
		{
			System.out.println("thread starts");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" thread restarts");
		}catch(Exception e){System.out.println(e.getMessage());}
	}
}
class thread 
{
	public static void main(String[] args) {
		Thread t1= new Thread(new tre());
		Thread t2= new Thread(new tre());
		Thread t3= new Thread();
		t1.start();
		System.out.println("t1 starts");
		try{
		Thread.sleep(1000);
	    }catch(Exception e){System.out.println("e.getMessage()");}
		t2.start();
		System.out.println("t2 starts");
		try{
		t2.join();
		System.out.println("t2 join");
		t1.join();
		System.out.println("t1 join");
	     }catch(Exception e){System.out.println(e.getMessage());}
	     t3.start();
	     System.out.println("t3 starts");

	}
}