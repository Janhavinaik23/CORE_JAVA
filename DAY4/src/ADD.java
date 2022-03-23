
public class ADD {
	 public void add(int x,int y) 
	 {      System.out.println("Add is"+(x+y));  
	 }     public void add(int x,int y,int z)  
	 {      System.out.println("Add is"+(x+y+z));   
	 }     public void add(int x,int y,int z,int q)  
	 {      System.out.println("Add is"+(x+y+z+q));   
	 }     public static void main(String[] args)    
	 {       ADD ob=new ADD();     
	 ob.add(5,5);   
	 ob.add(5,5,5); 
	 ob.add(5,5,6,8);  
	 }
}


