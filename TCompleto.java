public class TCompleto
{
	private static double a,b,c,ang;
	private static double cat,cat2;
	private static Triangolo t
	public TCompleto()
	{
		//void
		t = new Triangolo();
}
	public static double perimetro(double a,double b)
	{
		c = Math.sqrt((a*a)+(b*b));
		return a + b + c;
	}
	public static double area(double a, double b,double ang)
	{
		return((a * b) * Math.cos(ang));
	}
	public static double perSenAngOpp(double a,double ang)
	{
		cat = t.ipoAngOpp(a,ang);
		cat2 = Math.sqrt(a * a - cat * cat);
		return a + cat + cat2;	
	}
	public static double perSenAngAd(double a,double ang)
	{
		cat = t.ipoAngAd(a,ang);
		cat2 = Math.sqrt(a * a - cat * cat);
		return a + cat + cat2;	
	}
	
	public static double areaSenAngOpp(double a,double ang)
	{
		cat = t.ipoAngOpp(a,ang);
		cat2 = Math.sqrt((a * a) - (cat * cat));
		return ((a * cat2) * Math.sin(ang))/2;
	}
	
	public static double areaSenAngAd(double a,double ang)
	{
		cat = t.ipoAngAd(a,ang);
		cat2 = Math.sqrt(a * a - cat * cat);
		return ((a * cat) * Math.sin(ang))/2;
	}
}