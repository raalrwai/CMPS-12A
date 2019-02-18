/*
 * Program to find the volume and surface area of a sphere
 */
#include <stdio.h>
   #include <math.h>

 int main()
{

  const double pi = 3.141592654;
  float r;
  float surface_area, volume;
  printf("Enter the radius of the sphere:");
  scanf("%f", &r);
  surface_area = 4 * pi * r * r;
  volume = (4.0/3) * pi * r * r * r;
  printf("The surface area is: %.3f", surface_area);
 printf("\n The volume is : %.3f\n", volume);
  return 0;

  }
