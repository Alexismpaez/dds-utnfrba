package ofp5;

public class Condicional implements ModoDeInscripcion{
	public	void inscribir(Inscripcion inscripcion, Partido unPartido) {

		unPartido.inscribirCondicional(inscripcion);
	
	}
}

