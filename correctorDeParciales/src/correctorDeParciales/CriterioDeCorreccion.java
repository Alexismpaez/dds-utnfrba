package correctorDeParciales;


// Si no hay comportamiento general, por qu� es una clase abstracta? 
public abstract class CriterioDeCorreccion {

	public abstract double notaFinal(double puntos,
			double cantidadDePuntosDelExamen);

}
