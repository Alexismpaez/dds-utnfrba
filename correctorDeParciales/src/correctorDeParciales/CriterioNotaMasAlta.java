package correctorDeParciales;

import java.util.ArrayList;
import java.util.List;

public class CriterioNotaMasAlta extends CriterioDeCorreccion {

	public List<CriterioDeCorreccion> criterios = new ArrayList<CriterioDeCorreccion>();

	public CriterioNotaMasAlta(List<CriterioDeCorreccion> criteriosAUsar) {
		criterios = criteriosAUsar;
	}



	// Por alguna razon sigo teniendo problemas con el Map. As� que esto
	// queda pendiente para hacer bien
	
	// Usen las marcas TODO y FIXME para estos comentarios, asi el IDE les avisa qu� les queda por hacer
	
	
	public double notaFinal(double puntos, double cantidadDePuntosDelExamen) {
		return criterios.stream().map((CriterioDeCorreccion c) -> c.notaFinal(puntos, cantidadDePuntosDelExamen)).max(Double::compare).get();
		
		// Ac� les dejo un ejemplo. Investiguen c�mo funcionan. En la p�gina hay apuntes. No se si es la mejor forma, 
		// (yo tambi�n reci�n lo agarro), pero me func� y el m�todo se redujo a una sola l�nea.
		// PD: Gracias a los test, demor� 1 segundo en saber si anduvo o no

	}
}