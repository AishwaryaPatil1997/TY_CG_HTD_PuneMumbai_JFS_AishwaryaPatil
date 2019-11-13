
public class TestATM 
{
	public static void main(String[] args) 
	{
		ICICI i = new ICICI();

		Machine m = new  Machine();

		m.slot(i);
	}
}
