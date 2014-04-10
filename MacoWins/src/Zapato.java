
public class Zapato extends Prenda{

	public Zapato ()
	{
		precioBase = 400;	
	}
	
	public double precioBaseReal()
	{
		return (precioBase + (valorModificador*5));
	}

}
