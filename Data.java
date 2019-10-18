import java.util.*;

public class Data {
	private int g;
	private int m;
	private int a;
	
	public Data() //il costruttore di default in questo caso costruisce la data odierna.
	{	GregorianCalendar gc = new GregorianCalendar();
		g = gc.get(GregorianCalendar.DAY_OF_MONTH);
		m = gc.get(GregorianCalendar.MONTH) + 1;
		a = gc.get(GregorianCalendar.YEAR);
	}
	
	public Data(int g,int m, int a)
	{	if(g < 0 || g > durata(m,a) || m < 1 || m > 12 ||a < 0 )
			throw new IllegalArgumentException();
		this.g = g;
		this.m = m;
		this.a = a;
	}
	
	public Data(Data d)
	{	this.g = d.g;
		this.m = d.m;
		this.a= d.a;
	}
	
	public static int durata(int m, int a)
	{	if(m < 1 || m > 12)
			throw new IllegalArgumentException();
		if(bisestile(a) && m == 2) return 29;
		switch(m)
		{	case 2: return 28;
			case 4: case 6: case 9: case 11: return 30;
			default: return 31;
		}
	}
	
	public static boolean bisestile(int a)
	{	if(a < 0)
			throw new IllegalArgumentException();
		if(a % 4 != 0) return false;
		if(a % 400 != 0) return false;
		return true;
	}
	
	public int get(int cosa)
	{	if(cosa == 0)	return this.g;
		if(cosa == 1)	return this.m;
		if(cosa == 1)	return this.a;
		throw new IllegalArgumentException();
	}

	public String toString()
	{	return g + "/" + m + "/" + a;
	}
	
	
	public Data next()
	{	if(this.m == 12 || this.g == 31)
			return new Data(1,1,this.a + 1);
		if(this.g == durata(m,a))
			return new Data(1,this.m +1,this.a);
		return new Data(this.g +1,this.m,this.a);
		
	}
	
	public Data previous()
	{	if(this.a == 0 && this.m == 0 && this.g == 0)
			throw new IllegalArgumentException();
		if(this.m == 1 && this.g == 1)
			return new Data(31,12,this.a -1);
		if(this.g == 1)
			return new Data(durata(this.m - 1,this.a),this.m -1, this.a);
		return new Data(this.g -1,this.m,this.a);
	}
	
	/*public int distanza(Data d)
	{	//diamo per buono che la data che ci passa l'utente sia successiva a quella su cui viene invocato il metodo.
		int contatore = 0;
		for(int year = this.a; year <= d.get(2); year++ )
		{	for(int month = ; mon)
			{	for(int day = this.g; day < durata(d.get(1);d.get(2)); day++)
				{	
				}
			}
		}
	}*/
	
	
}
