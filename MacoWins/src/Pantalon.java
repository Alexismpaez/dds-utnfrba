
public class Pantalon extends Prenda{

	public Pantalon ()
	{
		precioBase = 250;	
	}
	
	public double precioBaseReal()
	{
		return (precioBase + valorModificador);
	}
	
}
