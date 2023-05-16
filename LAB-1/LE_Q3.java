/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args)
	{
	    int i,x,value=0;
	    x=Integer.parseInt(args[0]);
	    for(i=1;i<=10;i++)
	    {
	        value=x*i;
	        System.out.println(x+"*"+i+"="+value);
	    }
	    
	    
	}
}

