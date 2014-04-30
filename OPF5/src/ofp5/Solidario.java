package ofp5;

public class Solidario implements ModoDeInscripcion {

	public	void inscribir(Inscripcion inscripcion, Partido unPartido) {

		unPartido.inscribirSolidario(inscripcion);
		//SI EL PARTIDO ESTA INCOMPLETO LO AGREGO SIN PROBLEMAS
	/*	if (unPartido.partidoIncompleto()){
			unPartido.inscribir(unJugador);
			
		}
			
		//SI EL PARTIDO ESTA SEMICOMPLETO ME TENGO QUE FIJAR SI HAY UN CONDICIONAL PARA PODER REEMPLAZAR
		//A ESE CONDICIONAL POR EL SOLIDARIO QUE QUIERO AGREGAR
		if(unPartido.partidoSemiCompleto()){
			for (int i = 0; i < unPartido.listaJugadores.size(); i++) {
				 
				if (unPartido.listaJugadores.get(i).getModo() instanceof Condicional){
					unPartido.inscribir(unJugador);
					unPartido.desincribir(unPartido.listaJugadores.get(i));
					break;
				}
			
			}
		
		}
		
	
	*/
	
	}
}