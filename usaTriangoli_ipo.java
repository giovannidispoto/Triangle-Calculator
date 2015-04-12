import java.io.*;
class MainClassTriangoli
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
		boolean areac = false;
		boolean perc = false;
		double ipo = 0,ang = 0,cat = 0,lato = 0,lato1 = 0,perimetro = 0,area = 0;
		int area_s = 0,perimetro_s = 0;
		Triangolo t = new Triangolo();
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
					System.out.println("Il cateto misura " + t.ipoAngOpp(ipo,ang));
													
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
					System.out.println("Il cateto misura " +t.ipoAngAd(ipo,ang));
						
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
					System.out.println("Il cateto misura " + t.catAngOpp(cat,ang));
												
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
					System.out.println("Il cateto misura " + t.catAngAd(cat,ang));
						
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
					System.out.println("Il cateto misura " + t.carnot(lato,lato1,ang));
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
					lato = 0;
					ang = 0;
			do{	
			do{		
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("1) Calcola il perimetro avendo l'ipotenusa e l'angolo adiacente al cateto");
				System.out.println("2) Calcola il perimetro con l'ipotenusa è l'angolo opposto al cateto");
				System.out.println("0) Torna su!");
				System.out.print ("Fai la tua scelta: ");
				
				
			
				try{
						perimetro_s = Integer.parseInt(tastiera.readLine());
						lettura1 = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
						}
				}while(!lettura1);
				switch(perimetro_s)
				{
					case 1:
							
				do{
					System.out.print("Inserisci il primo lato: ");
					try{
						lato = Double.parseDouble(tastiera.readLine());
						lettura = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
							continue;
						}
					}while(!lettura);
					
					
			do{
				System.out.print("Inserisci l'angolo: ");
					try{
						ang = Double.parseDouble(tastiera.readLine());
						letturac = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
							continue;
						}
						}while(!letturac);
						System.out.println("Il perimetro del triangolo misura "+t.perSenAngAd(lato,ang));
						break;
						
				case 2: 
									
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
					System.out.print("Inserisci l'angolo: ");
					try{
						ang = Double.parseDouble(tastiera.readLine());
						letturac = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
						}
					}while(!letturac);

						System.out.println("Il perimetro del triangolo misura " + t.perSenAngOpp(lato,ang));
							break;
					case 0:
							perc = true;
							break;
					default:
							System.out.println("Scelta non presente!");
							break;
				}
				}while(!perc);
					break;
			case 3:
					lettura = false;
					lettura1 = false;
					letturac = false;
			do{	
			do{
				System.out.println("-----------------------------------------------------------------");	
				System.out.println("1) Calcola l'area con l'ipotenusa è l'angolo adiacente al cateto");
				System.out.println("2) Calcola l'area con l'ipotenusa è l'angolo opposto al cateto");
				System.out.println("0) Torna su!");
				System.out.print ("Fai la tua scelta: ");
				
				
				try{
						area_s = Integer.parseInt(tastiera.readLine());
						lettura1 = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
						}
				}while(!lettura1);
			
			switch(area_s)
			{
				case 1:		
						
				do{
					System.out.println("Inserisci il primo lato: ");
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
					System.out.println("Inserisci l'angolo: ");
					try{
						ang = Double.parseDouble(tastiera.readLine());
						letturac = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
						}
					}while(!letturac);

						System.out.println("L'area del triangolo misura" + t.areaSenAngAd(lato,ang));
						break;
				case 2:
						
				do{
					System.out.println("Inserisci il primo lato: ");
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
					System.out.println("Inserisci l'angolo: ");
					try{
						ang = Double.parseDouble(tastiera.readLine());
						letturac = true;
						}
					catch(Exception e)
						{
							System.out.println("Valore non valido");
						}
					}while(!letturac);

						System.out.println("L'area del triangolo misura" + t.areaSenAngOpp(lato,ang));
						break;
				case 0:
						areac = true;
						break;
				default:
						System.out.println("Scelta non valida");
						break;
			}
			}while(!areac);
			
	}

}while(!ftot);
}
}



