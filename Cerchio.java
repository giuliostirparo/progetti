
public class Cerchio extends Figura {
	public Cerchio(double r)
	{	super(r);
	}
	
	public double getRaggio()
	{	return getDimensione();
	}
	
	public double perimetro()
	{	double r = getDimensione();
		return 2 * r * Math.PI;
	}
	
	public double area()
	{	double r = getDimensione();
		return Math.PI * r * r;
	}
	
	public String toString()
	{	return "Cerchio di raggio= " + String.format("%1.2f", getDimensione());
	}
	
	public int hashCode()
	{	Double d = getDimensione();
		return d.hashCode();
	}
	
	public boolean equals(Object obj)
	{	if(!(obj instanceof Cerchio))
			return false;
		if(this == obj)
			return true;
		Cerchio c = (Cerchio) obj;
		return(this.getDimensione() == c.getDimensione());
	}
	
	
}
