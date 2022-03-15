public class CreateThread
{  
	public static void main(String argvs[])  
	{  
		Thread t= new Thread("My thread");  
		t.start();  
		String str = t.getName();  
		System.out.println(str);  
	}  
}