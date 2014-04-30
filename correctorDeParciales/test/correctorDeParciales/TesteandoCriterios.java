package correctorDeParciales;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteandoCriterios {
	
	Alumno alumno;
	Pregunta pregunta1;
	Pregunta pregunta2;
	Pregunta pregunta3;
	CriterioReglaDeTres criterio1;
	CriterioRestaPuntos criterio2;
	CriterioNotaMasAlta criterio3;
	CriterioPromedio criterio4;
	List<CriterioDeCorreccion> listaCriterios = new ArrayList<CriterioDeCorreccion>();

	
	@Before
	public void inicializo(){
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
		
		criterio1= new CriterioReglaDeTres(); 
		criterio2= new CriterioRestaPuntos(5);
		
		listaCriterios.add(criterio1);
		listaCriterios.add (criterio2);
		
		criterio3= new CriterioNotaMasAlta(listaCriterios);
	    criterio4=new CriterioPromedio(listaCriterios);
		
	    alumno.responderUnaPregunta(0, "1810");
		alumno.responderUnaPregunta(1, "Sarmiento");
		alumno.responderUnaPregunta(2, "veRdAdeRo");
	
		}
	
	
	//TESTEAMOS CRITERIO REGLA DE TRES
	@Test
	public void laNotaDelAlumnoMedianteCriterioReglaDeTresEs5(){
		Assert.assertTrue((criterio1.notaFinal(alumno.puntajeAcumulado, alumno.examen.puntajeMaximo()))==5);
	}
	
	@Test //hacemos el mismo test por el lado de falso
	public void laNotaDelAlumnoMedianteCriterioReglaDeTresNoEs6(){
		Assert.assertFalse((criterio1.notaFinal(alumno.puntajeAcumulado, alumno.examen.puntajeMaximo()))==6);
	}
	
	
	//TESTEAMOS CRITERIO RESTA PUNTOS
	@Test
	public void laNotaDelAlumnoMedianteCriterioRestaPuntosEs10(){
		Assert.assertTrue((criterio2.notaFinal(alumno.puntajeAcumulado, alumno.examen.puntajeMaximo()))==10);
	}
	
	@Test//Hacemos el mismo test pero por el lado de falso
	public void laNotaDelAlumnoMedianteCriterioRestaPuntosNoEs7(){
		Assert.assertFalse((criterio2.notaFinal(alumno.puntajeAcumulado, alumno.examen.puntajeMaximo()))==7);
	}
	
		
	//TESTEAMOS CRITERIO DE NOTA MAS ALTA
	@Test
	public void laNotaDelAlumnoMedianteCriterioNotaMasAltaEsEs10(){
		Assert.assertTrue((criterio3.notaFinal(alumno.puntajeAcumulado, alumno.examen.puntajeMaximo()))==10);
	}
	
	@Test //hacemos este test por el lado de falso
	public void laNotaDelAlumnoMedianteCriterioNotaMasAltaEsNoEs5(){
		Assert.assertFalse((criterio3.notaFinal(alumno.puntajeAcumulado, alumno.examen.puntajeMaximo()))==5);
	}
	
	
	//TESTEAMOS CRITERIO 
	@Test //el 75 del nombre del test hace referencia 7.5 
	public void laNotaDelAlumnoMedianteCriterioPromedioEs75(){
		Assert.assertTrue((criterio4.notaFinal(alumno.puntajeAcumulado, alumno.examen.puntajeMaximo()))==7.5);
	}
	
	@Test//mismo test por el lado de falso  
	public void laNotaDelAlumnoMedianteCriterioPromedioNoEs5(){
		Assert.assertFalse((criterio4.notaFinal(alumno.puntajeAcumulado, alumno.examen.puntajeMaximo()))==5);
	} 

}

















