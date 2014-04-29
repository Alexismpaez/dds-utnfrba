package ofp5;

public class Jugador {
	boolean esRegular;
	ModoDeInscripcion modo;
	
	public void inscribiteEn(Partido unPartido){
		unPartido.inscribir(this);
	}
				
}
