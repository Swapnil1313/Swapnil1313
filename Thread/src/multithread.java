class Multithreading extends Thread {
	public void run()
	{
		try 
		{
			System.out.println("Hello All " );           
		}
		catch (Exception e) 
		{
			System.out.println("Exception is caught");
		}
	}
}


public class multithread 
{
	public static void main(String[] args)
	{
		int n = 5; 
		for (int i = 0; i < n; i++) {
			Multithreading object
				= new Multithreading();
			object.start();
		}
	}
}
