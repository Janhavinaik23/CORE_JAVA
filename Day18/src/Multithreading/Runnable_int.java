package Multithreading;
class Eclipse implements Runnable {
		
		public void run()
		{
			System.out.println("Eclips id"+Thread.currentThread().getId());
		}
}
		class MSEdge implements Runnable {
		
			public void run()
			{
				System.out.println("MSEdge id"+Thread.currentThread().getId());
			}
			class outlook implements Runnable {
			
				public void run()
				{
					System.out.println("outlook id"+Thread.currentThread().getId());
					
				}
			}
			public class threadExample
			{
				public static void main(String[]args) {
			}
				Eclipse ob=new Eclipse();
				Thread t=new Thread(ob);
					t.start();
				
			
				MSEdge ob1=new MSEdge();
				Thread t1=new Thread(ob1);
			      t1.start();
			
			 outlook ob2=new outlook();
			 Thread t2=new Thread(ob2);
			    t2.start();
		
		

		
	}
			public void start() {
				// TODO Auto-generated method stub
				
			}
		
}


