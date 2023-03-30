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
		// Modificare il men√π secondo le proprie scelte
		System.out.println("1 - Es n. 1");
		System.out.println("2 - Es n. 2");
		System.out.println("3 - Es n. 3");
		System.out.println("4 - Es n. 5");
		System.out.println("5 - Es n. 7");
	}

	static void es1()
	{
		int[] a=new int[10];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*11-5);
			System.out.println(a[i]);
		}
		
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]<a[j+1])
			{
				k++;
				a[k]=a[j];
			}
		}
		System.out.println();
		System.out.println("minimo:"+a[k]);
		System.out.print("indice Ë:"+k);
		System.out.println();
	}
	static void es2()
	{
		String[] parole= {"ciao","bello","mi","chiamo","leonardo"};
		String parola;
		for(int i=0;i<3;i++)
		{
			System.out.println("prova ad indovinare una parola dell'array, hai tre tentativi");
			parola=in.nextLine();

			if(parola.equals(parole[i]))
			{
				System.out.println("hai indovinato!");
				break;
			}
			else
				System.out.println("hai un tentativo in meno");
		}

	}
	static void es3()
	{
		int[] a=new int[50];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*102-1);
			System.out.print(a[i]+",");

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
		for(int i=0;i<b.length;i++)
		{
			if(b[i]<b[i+1])
			{
				swap(b,i,i+1);
				System.out.print(b[i]);
			}
		}
		System.out.println();
	}
	static void es5()
	{
		int[]array=new int[10];
		for(int i=0;i<array.length;i++)
		{
			array[i]=(int)(Math.random()*11);
			System.out.print(array[i]);
		}
		System.out.println();
		for(int i=0,j=array.length-1;i<array.length;i++,j--)
		{
			System.out.println(array[i]+","+array[j]);
		}
		System.out.println();
	}

	static void es7()
	{
		int[]array=new int[20];
		for(int i=0;i<array.length;i++)
		{
			array[i]=(int)(Math.random()*7-3);
			System.out.print(array[i]);
		}
		for(int i =0;i<array.length;i++)
		{
			if(array[i]==array[i+1])
			{
				System.out.print(array[i+1]);
				System.out.print(i);
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
