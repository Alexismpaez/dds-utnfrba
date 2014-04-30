package ofp5;

public class Estandar implements ModoDeInscripcion {
	
	public void inscribir(Inscripcion inscripcion, Partido unPartido){
		//SI EL PARTIDO ESTA INCOMPLETO LO AGREGO SIN PROBLEMAS
		unPartido.inscribirEstandar(inscripcion);
		
		//SI EL PARTIDO ESTA SEMICOMPLETO ME TENGO QUE FIJAR DE REEMPLAZAR A LOS SOLIDARIOS Y CONDICIONALES
		//SE USA FOR PORQUE LOS TENGO QUE IR REEMPLAZANDO EN ORDEN QUE SE FUERON ANOTANDO
	/*	if (unPartido.partidoSemiCompleto()){
			
			for (int i = 0; i < unPartido.listaJugadores.size(); i++) {
				 
				if (unPartido.listaJugadores.get(i).getModo() instanceof Solidario||unPartido.listaJugadores.get(i).getModo() instanceof Condicional){
						unPartido.inscribir(unJugador);	
						unPartido.desincribir(unPartido.listaJugadores.get(i));
						break;
				}
				
		
			}	 		
			
		
		}
		
		if (unPartido.partidoCompleto()){
			
			for (int i = 0; i < unPartido.listaJugadores.size(); i++) {	
				
				if (unPartido.listaJugadores.get(i).getModo() instanceof Estandar){
					
					if(unJugador.getReputacion()>unPartido.listaJugadores.get(i).getReputacion()){
						unPartido.inscribir(unJugador);
						unPartido.desincribir(unPartido.listaJugadores.get(i));
						break;
					}
				}
			}
		}
	
	
	*/
	}
}
