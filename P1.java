public class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());
		for(char i='A';i<='J';i++)
		{
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) 
	{
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();
		
		
	}

}
