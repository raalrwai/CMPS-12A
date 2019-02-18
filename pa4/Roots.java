//Rami Alrwais
//pa4
//cmps12a
//Find the roots of a polynomial
//
import java.util.Scanner;

class Roots
{

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    double resolution = 0.01;
    double tolerance = 0.00000001;
    double threshold = 0.001;
    double roots;
    int x, y;


    System.out.println ("Enter the degree: ");
    x = sc.nextInt ();	//prompts the user to enter the degree
    y = x + 1;
    double[] C = new double[y];
    System.out.println ("Enter " + y + " ceofficients; ");
    for (int i = 0; i < y; i++)
    {
      C[i] = sc.nextInt ();
    }
    System.out.println("Enter the left and right endpoints: ");
    double a=sc.nextInt();
    double b=sc.nextInt();
    
    if(poly(C,a)*poly(C,b)<0){
                           roots=findRoot(C,a,b,tolerance);
                   }
         }
   
         static double poly(double[] C, double x){
                   int n=C.length-1;//calculates the function
                   int k;
                   double sum=0.0;
                   for(int i=0;i<n;i++){
                             sum+=C[i]*(Math.pow((x-i),n));
                    }
                   return sum;
           }
       static double[] diff(double[] C){//differentiates the function
                 int n=C.length-1;
                 int k;
               double[]D=new double[n];
                 for(int i=0;i<n;i++){
                           D[i]=C[i]*(n-1);
                   }
                 return D;
         }
       static double findRoot(double[] C, double a, double b, double tolerance){
          double width, mid;    
          width = b-a;
         while ( width>tolerance ){
         mid = (a+b)/2;
         if( poly(C, mid)*poly(C, a)<=0 ){
         b = mid;
        } else {
        a = mid;
               }  
          width = b-a;
        } return width;

  
                  }
   }
