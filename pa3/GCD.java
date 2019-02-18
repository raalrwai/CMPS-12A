 /*===============================================// 
 //  Author:      Rami Alrwais                    //
 //  Date:        02/02/16                        //
 //  Program:     Pa3                             //
 //  Description: This program takes two positive // 
 //  integers and evaluates its gcd               //
 //                                               //
 //                                               //
 //===============================================*/
import java.util.Scanner;
 class GCD{
   public static void main (String[]args){
     int r,q;
     r=0;
    System.out.println("Enter a positive integer: ");
    Scanner sc = new Scanner(System.in);
   // int a = 0;
  int a, b;
   // int b = 0;
    while(true){
	  while( !sc.hasNextInt() ){//!done means that it is still up for evaluation
    a = sc.nextInt();
    System.out.println("Enter another positive integer");
    }
   a = sc.nextInt();
   if ( a>0 ) break;
   System.out.println("Enter another positive integer");
      }
    System.out.println("Enter a positive integer");
    while(true){
	  while( !sc.hasNextInt() ){
      b = sc.nextInt();
      System.out.println("Enter another positive integer");
    }
    b = sc.nextInt();
      if( b>0 ) break;
      System.out.println("Enter another positive integer");
    }
	 if (b > a){    //a =b*q +r, therefore if user doesnt know code it fixes format
	     int temp = a;///5, 10 = 
	     a = b;
	     b = temp;
	  }
	while(b!=0)
  //while (a%b!=0)
 {
	   r = a%b;
	   q = a/b;
	     a = b;
	     b = r;
	  }
	 System.out.println("The GCF of a and b is " + a);
      }
    }  
 
