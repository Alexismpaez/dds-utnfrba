package ofp5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.Optional;
import java.util.function.Predicate;


public class Partido {
	public int hora;
	List<Inscripcion> listaInscripcionesEstandar = new ArrayList<Inscripcion>();
	List<Inscripcion> listaInscripcionesSolidarias = new ArrayList<Inscripcion>();
	List<Inscripcion> listaInscripcionesCondicionales = new ArrayList<Inscripcion>();
	public int fecha;
	int cantJugadores = 0;
	
	
	public void inscribirEstandar(Inscripcion unaInscripcion) {
		if (listaInscripcionesEstandar.size()<10){
			
			if (!listaVacia(listaInscripcionesSolidarias)){	
				listaInscripcionesSolidarias.desinscribir();
						
			else if (!listaVacia(listaInscripcionesCondicionales)){	
				listaInscripcionesCondicionales.desinscribir();
			}
			
			listaInscripcionesEstandar.add(unaInscripcion);
		}
	}
	
	public void inscribirSolidario(Inscripcion unaInscripcion) {
		if (listaInscripcionesEstandar.size()+listaInscripcionesSolidarias.size() <10){
			
			if (!listaVacia(listaInscripcionesCondicionales)){	
				listaInscripcionesCondicionales.desinscribir();
			}
			
			listaInscripcionesSolidarias.add(unaInscripcion);
		}
	
	}
	
	public void inscribirCondicional(Inscripcion unaInscripcion) {
		if (listaInscripcionesEstandar.size()+listaInscripcionesSolidarias.size()+listaInscripcionesCondicionales.size()<10 ){
			listaInscripcionesCondicionales.add(unaInscripcion);
		}
	
	}
	
	/*
	public void inscribir(Jugador unJugador, ModoDeInscripcion modo) {
		this.listaInscripciones.add(inscripcion);
	}
	
	public void desincribir(Inscripcion unaInscripcion){ 
		listaInscripciones.remove(unaInscripcion);
	}*/
		
		
	//REVISAR SINTAXIS DE MENSAJES PARA MANEJO DE COLECCIONES
	
	//REVISAR SINTAXIS DE MENSAJES PARA MANEJO DE COLECCIONES
	
	/*
	public boolean partidoSemiCompleto() {
		return listaDeInscripcionesLlena() && !sonTodosEstandar();
	}
	
	private boolean sonTodosEstandar(){
		listaInscripciones.stream().allMatch(j->j.modo == Estandar);
	}*/

	public boolean listaLlena(List<Inscripcion> lista){
		return (lista.size()==10);
	}
	
	//seguramente haya alguna funcion de esto en agluna libreria
	public boolean listaVacia(List<Inscripcion> lista){
		return (lista.size()==0);
	}
	

	
}
