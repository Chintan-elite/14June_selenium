
class Pen
{
	int price = 10;
	String color = "Red";
	String company = "SS";
	
	public void toWrite()
	{
		System.out.println(price+" "+company+" "+color);
	}
}


public class Demo {
	public static void main(String[] args) {
		
		
		System.out.println("hello java");
		
		Pen p = new Pen();
		p.toWrite();
		
	}
}
