package correctorDeParciales;
import java.util.ArrayList;
import java.util.List;

class Main {
	
	/*
	 * Está bien la idea de plasmar cómo funciona un sistema, mostrando cómo es que se envían mensajes y resuelven el problema
	 * pero en el código esta clase no sirve, no tiene sentido. Lo que tienen que hacer, es esto mismo pero con tests, por que
	 * es mucho más fácil de mantener, ya que si tengo que hacer una nueva funcionalidad, que modifica algo, me es muy útil, una vez que terminé,
	 * correr todos los test para ver si no rompió nada de lo que hice. En cambio, con este main, tengo que recordar qué valor debía devolver
	 * 
	 */
	
	public static void main(String[] args) {
		
		Alumno alumno;
		Pregunta pregunta1;
		Pregunta pregunta2;
		Pregunta pregunta3;
		CriterioReglaDeTres criterio1;
		CriterioRestaPuntos criterio2;
		List<CriterioDeCorreccion> criterios = new ArrayList<CriterioDeCorreccion>();
		CriterioNotaMasAlta criterio3;
		CriterioPromedio criterio4;
		
		alumno = new Alumno();
		
		alumno.examen = new Examen();
		
		pregunta1 = new Pregunta();
		pregunta2 = new Pregunta();
		pregunta3 = new Pregunta();
		
		pregunta1.peso = 10;
		pregunta1.respuesta = "1810";
		pregunta2.peso = 5;
		pregunta2.respuesta = "Sarmiento";
		pregunta3.peso = 15;
		pregunta3.respuesta = "Verdadero";
		
		alumno.examen.preguntas.add(pregunta1);
		alumno.examen.preguntas.add(pregunta2);
		alumno.examen.preguntas.add(pregunta3);
		
		
		// hacer que el criterio reciba a todo el examen directamente
		
		criterio1= new CriterioReglaDeTres(); 
		criterio2= new CriterioRestaPuntos(5);
	    
		criterios.add(criterio1);
		criterios.add (criterio2);
	    
		criterio3= new CriterioNotaMasAlta(criterios);
		criterio4= new CriterioPromedio(criterios);
	    
		alumno.responderUnaPregunta(0, "1810");
		alumno.responderUnaPregunta(1, "Sarmiento");
		alumno.responderUnaPregunta(2, "veRdAdeRo");
		
		System.out.println(""+criterio1.notaFinal(alumno.puntajeAcumulado, alumno.examen.puntajeMaximo()));
		System.out.println(""+criterio2.notaFinal(alumno.puntajeAcumulado, alumno.examen.puntajeMaximo()));
		System.out.println(""+criterio3.notaFinal(alumno.puntajeAcumulado, alumno.examen.puntajeMaximo()));
		System.out.println(""+criterio4.notaFinal(alumno.puntajeAcumulado, alumno.examen.puntajeMaximo()));
	}
}
