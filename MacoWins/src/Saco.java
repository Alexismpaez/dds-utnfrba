
public class Saco extends Prenda {

	public Saco ()
	{
		precioBase = 300;	
	}
	
	public double precioBaseReal()
	{
		return (precioBase + (valorModificador*10));
	}
	
}
