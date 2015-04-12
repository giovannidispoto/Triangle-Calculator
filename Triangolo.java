public class Triangolo
{
	private double ipo,ang,cat;	//a è l'attributo del primo lato, b è l'attributo del secondo lato, ang è l'attribuito dell'angolo compreso
	private double a,b,c;
	private double cat2;
	
	public Triangolo()
	{
		//void
	}
	
	public double ipoAngOpp(double ipo,double ang)
	{
		return ipo * Math.sin(ang);
	}
	
	public double ipoAngAd(double ipo,double ang)
	{
		return ipo * Math.cos(ang);
	}
	
	public double catAngOpp(double cat,double ang)
	{
		return cat * Math.tan(ang);
	}
	public double catAngAd(double cat,double ang)
	{
		return cat * (1 / Math.tan(ang));
	}
	
	public double carnot(double a,double b,double ang)
	{
		return Math.sqrt((a * a) + (b * b) - ((2 * (a * b))* Math.cos(ang)));
	}
	
		public double perimetro(double a,double b)
	{
		c = Math.sqrt((a*a)+(b*b));
		return a + b + c;
	}
	public double area(double a, double b,double ang)
	{
		return((a * b) * Math.cos(ang));
	}
	public double perSenAngOpp(double a,double ang)
	{
		cat = ipoAngOpp(a,ang);
		cat2 = Math.sqrt(a * a - cat * cat);
		return a + cat + cat2;	
	}
	public double perSenAngAd(double a,double ang)
	{
		cat = ipoAngAd(a,ang);
		cat2 = Math.sqrt(a * a - cat * cat);
		return a + cat + cat2;	
	}
	
	public double areaSenAngOpp(double a,double ang)
	{
		cat = ipoAngOpp(a,ang);
		cat2 = Math.sqrt((a * a) - (cat * cat));
		return ((a * cat2) * Math.sin(ang))/2;
	}
	
	public double areaSenAngAd(double a,double ang)
	{
		cat = ipoAngAd(a,ang);
		cat2 = Math.sqrt(a * a - cat * cat);
		return ((a * cat) * Math.sin(ang))/2;
	}
}