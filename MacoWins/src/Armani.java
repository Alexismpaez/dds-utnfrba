
public class Armani extends Marca{
	
	public double modificador(double pBase)
	{
		if (pBase > 500) {
			coeficiente = pBase*0.35;
			}
		else
			{
			coeficiente = pBase*0.10;
			}
		return coeficiente;
	}

}
