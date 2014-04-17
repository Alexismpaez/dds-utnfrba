package correctorDeParciales;

public class CriterioReglaDeTres extends CriterioDeCorreccion {

	public double notaFinal(double puntos, double cantidadDePuntosDelExamen) {

		return ((puntos * 10) / cantidadDePuntosDelExamen);
	}

}
