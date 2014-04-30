package correctorDeParciales;

import java.util.ArrayList;
import java.util.List;

public class CriterioPorTabla extends CriterioDeCorreccion {

	public List<TablaDeConversion> tablaDeConversion = new ArrayList<TablaDeConversion>();

	class TablaDeConversion {
		double puntajeObtenido;
		double puntajeOtorgado;
	}

	public double notaFinal(double puntos, double cantidadDePuntosDelExamen) {
		// No encontre otra forma fácil de buscar en la lista sin exigir que
		// este ordenada, por ahora lo dejo así
		for (int i = 0; i < tablaDeConversion.size(); i++) {

			if (tablaDeConversion.get(i).puntajeObtenido == puntos) {
				return (tablaDeConversion.get(i).puntajeOtorgado);
			}

		}

		return 0;
	}

}
