package Multithreading;
class Eclips extends Thread {
	
	public void run()
	{
		System.out.println("Eclips id"+Thread.currentThread().getId());
	}
	class Msedge extends Thread
	{
		public void run()
		{
			System.out.println("Msedge id"+Thread.currentThread().getId());
		}
		class outlook extends Thread
		{
			public void run()
			{
				System.out.println("outlook id"+Thread.currentThread().getId());
				
			}
		}
		public class thread
		{
			public static void main(String[]args) {
			Eclips ob=new Eclips();
				ob.start();
			
		
			MSEdge ob1= new MSEdge();
		      ob1.start();
		
		 outlook ob2=new outlook();
		  ob2.start();
	}
	}

	}



}


	
	


