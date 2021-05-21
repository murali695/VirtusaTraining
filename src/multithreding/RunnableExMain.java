package multithreding;

public class RunnableExMain extends RunnableEx
{
	public static void main(String args[])
	{
		RunnableExMain r1=new RunnableExMain();
		RunnableExMain r2=new RunnableExMain();
		Thread t1=new Thread(r1);
		t1.start();
		Thread t2=new Thread(r2);
		t2.start();
		
	}

}
