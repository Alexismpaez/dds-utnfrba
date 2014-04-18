package correctorDeParciales;

public class Alumno {
	public Examen examen;
	public double puntajeAcumulado;

	
	//Para que no sea case sensitive hay que forzar el string a que arranque con mayuscula
	public void responderUnaPregunta(int numeroDePregunta, String respuesta) {
		
		/*Primero me aseguro que este todo en minuscula, y despues meto la primer en mayuscula
		Probe con esto pero le deja algo al string que hace que falle la comparacion
		respuesta = respuesta.toLowerCase();
		respuesta = Character.toString(respuesta.charAt(0)).toUpperCase()+respuesta.substring(1);
		*/
		
		//No comparen con ==, ya que comparan objetos. Utilicen el mensaje "equals"
		if (examen.respuesta(numeroDePregunta) == respuesta) {
			puntajeAcumulado+= examen.valorDeLaPregunta(numeroDePregunta);
			
		
		}


	
	}
	
	
}
