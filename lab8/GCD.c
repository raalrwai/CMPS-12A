
#include <stdio.h>

int main()
{
  int x, y, GCD, i;
      
printf("Enter a positive integer: ");
scanf(" %d", &x);
printf("Enter another positive integer: ");
scanf(" %d", &y);
  
 GCD=(x>y)?y:x; /* minimum value is stored in variable min */
 for(i=GCD;i>=1;--i)
 {
 if(x%i==0 && y%i==0)
 {
 printf("'The GCD of %d and %d is %d", x, y,i);
 break;
   
 }
  }
  return 0;
}

