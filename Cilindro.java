
public class Cilindro extends Disco implements FiguraSolida {
	private double altezza;
	
	public Cilindro(double raggio,double h)
	{	super(raggio);
		this.altezza = h;
	}
	
	public Cilindro(double x, double y, double raggio, double h)
	{	super(x,y,raggio);
		this.altezza = h;
	}
	
	public Cilindro(Cilindro c)
	{	super(c.getX() , c.getY(), c.getRaggio());
		this.altezza = c.altezza;
	}
	
	public double perimetro()
	{	throw new UnsupportedOperationException();
	}
	
	public double areaDiBase()
	{	return super.area();
	}
	
	public double areaLaterale()
	{	return super.perimetro()*altezza;
	}
	
	public double area()
	{	return super.area() * 2 + areaLaterale();
	}
	
	public double volume()
	{	return super.area() * altezza;
	}
	
	public double getAltezza()
	{	return altezza;
	}
	
	public String toString()
	{	return "Cilindro" + super.toString() + " altezza=" + String.format("%1.2f", altezza);
	}
	
}
