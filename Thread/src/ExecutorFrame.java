
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable
{
	private int num;
	
	public Task(int s)
	{
		num = s;
	}
	
	public void run()
	{
		try
		{
			for (int i = 0; i<=10; i++)
			{
				Thread.sleep(1000);
			}
			System.out.println("Number: " + num);
			System.out.println("Executing : " + num);
		}
		
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class ExecutorFrame
{
	
	static final int MAX_T = 5;			

	public static void main(String[] args)
	{
		
		Runnable r1 = new Task(1);
		Runnable r2 = new Task(2);
		Runnable r3 = new Task(3);
		Runnable r4 = new Task(4);
		Runnable r5 = new Task(5);
		Runnable r6 = new Task(6);
		Runnable r7 = new Task(7);
		Runnable r8 = new Task(8);
		Runnable r9 = new Task(9);
		Runnable r10 = new Task(10);
		
	
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		pool.execute(r6);
		pool.execute(r7);
		pool.execute(r8);
		pool.execute(r9);
		pool.execute(r10);
		
		pool.shutdown();	
	}
}