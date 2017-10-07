import java.util.*; 
import java.io.*;
public class Project
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,f=1,ch;
		char c;
		while(f==1)
		{
		System.out.println("**DEPATMENT OF IT WELCOMES YOU**");
		System.out.println("************MENU****************");
		System.out.println("DO YOU WANT BASIC PROGRAMS OF JAVA OR LAB EXPERIMENTS:");
		System.out.println("BASIC PROGRAMS - PRESS 1");
		System.out.println("LAB EXPERIMENTS - PRESS 2");
		System.out.println("ENTER YOUR CHOICE:");
		ch=s.nextInt();
		if(ch==1)
		{
		System.out.println("*****BASIC PROGRAMS*******");
		System.out.println("1.HELLO WORLD");
		System.out.println("2.AREA OF THE CIRCLE");
		System.out.println("3.GRETEST AMONF THREE NUMBERS");
		System.out.println("4.CREATING A BOX OBJECT AND FINDING VOLUME");
		System.out.println("5.INHERITANCE");
		System.out.println("6.USING SUPER KEYWORD");
		System.out.println("enter your choice:");
		n=s.nextInt();
		if(n>6)
		{
			System.out.println("enter correct choice:");
			n=s.nextInt();
		}
			switch(n)
		{
			case 1: example exam=new example();
					exam.hello();
					break;
			case 2: circle cr=new circle();
					cr.circlearea();
					break;
			case 3: teja tj=new teja();
					tj.bas();
					break;

			case 4: greatestnumber gn=new greatestnumber();
					gn.great();
					break;
			case 5: objin k=new objin();
					k.inher();
					break;
			case 6: supe ep=new supe();
					ep.sup();
					break;
		}
		}
		
		if(ch==2)
		{
		System.out.println("\nExp-1:BASIC ARITHMETIC OPERATIONS");
		System.out.println("\nExp-2:WHETHER A GIVEN STRING IS A PALINDROME OR NOT");
		System.out.println("\nExp-3:SET OF PRIME NUMBERS BETWEEN TWO GIVEN RANGES");
		System.out.println("\nExp-4:SORTING A GIVEN LIST OF NAMES");
		System.out.println("\nExp-5:USING STRING TOKENIZER CLASS");
		System.out.println("\nExp-6:FOR CREATING MULTIPLE THREADS USING THREAD CLASS");
		System.out.println("\nExp-7:FOR CREATING MULTIPLE THREADS USING RUNNABLE INTERFACE");
		System.out.println("\nExp-8: HOW RUN TIME POLYMORPHISM IS ACHIEVED");
		System.out.println("\nExp-9:IMPLEMENTS INTERFACES CONCEPT");
		System.out.println("\nExp-10:HANDLING PREDEFINED EXCEPTIONS");
		System.out.println("\nExp-11:HANDLING USER DEFINED EXCEPTIONS"); 
		System.out.println("\nenter your choice:");
		n=s.nextInt();
		if(n>11)
		{
			System.out.println("enter the correct choice:");
			n=s.nextInt();
		}
		switch(n)
		{
			case 1: Arithmetic ar=new Arithmetic();
					ar.basicoper1();
					break;
			case 2: palindrome p=new palindrome();
					p.pal();
					break;
			case 3: prime1 pr=new prime1();
					pr.primerange();
					break;

			case 4: exp3 ex=new exp3();
					ex.stringsort();
					break;
			case 5: StringToken st=new  StringToken();
					st.stringtok();
					break;
			case 6: Multiple_Thread1 mu=new Multiple_Thread1();
					mu.thred();
					break;
			case 7: Multiple_Thread2 m=new Multiple_Thread2();
					m.thred1();
					break;
			case 8:Splender sp=new Splender();
					sp.sb();
					break;
			

			case 9: Interface i=new Interface();
					i.interfac();
					break;
			
			case 10: predefexc e=new predefexc();
					e.exc();
					break;
			
			
			case 11: Newexce ne=new Newexce();
					ne.ex();
					
					break;
			
			
		}
		}
		System.out.println("do you want to choose again:(y/n):");
		c=s.next().charAt(0);
		if(c=='y')
			f=1;
		else
			f=0;
		}
}
}
	
	
class Arithmetic
{
	void basicoper1()
	{
		Scanner s=new Scanner(System.in);

		int a,b;
		System.out.println("Enter two numbers:");
		a=s.nextInt();
		b=s.nextInt();
		

		System.out.println("addition= "+(a+b));
		System.out.println("difference= "+(a-b));
		System.out.println("division= "+(a/b));
		System.out.println("remainder= "+(a%b));
		System.out.println("product= "+(a*b));
	}
}
class palindrome
{
void pal()
{        
 Scanner s=new Scanner(System.in);
System.out.print("Enter a String: ");
                 String s1=s.next();
                 String s2=new String();
int n=s1.length();
for(int i=n-1;i>=0;i--)
               s2=s2+ s1.charAt(i);
if(s1.equals(s2)==true)
System.out.println("String is Palindrome");
else
System.out.println("string is not a Palindrome");
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
//runtime polymorphism

class Bike{  
 void run(){System.out.println("running");}  
}  
class Splender extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  
  void sb(){  
    Bike b = new Splender();//upcasting  
    b.run();  
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


 

class predefexc
{
	void exc()
	{
		try
		{
		int a=0;
		System.out.println("a="+a);
		int b=42/a;
		int c[]={1};
		c[42]=998;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
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
			int c=10/a;
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

class box1
{
	double length=2;
	double height=3;
	double width=3;
	box1()
	{
		length=length;
		width=width;
		height=height;
	}
	void volume()
	{
		double vol=length*height*width;
		System.out.println("volume="+vol);
		
	}
	void display()
	{
		System.out.println("length="+length+","+"width="+width+","+"height="+height);
	}
	

}
class teja
{
	void bas()
	{
		box1 ob=new box1();
		
		box1 od=new box1();
			
		ob.volume();
		od.volume();
		ob.display();
		od.display();
		
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
 
class greatestnumber
{
 void great()
 {
int a,b,c,largest;
Scanner s=new Scanner(System.in);
System.out.println("Enter any three numbers: ");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

if(a>=b && a>=c) 
{
System.out.println("Largest number: "+a);
}
if(b>=a && b>=c) 
{
System.out.println("Largest number: "+b);
}
if(c>=a && c>=b) 
{
System.out.println("Largest number: "+c);
}
}
}		
		
		
class box
{
	double width;
	double height;
	double depth;
	box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
}
class boxweight extends box
{
	double weight;
	boxweight(double w,double h,double d,double m)
	{
		super(w,h,d);
		weight=m;
	}
	double vol()
	{
		return width*height*depth;
	}
	
}
class supe{
	void sup()
	{
		boxweight b=new boxweight(1,2,3,4);
		double a=b.vol();
		System.out.println("volume is:"+a);
	}
}	

class ina
{
	int i;
	int j;
	void setdim(int x,int y)
	{
		i=x;
		j=y;
	}
}
class inb extends ina
{
	int total;
	void sum()
	{
		System.out.println( i+","+j );
		total=i+j;
	}
}
class objin
{
	void inher()
	{
		ina sup=new ina();
		inb sob=new inb();
		sob.setdim(2,3);
		sob.sum();
		System.out.println("sum="+sob.total);
	}
}





 


	
		
		












 

