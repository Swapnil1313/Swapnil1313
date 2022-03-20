class RunThread implements Runnable
{  
	public void run()
	{  
		System.out.println("thread is running...");  
	}  
  
	public static void main(String args[])	
	{  
		RunThread m1=new RunThread();  
		Thread t1 =new Thread(m1); 
		t1.start();  
	}  
}  