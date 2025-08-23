package Multithreading;
//we can create multi threading using
//by extending thread class
//by implementing Runnable interface
public class mythread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("welcome");
		}
		try {
			Thread.sleep(5);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
public class Test extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		try {
			Thread.sleep(5);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
	public static void main(String[] args) throws InterruptedException {
		Test t1=new Test();
		mythread t2=new mythread();
		t1.start();
		t2.join();
		t2.start();
		t1.join();
		
	}

	}
