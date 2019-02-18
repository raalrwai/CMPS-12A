//Rami Alrwais
//Date: 03/04/16
//Program: pa
//Description: This program takes an input given by the user and
//populates an array 1-n and usese next permutation to see if the array
//is a solution to the N-Queens theorem
import java.util.Scanner;

class Queens{

public static void quit(){//Prints correc usage commands to user
   System.err.println("Usage: Queens [-v] number");
   System.err.println("Option: -v verbose output, print all solutions");
   System.exit(1);
}

static void printArray(int[]X){//This prints an array 1-n
  System.out.print("(");
  for(int i=1; i<X.length; i++)
  if(i != X.length - 1){
    System.out.print(X[i]+", ");
  }else{
    System.out.print(X[i]);
  }
  System.out.println(")");
}

static void swap(int[]Q, int i, int j){//Swaps an integer in Next Permutation
   int tmp = Q[i];
      Q[i] = Q[j];
      Q[j] = tmp;
}

static void reverse(int[] T, int i){//Reverses an integer 1-n
  int j = T.length-1;
  while(i<j){
      swap(T, i, j);
      i++;
      j--;
    }
}
static boolean isSolution(int[]A){//Checks to see if array is a solution to N-Queens
for(int i=1; i<A.length-1; i++){
  for(int j = i+1; j<A.length; j++){
    if(Math.abs(j-i)==Math.abs(A[j]-A[i]))return false;
  }
}
return true;
}
static int[] populateArray(int n){//Populates array0
  int[] A = new int[n+1];
  for(int i=n; i>0; i--){
    A[i] = i;
  }
  return A;
}

static int fact(int n){
  if(n>0){
    return n*fact(n-1);
  }else{
    return 1;
  }
}


//create a function that creates the board from n
//another function that tests each possible outcome
//using permutations
static void nextPermutation(int [] A ){
 int pivot = -1;
 int successor = -1;
  for(int i = A.length-2; i>=0 ;i--){
      if(A[i]<A[i+1]){
        pivot = i;
        break;
      }
  }
if(pivot==-1){
  reverse(A,0);
return;
}
for(int i = A.length-1; i>=0;i--){
  if(A[i] > A[pivot]){
    successor = i;
    break;
  }
}
swap(A, pivot, successor);
reverse(A, pivot+1);
return;

}



public static void main(String[]args){//Uses Helper functions in Main to solve N-Queens
//saving board size nxn
int n = 0;
int fact = 0;
int count = 0;
boolean verbose = false;
int[] A = new int[1];

if (args.length == 1){
  try{
   n = Integer.parseInt(args[0]);
  }catch(NumberFormatException e){
    quit();
  }
  A = populateArray(n);
}

else if (args.length == 2){

  if(args[0].compareTo("-v")==0){
    verbose = true;
  }else quit();

   try{
     n = Integer.parseInt(args[1]);
   }catch(NumberFormatException e){
     quit();
   }
   A = populateArray(n);
}
else{
  quit();
}//end if else

fact = fact(n);

if(verbose == false){
    for(int i = 1; i<fact; i++){
      if(isSolution(A)){
        count++;
        nextPermutation(A);
      }else{
        nextPermutation(A);
      }
    }
}else{
  for(int i= 1; i<fact; i++){
    if(isSolution(A)){
      count++;
      printArray(A);
      nextPermutation(A);
    }else{
      nextPermutation(A);
    }
  }
}
System.out.println(n+ "-Queens has "+count +" solutions");//Prints number of solutions


}//end main


}//end Queens

