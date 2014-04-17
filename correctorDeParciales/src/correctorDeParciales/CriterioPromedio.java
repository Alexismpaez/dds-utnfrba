package correctorDeParciales;

import java.util.ArrayList;
import java.util.List;

public class CriterioPromedio extends CriterioDeCorreccion {

	public List<CriterioDeCorreccion> criterios = new ArrayList<CriterioDeCorreccion>();

	public CriterioPromedio(List<CriterioDeCorreccion> criteriosAUsar) {
		criterios = criteriosAUsar;
	}

	public double notaFinal(double puntos, double cantidadDePuntosDelExamen) {
		// No me funciona todo lo que es stream() así que queda pendiente
		// hacerlo bien.
		double acumulador = 0;

		for (int i = 0; i < criterios.size(); i++) {

			acumulador += criterios.get(i).notaFinal(puntos,
					cantidadDePuntosDelExamen);
		}

		acumulador = acumulador / criterios.size();

		return acumulador;

	}

}
