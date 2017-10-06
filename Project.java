import java.util.*; 
import java.io.*;
public class Project
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("\nExperiment-1");
		System.out.println("\nExperiment-2");
		System.out.println("\nExperiment-3");
		System.out.println("\nExperiment-4");
		System.out.println("\nExperiment-5");
		System.out.println("\nExperiment-6");
		System.out.println("\nExperiment-7");
		System.out.println("\nExperiment-8");
		System.out.println("\nExperiment-9");
		System.out.println("\nExperiment-10");
		System.out.println("\nExperiment-11"); 
		System.out.println("\nenter your choice:");
		n=s.nextInt();
		if(n>11)
		{
			System.out.println("enter the correct choice:");
			n=s.nextInt();
		}
		switch(n)
		{
			case 1: arith ar=new arith();
					ar.basicoper();
					break;
			case 2: ariths a=new ariths();
					a.basicoper1();
					break;
			case 3: circle c=new circle();
					c.circlearea();
					break;

			case 4: example exa=new example();
					exa.hello();
					break;
			case 5: exce e=new exce();
					e.except();
					break;
			case 6: exp3 ex=new exp3();
					ex.stringsort();
					break;
			case 7: Interface i=new Interface();
					i.interfac();
					break;

			case 8: Multiple_Thread1 mu=new Multiple_Thread1();
					mu.thred();
					break;
			case 9: Multiple_Thread2 m=new Multiple_Thread2();
					m.thred1();
					break;
			case 10: Newexce nex=new Newexce();
						nex.ex();
					break;
			
			
			case 11: 
					prime1 p=new prime1();
					p.primerange();
					break;
			case 12:
			 StringToken st=new  StringToken();
			 st.stringtok();
			 break;
			
}
}
 }
	
		












class arith
{
	void basicoper()
	{
		int a=20,b=10;

		System.out.println("the addition of two numbers is "+(a+b));
		System.out.println("the difference between two numbers is "+(a-b));
		System.out.println("the division of two numbers is "+(a/b));
		System.out.println("remainder is "+(a%b));
		System.out.println("the product of two numbers is "+(a*b));
	}
}
class ariths
{
	void basicoper1()
	{
		Scanner s=new Scanner(System.in);

		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		

		System.out.println("addition= "+(a+b));
		System.out.println("difference= "+(a-b));
		System.out.println("division= "+(a/b));
		System.out.println("remainder= "+(a%b));
		System.out.println("product= "+(a*b));
	}
}


class circle
{
	
	void circlearea()
	{
		Scanner s=new Scanner(System.in);
		int r;
		System.out.println("Enter the radius of the circle");
		r=s.nextInt();		
		double a=Math.PI*(r*r);
		double c=Math.PI*2*r;
		System.out.println("the area of the circle is "+a);
		System.out.println("the circumference of the circle is "+c);
	}
}
		
		
		
class example 
{
	void hello()
	{
		System.out.println("HELLO WORLD");
	}
}

class exce
{
   void except()
    {
        try
        {
			Scanner s=new Scanner(System.in);
            System.out.println("Enter the numerator");
			int a=s.nextInt();
			System.out.println("Enter the denominator");
			int b=s.nextInt();
            float c = a/b;
			System.out.println("The division is "+c);
         }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero");
        }
        finally
        {
            System.out.printf("Finally is always executed");
        }
    }
}

 class exp3 
{
	void stringsort()
	{
		Scanner s=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the number of strings");
		n=s.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the Strings");
		for(i=0;i<n;i++)
			arr[i]=s.next();
		System.out.println("The enterd string are ");
		for(i=0;i<n;i++)
			System.out.println("  "+arr[i]);
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("strings after sorting are");
		for(i=0;i<n;i++)
			System.out.println("  "+arr[i]);
	}
}
		
		
		
interface A
{
    int x=10;
}
interface B
{
    int x=100;
}
class Interface implements A,B
{
    void interfac()
    {
      
       //System.out.println(x); 
       System.out.println(A.x);
       System.out.println(B.x);
    }
}

class Ab extends Thread

{
 
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("A - "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
		}
	}
 
}

class Bc extends Thread
{
	
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("B - "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{
		}
	}
	
}

class Multiple_Thread1
{
	void thred()
	
	{
		Ab t1=new Ab();
		Bc t2=new Bc();
		t1.start();
		t2.start();
	}
}

class C implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("A - "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
		}
	}
}

class D implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("B - "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{
		}
	}
}

class Multiple_Thread2
{
	void thred1()
	{
		C a=new C();
		D b=new D();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		
		t1.start();
		t2.start();
	}
}


 class Newexce
{
	void ex()
	{
		try
		{
			int a=0;
			if(a==0)
			{
				throw new excep();
			}
			int c=10/0;
			System.out.println("c");
		}
		catch(excep e)
		{
			System.out.println("Exception is catched");
		}
	}
}

class excep extends Exception
{
	excep()
	{
		System.out.println("Divided by zero");
	}
}
class palindromen
{
	void numpalin()
	{
		Scanner s=new Scanner(System.in);
		int n,temp,rn=0,d;
		System.out.println("enter the number");
		n=s.nextInt();
		temp=n;
		while(n>0)
		{	
			d=n%10;
			rn=rn*10+d;
			n=n/10;
		}
		if(rn==(temp))
			System.out.println(" the given number is palindrome");
		else
			System.out.println(" the given number is not palindrome");
	}
}


class prime1
{
	void primerange()
	{
		Scanner s=new Scanner(System.in);
		int f,e;
		System.out.println("Enter the limits");
		System.out.println("Enter the lower limit");
		f=s.nextInt();
		System.out.println("Enter the upper limit");
		e=s.nextInt();
		System.out.println("The prime numbers are ");
		for(int n=f;n<=e;n++)
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				count++;
			}
			if(count==2)
				System.out.println("   "+n);
		}
	}
}

	
		
		





class StringToken
{
	void stringtok()
	{
  		String str;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		str=s.nextLine();
		StringTokenizer a=new StringTokenizer(str," ",false);
		System.out.println("integers are ");
		while(a.hasMoreTokens())
    		{
			int b=Integer.parseInt(a.nextToken());
			sum=sum+b;
			System.out.println(" "+b);
			
     		}
		System.out.println("sum of integers is "+sum);
	}
}






 

