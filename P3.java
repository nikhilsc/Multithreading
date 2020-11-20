public class ThreadSync implements Runnable
{
		synchronized public void run()
		{
			System.out.println(Thread.currentThread());
			for(int i=0;i<=5;i++)
			{
				System.out.println("Exec"+i);
			}
		}
		
		
		public static void main(String[] args) 
		{
			
			ThreadSync t = new ThreadSync();
			
			Thread t1 = new Thread(t);
			Thread t2 = new Thread(t);
			Thread t3 = new Thread(t);
			
			t1.setName("First");
			t2.setName("Second");
			t2.setName("Third");
			t1.start();
			t2.start();
			t3.start();
			
			
		}

	}
