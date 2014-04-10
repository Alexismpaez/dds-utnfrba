
public class Sombrero extends Prenda{

	public Sombrero ()
	{
		precioBase = 150;	
	}
	
	public double precioBaseReal()
	{
		return (precioBase + valorModificador);
	}

}
