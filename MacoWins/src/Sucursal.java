import java.util.ArrayList;

public class Sucursal {
	ArrayList<Venta> ventas = new ArrayList<Venta>();
	double ganancias;
	
	public void registrarVenta(Venta venta){
		ventas.add(venta);
		
	}
	
	public void gananciaDelDia(){
		
		for (int len = ventas.size(), i = 0; i < len; i++) {
			  Venta unaVenta = ventas.get(i);
			  ganancias+= unaVenta.prenda.precioFinal();
			}
		
			System.out.println("Las ganancias del dia son:" +ganancias);
	}
	
}
