package correctorDeParciales;

import java.util.ArrayList;
import java.util.List;

public class Examen {

	public List<Pregunta> preguntas = new ArrayList<Pregunta>();

	public String enunciado(int numeroDePregunta) {

		return (preguntas.get(numeroDePregunta).enunciado);
	}

	public String respuesta(int numeroDePregunta) {

		return (preguntas.get(numeroDePregunta).respuesta);
	}

	public String[] opciones(int numeroDePregunta) {

		return (preguntas.get(numeroDePregunta).opciones);
	}

	public double valorDeLaPregunta(int numeroDePregunta) {

		return (preguntas.get(numeroDePregunta).peso);
	}

	
	//Usen las operaciones sobre colecciones que incluyen Java8, por eso lo usamos.
	//El código no solo gana en prolijidad, sino que se evitan errores y el diseño gana declaratividad
	
	public double puntajeMaximo() {

		double acumulador = 0;

		for (int i = 0; i < preguntas.size(); i++) {

			acumulador += preguntas.get(i).peso;

		}

		return acumulador;
	}
}
