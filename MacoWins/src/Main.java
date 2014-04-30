
public class Main {

	static Venta venta;
	static Sucursal sucursal;
	public static void main(String[] args){
		
		sucursal = new Sucursal();
		
		venta.prenda = new Pantalon();
		
		venta.prenda.esImportada();
		
		venta.prenda.cantidadModificador(5);
		
		venta.prenda.precioFijo(50);
		
		venta.prenda.marca = new Armani();
		
		sucursal.registrarVenta(venta);
		

	}
	
}
