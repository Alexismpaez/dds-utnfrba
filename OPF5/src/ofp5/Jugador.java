package ofp5;

public class Jugador {
	boolean esRegular;
	double reputacion;
	
	public void inscribiteEn(Partido unPartido, ModoDeInscripcion modo){
		Inscripcion inscripcion = new Inscripcion(this, modo) ;
		inscripcion.modo.inscribir(inscripcion, unPartido);
	}
	
	public double getReputacion(){
		return this.reputacion;
	}
}
