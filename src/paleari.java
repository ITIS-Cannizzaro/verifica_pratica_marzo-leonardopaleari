import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class paleari
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			//aggiungere, togliere casi a seconda delle proprie scelte
			case 1:
				es1();
				break;
			case 2:
				es2();
				break;
			case 3:
				es3();
				break;
			case 4:
				es5();
				break;
			case 5:
				es7();
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - Es n. 1");
		System.out.println("2 - Es n. 2");
		System.out.println("3 - Es n. 3");
		System.out.println("4 - Es n. 5");
		System.out.println("5 - Es n. 7");
	}

	// Accordino: non va ma c'è quasi un ragionamento: 0.5pt
	static void es1()
	{
		int[] a=new int[10];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*11-5);
			System.out.print(a[i] + " ");
		}
		
		// Accordino: così vale solo l'ultimo confronto!
		// int minimo = a[0]; // dovevi mettere una variabile per contenere il minimo
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]<a[j+1] /* a[j] < minimo   */) // Se trovo un elemento dell'array più piccolo del minimo
			{
				k++;
				a[k]=a[j]; // minimo = a[j]; // aggiorno il minimo
			}
		}
		System.out.println();
		System.out.println("minimo:"+a[k]);
		System.out.print("indice �:"+k);
		System.out.println();
	}
	
	// Accordino: il ragionamento era vicino ma manca un elemento importante: 1pt
	static void es2()
	{
		String[] parole= {"ciao","bello","mi","chiamo","leonardo"};
		String parola;
		for(int i=0;i<3;i++)
		{
			System.out.println("prova ad indovinare una parola dell'array, hai tre tentativi");
			parola=in.nextLine();
			// Accordino: dovevi confrontare con tutte e 5 le parole, così confronti solo con una delle 5
			if(parola.equals(parole[i]))
			{
				System.out.println("hai indovinato!");
				break;
			}
			else
				System.out.println("hai un tentativo in meno");
		}

	}
	
	// Accordino: anche qui, il ragionamento più o meno c'è ma ci sono tanti errorini: 0.8
	static void es3()
	{
		int[] a=new int[50];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*102-1); // Accordino: * 101, non 102. Inoltre essere + 1 non  -1 
			System.out.print(a[i]+" ");

			if(a[i]%2==0)
				k++;
		}
		int[]b=new int[k];
		for(int i=0;i<b.length;i++)
		{
			if(a[i]%2==0)
			{
				b[i]=a[i];
			}

		}
		System.out.println();
		// Accordino: l'ordinamento vuole 2 cicli for annidati, qui ne hai messo solo uno!!
		for(int i=0;i<b.length;i++)// Accordino:  se usi come indice i+1 devi fermarti a b.length -1, sennò il programma crasha!
		{
			if(b[i]<b[i+1])
			{
				swap(b,i,i+1);
				System.out.print(b[i]+" ");// Accordino: prima ordini l'array e poi lo stampi, non puoi farlo nello stesso tempo
			}
		}
		System.out.println();
	}
	
	// Accordino: questo è quasi giusto: 2.5
	static void es5()
	{
		int[]array=new int[10];
		for(int i=0;i<array.length;i++)
		{
			array[i]=(int)(Math.random()*11);
			System.out.print(array[i]);
		}
		System.out.println();
		for(int i=0,j=array.length-1;i<array.length;i++,j--) // Accordino: ti dovevi fermare a metà dell'array!
		{
			System.out.println(array[i]+","+array[j]);
		}
		System.out.println();
	}

	// Accordino: ti sei dimenticato il limite dell'indice ed è disordinato: 3pt
	static void es7()
	{
		int[]array=new int[20];
		for(int i=0;i<array.length;i++)
		{
			array[i]=(int)(Math.random()*7-3);
			System.out.print(array[i] + " ");
		}
		for(int i =0;i<array.length;i++)// Accordino:  se usi come indice i+1 devi fermarti a array.length -1, sennò il programma crasha!
		{
			if(array[i]==array[i+1])
			{
				// Accordino: non è un errore ma, in futuro, prova a stamparle così le cose, viene tutto più ordinato e capisci meglio!  
				System.out.print("Trovato " + array[i+1] + " alla posizione: ");
				System.out.print(i + "\n");
			}
		}


	}
	static void swap(int[]b,int i,int j)
	{
		int temp=b[i];
		b[i]=b[j];
		b[j]=temp;
	}
}
