package ofp5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.Optional;
import java.util.function.Predicate;


public class Partido {
	public int hora;
	List<Jugador> listaJugadores = new ArrayList<Jugador>();
	public int fecha;
	int cantJugadores = 0;
	
	
	public void inscribir(Jugador unJugador) {
		this.listaJugadores.add(unJugador);
	}
	
	public void desincribir(Jugador unJugador){ 
	this.listaJugadores.remove(unJugador);
	}
		
		
	//REVISAR SINTAXIS DE MENSAJES PARA MANEJO DE COLECCIONES
	public boolean partidoCompleto() {
		return (listaJugadores.size()==10) && listaJugadores.stream().allMatch(j->j.getModo instanceof Estandar);
	}
	
	//REVISAR SINTAXIS DE MENSAJES PARA MANEJO DE COLECCIONES
	public boolean partidoSemiCompleto() {
		return (listaJugadores.size()==10) && (listaJugadores.stream().anyMatch(j.getModo-> instanceof Solidario)|| listaJugadores.stream().anyMatch(j.getModo-> instanceof Condicional));
	}
	
	public boolean partidoIncompleto() {
		return listaJugadores.size()<10; 
	}			
	
}
