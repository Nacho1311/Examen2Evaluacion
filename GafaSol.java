package ev2.examen;

public class GafaSol {

	private int id;
	private Montura montura;
	private Lente lente1;
	private Lente lente2;
	private double coste;
	private double precioVenta;
	private String nombreProveedor;
	
	public GafaSol (int id, Montura montura, Lente lente1, Lente lente2, double coste, double precioVenta, String nombreProveedor) {
		
		this.id = id;
		this.montura = montura;
		this.lente1 = lente1;
		this.lente2 = lente2;
		this.coste = coste;
		this.precioVenta = precioVenta;
		this.nombreProveedor = nombreProveedor;
	}
	
}
