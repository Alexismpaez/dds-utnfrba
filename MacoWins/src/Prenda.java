
abstract class Prenda {
	double precioBase;
	double precioFijo;
	double valorModificador;
	Marca marca;
	Origen origen;
	
	
	
	public void setearPrecio(int precio){
		
	precioBase = precio;
	
	}
	
	public void esImportada(){
	
		origen = new Importada();
	}
	
	public void precioFijo(double cantidad){
	precioFijo = cantidad;
	}
	
	public void esNacional(){
	origen = new Nacional();
	}
	
	public void cantidadModificador(double cantidad){
		valorModificador = cantidad;
	}
	
	abstract double precioBaseReal();
	
	public double precioParcial(){
		return (this.precioBaseReal() + precioFijo)*(origen.tazaDeImportacion);
		
	}
	public double precioFinal(){
		
	double pFinal;
	
	pFinal = this.precioParcial()+marca.modificador(this.precioParcial());
	
	return pFinal;
		}
	
	
}
