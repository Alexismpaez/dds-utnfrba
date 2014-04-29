package ofp5;

public class Jugador {
	boolean esRegular;
	ModoDeInscripcion modo;
	double reputacion;
	
	public void inscribiteEn(Partido unPartido){
		this.modo.inscribir(this, unPartido);
	}
	
	public ModoDeInscripcion getModo(){
		
	return this.modo;	
	
	}
	
	public double getReputacion(){
		return this.reputacion;
	}
}
