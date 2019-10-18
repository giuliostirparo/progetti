
public class Disco extends Punto implements FiguraPiana {
	private double raggio;
	
	public Disco(Punto p, double raggio)
	{	super(p);
		this.raggio = raggio;
	}
	
	public Disco(double x, double y, double raggio)
	{	super(x,y);
		this.raggio = raggio;
	}
	
	public Disco(double raggio)
	{	super();
		this.raggio = raggio;
	}
	
	public double getRaggio()
	{	return raggio;
	}
	
	public Punto getCentro()
	{	return new Punto(this.getX(), this.getY());
	}
	
	public String toString()
	{	return "Disco di centro C(" + getX() + "," + getY() + ") e raggio= " + getRaggio();  
	}
	
	public boolean equals(Object o)
	{	if(!(o instanceof Disco))
			return false;
		if(this == o)
			return true;
		Disco d = (Disco)o;
		return d.getCentro().equals(this.getCentro()) && d.raggio == this.raggio;
	}

	public double area()
	{	return Math.PI * this.getRaggio() * this.getRaggio();
	}
	
	public double perimetro()
	{	return 2 * Math.PI * this.getRaggio();
	}
	
}
