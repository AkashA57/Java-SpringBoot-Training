package joker;

public class MahaJoker extends Joker{
	
	public void dance()
	{
		System.out.println("Joker can dance in night only");
	}
	
	public void hey() 
	{
		dance();
		this.dance();
		super.dance();
	}
}
