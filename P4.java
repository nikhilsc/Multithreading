public class ClassLockDemo implements Runnable
{
	@Override
	public void run() {
		disp();
		
	}
	synchronized static void disp()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
	

	public static void main(String[] args) 
	{
		ClassLockDemo c1= new ClassLockDemo();
		ClassLockDemo c2= new ClassLockDemo();
		Thread t1= new Thread(c1);
		Thread t2= new Thread(c2);
		t1.start();
		t2.start();

	}

}
