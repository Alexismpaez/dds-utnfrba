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

	public double puntajeMaximo() {

		double acumulador = 0;

		for (int i = 0; i < preguntas.size(); i++) {

			acumulador += preguntas.get(i).peso;

		}

		return acumulador;
	}
}
