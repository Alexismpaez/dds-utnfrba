package correctorDeParciales;

public class CriterioRestaPuntos extends CriterioDeCorreccion {
	public int puntosARestar;

	public CriterioRestaPuntos(int puntos) {
		puntosARestar = puntos;
	}

	public double notaFinal(double puntos, double cantidadDePuntosDelExamen) {

		return (puntos - puntosARestar);
	}
}
