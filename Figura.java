
public abstract class Figura implements FiguraPiana {
	private double dimensione;
	
	public Figura(double dim)
	{	if(dim < 0)
			throw new IllegalArgumentException();
		this.dimensione = dim;
	}
	
	protected double getDimensione()
	{	return dimensione;
	}
	
	public abstract double perimetro();
	public abstract double area();

}
