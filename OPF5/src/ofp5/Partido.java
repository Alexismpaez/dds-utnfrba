package ofp5;

import java.util.ArrayList;
import java.util.List;

public class Partido {
	public int hora;
	List<Jugador> listaJugadores = new ArrayList<Jugador>();
	public int fecha;
	int cantJugadores = 0;
	
	
	public void inscribir(Jugador unJugador) {

	}
		
	

	public boolean partidoCompleto() {
		return listaJugadores.size()==10 && listaJugadores.stream().allMatch((Jugador j) ->  j.modo instanceof Estandar);

	}


	
	
}
