package correctorDeParciales;

import java.util.ArrayList;
import java.util.List;

public class CriterioPromedio extends CriterioDeCorreccion {

	public List<CriterioDeCorreccion> criterios = new ArrayList<CriterioDeCorreccion>();

	public CriterioPromedio(List<CriterioDeCorreccion> criteriosAUsar) {
		criterios = criteriosAUsar;
	}

	// No me funciona todo lo que es stream() así que queda pendiente
	// hacerlo bien.	
	public double notaFinal(double puntos, double cantidadDePuntosDelExamen) {
		// Lo hice asi, porque no encontre el average, pero fijense que se reduce bastante, queda más declarativo
		return criterios.stream().mapToDouble((CriterioDeCorreccion c) -> c.notaFinal(puntos, cantidadDePuntosDelExamen)).sum() / criterios.size();
	}

}
