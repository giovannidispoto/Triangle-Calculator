import java.io.*;
class usaTriangoli
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		boolean ok = false;
		boolean primo = false;
		boolean fine = false;
		boolean lettura = false;
		boolean lettura1 = false;
		boolean letturac = false;
		boolean ftot = false;
		double ipo = 0,ang = 0,cat = 0,lato = 0,lato1 = 0;
		TCompleto a = new TCompleto();
		int scelta1 = 0,scelta = 0;

	do{	
	do{									
		System.out.println ("---------------------------------");	//menu da visualizzare
		System.out.println ("0) Esci");
		System.out.println ("1) Calcolatore lati");
		System.out.println ("2) Calcola il perimetro di un Triangolo");
		System.out.println ("3) Calcola l'area di un Triangolo");
		System.out.print ("Fai la tua scelta: ");	
		try{
			scelta = Integer.parseInt(tastiera.readLine());	
			ok = true;                          	//lettura scelta del menù
			}
		catch(Exception e)
			{
				System.out.println("Inserisci un valore numerico");
				continue;
			}	
		}while(!ok);
		switch(scelta)
		{
			case 0:									//scelta 0, provoca l'uscita dal programma
					ftot = true;
					break;
			case 1:
					do{
					do{	
						System.out.println("------------------------------------------------------------------------");
						System.out.println("1)Calcola il cateto avendo l'ipotenusa e il seno dell'angolo apposto");
						System.out.println("2)Calcola il cateto avendo l'ipotenusa e il coseno dell'angolo adiacente");	
						System.out.println("3)Calcola il cateto avendo l'altro cateto e la tangente dell'angolo opposto");
						System.out.println("4)Calcola il cateto avendo l'altro cateto e la cotangente dell'angolo adiacente");	
						System.out.println("5)Calcola il terzo lato avendo i due lati e l'angolo compreso");
						System.out.println("0)Torna su");
						System.out.print("Fai la tua scelta: ");
			
				try{
					scelta1 = Integer.parseInt(tastiera.readLine());
					primo = true;		//lettura scelta del menù
					}
				catch(Exception e)
					{
						System.out.println("Inserisci un valore numerico");
						continue;
					}	
				}while(!primo);
					lettura = false;
					lettura1 = false;
					letturac = false;
					
			switch(scelta1)
			{
				case 0:
						fine = true;
						break;
				case 1:
						//lettura dell'ipotenusa
					do{
						System.out.print("Inserisci l'ipotenusa: ");
					try{
						ipo = Double.parseDouble(tastiera.readLine());
						lettura = true;
						}
					catch(Exception e)
					{
						System.out.println("Valore non valido");
					}
						}while(!lettura);
					//lettura dell'angolo
					do{
						System.out.print("Inserisci l'angolo: ");
					try{
						ang = Double.parseDouble(tastiera.readLine());
						lettura1 = true;
						}
					catch(Exception e)
					{
						System.out.println("Valore non valido");
					}
						}while(!lettura1);
					System.out.println("Il cateto misura " + Triangolo.ipoAngOpp(ipo,ang));
													
						break;
				case 2:
						do{
						System.out.print("Inserisci l'ipotenusa: ");
					try{
						ipo = Double.parseDouble(tastiera.readLine());
						lettura = true;
						}
					catch(Exception e)
					{
						System.out.println("Valore non valido");
					}
						}while(!lettura);
					//lettura dell'angolo
					do{
						System.out.print("Inserisci l'angolo: ");
					try{
						ang = Double.parseDouble(tastiera.readLine());
						lettura1 = true;
						}
					catch(Exception e)
					{
						System.out.println("Valore non valido");
					}
						}while(!lettura1);
					System.out.println("Il cateto misura " + Triangolo.ipoAngAd(ipo,ang));
						
						break;
				case 3:
						//lettura dell'ipotenusa
					do{
						System.out.print("Inserisci il cateto: ");
					try{
						cat = Double.parseDouble(tastiera.readLine());
						lettura = true;
						}
					catch(Exception e)
					{
						System.out.println("Valore non valido");
					}
						}while(!lettura);
					//lettura dell'angolo
					do{
						System.out.print("Inserisci l'angolo: ");
					try{
						ang = Double.parseDouble(tastiera.readLine());
						lettura1 = true;
						}
					catch(Exception e)
					{
						System.out.println("Valore non valido");
					}
						}while(!lettura1);
					System.out.println("Il cateto misura " + Triangolo.catAngOpp(cat,ang));
												
						break;
				case 4:
						do{
						System.out.print("Inserisci il cateto: ");
					try{
						cat = Double.parseDouble(tastiera.readLine());
						lettura = true;
						}
					catch(Exception e)
					{
						System.out.println("Valore non valido");
					}
						}while(!lettura);
					//lettura dell'angolo
					do{
						System.out.print("Inerisci l'angolo: ");
					try{
						ang = Double.parseDouble(tastiera.readLine());
						lettura1 = true;
						}
					catch(Exception e)
					{
						System.out.println("valore non valido");
					}
						}while(!lettura1);
					System.out.println("Il cateto misura " + Triangolo.catAngAd(cat,ang));
						
						break;
				case 5:
						do{
						System.out.print("Inserisci il primo lato: ");
					try{
						lato = Double.parseDouble(tastiera.readLine());
						lettura = true;
						}
					catch(Exception e)
					{
						System.out.println("Valore non valido");
					}
						}while(!lettura);
					
					do{
						System.out.print("Inserisci il secondo lato: ");
					try{
						lato = Double.parseDouble(tastiera.readLine());
						letturac = true;
						}
					catch(Exception e)
					{
						System.out.println("Valore non valido");
						continue;
					}
						}while(!letturac);			
					//lettura dell'angolo
					do{
						System.out.print("Inserisci l'angolo: ");
					try{
						ang = Double.parseDouble(tastiera.readLine());
						lettura1 = true;
						}
					catch(Exception e)
					{
						System.out.println("Valore non valido");
						continue;
					}
						}while(!lettura1);
					System.out.println("Il cateto misura " + Triangolo.carnot(lato,lato1,ang));
						break;
				default:
						System.out.println("Valore non presente!");
						break;
			}
				}while(!fine);
		
					break;
			case 2:
					lettura = false;
					lettura1 = false;
					letturac = false;
					System.out.println("Inserisci il primo lato: ");
				do{
					try{
						lato = Double.parseDouble(tastiera.readLine());
						lettura = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
						}
					}while(!lettura);
					
						System.out.println("Inserisci il secondo lato: ");
				do{
					try{
						lato1 = Double.parseDouble(tastiera.readLine());
						lettura1 = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
						}
					}while(!lettura1);
					
					System.out.println("Inserisci l'angolo compreso: ");
				do{
					try{
						ang = Double.parseDouble(tastiera.readLine());
						letturac = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
						}
					}while(!letturac);
				a = new TCompleto(lato,lato1,ang);
				
				System.out.println("Il perimetro misura " + a.perimetro(lato,lato1,ang));
					break;
			case 3:
					lettura = false;
					lettura1 = false;
					letturac = false;
					System.out.println("Inserisci il primo lato: ");
				do{
					try{
						lato = Double.parseDouble(tastiera.readLine());
						lettura = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
						}
					}while(!lettura);
					
						System.out.println("Inserisci il secondo lato: ");
				do{
					try{
						lato1 = Double.parseDouble(tastiera.readLine());
						lettura1 = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
						}
					}while(!lettura1);
					
					System.out.println("Inserisci l'angolo: ");
				do{
					try{
						ang = Double.parseDouble(tastiera.readLine());
						letturac = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
						}
					}while(!letturac);
					 a = new TCompleto();
				
				System.out.println("L'area del triangolo misura " + a.area(lato,lato1,ang));
					break;
			default:
					System.out.println("Scelta non presente");
					break;
		}
	}while(!ftot);
		
}
}

