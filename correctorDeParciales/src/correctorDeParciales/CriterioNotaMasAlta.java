package correctorDeParciales;

import java.util.ArrayList;
import java.util.List;

public class CriterioNotaMasAlta extends CriterioDeCorreccion {

	public List<CriterioDeCorreccion> criterios = new ArrayList<CriterioDeCorreccion>();

	public CriterioNotaMasAlta(List<CriterioDeCorreccion> criteriosAUsar) {
		criterios = criteriosAUsar;
	}



	// Por alguna razon sigo teniendo problemas con el Map. Así que esto
	// queda pendiente para hacer bien
	
	// Usen las marcas TODO y FIXME para estos comentarios, asi el IDE les avisa qué les queda por hacer
	
	
	public double notaFinal(double puntos, double cantidadDePuntosDelExamen) {
		return criterios.stream().map((CriterioDeCorreccion c) -> c.notaFinal(puntos, cantidadDePuntosDelExamen)).max(Double::compare).get();
		
		// Acá les dejo un ejemplo. Investiguen cómo funcionan. En la página hay apuntes. No se si es la mejor forma, 
		// (yo también recién lo agarro), pero me funcó y el método se redujo a una sola línea.
		// PD: Gracias a los test, demoré 1 segundo en saber si anduvo o no

	}
}