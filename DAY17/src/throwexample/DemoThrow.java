package throwexample;

public class DemoThrow {
void validate(int age) {
	if(age<18)
		throw new ArithmeticException("not eligible" );
	else
		System.out.println("eligible");
}
public static void main(String[]args)
{
	DemoThrow dt=new DemoThrow();
	dt.validate(12);
}
}
