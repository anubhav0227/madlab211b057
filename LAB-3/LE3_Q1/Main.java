/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Main {

      public static void main(String args[])

   {

      Pandavs Arjun = new Pandavs();

      Pandavs Bheem = new Pandavs();



      int kindness = Arjun.GetKindness();

      Bheem.SetKindness(kindness-1);



      Kauravs kauravs[] = new Kauravs[100];



      Kauravs Vikran = new Kauravs();



     Vikran.SetKindness(10);

     Vikran.SetObedience(10);



      kauravs[0] = Vikran;



      for (int iLoop=1; iLoop<100; iLoop++)

      {

            kauravs[iLoop]= new Kauravs();

      }     





   }



 }
