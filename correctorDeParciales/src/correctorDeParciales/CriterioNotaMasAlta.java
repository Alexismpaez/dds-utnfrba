package correctorDeParciales;

import java.util.ArrayList;
import java.util.List;

public class CriterioNotaMasAlta extends CriterioDeCorreccion {

	public List<CriterioDeCorreccion> criterios = new ArrayList<CriterioDeCorreccion>();

	public CriterioNotaMasAlta(List<CriterioDeCorreccion> criteriosAUsar) {
		criterios = criteriosAUsar;
	}



	public double notaFinal(double puntos, double cantidadDePuntosDelExamen) {
		// Por alguna razon sigo teniendo problemas con el Map. Así que esto
		// queda pendiente para hacer bien
		double notaMasAlta = 0;

		for (int i = 0; i < criterios.size(); i++) {

			if (criterios.get(i).notaFinal(puntos, cantidadDePuntosDelExamen) > notaMasAlta) {
				notaMasAlta = criterios.get(i).notaFinal(puntos,
						cantidadDePuntosDelExamen);
			}

		}

		return (notaMasAlta);
	}

}
