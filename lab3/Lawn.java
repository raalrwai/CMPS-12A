//Rami Alrwais
//Enter input of house and lawn to recieve calculated output
import java.util.Scanner;
class Lawn {
   public static void main(String[] args ){
      double LotWidth, MowingTime, HouseWidth, MowingRate,  LotHeight, LawnArea, HouseHeight, lotArea, HouseArea;
      double height, width;
      Scanner sc = new Scanner(System.in);
     // System.out.print("Enter the length and width of the lot, in feet: ");
      LotWidth = sc.nextDouble(); 
      LotHeight = sc.nextDouble();
      //System.out.print("Enter the length and width of the house, in feet: ");
      HouseHeight = sc.nextDouble();
      HouseWidth = sc.nextDouble();
      lotArea = LotWidth* LotHeight;
      HouseArea = HouseWidth * HouseHeight;
      LawnArea  = (lotArea - HouseArea);
     // System.out.println("Enter the mowing rate, in square feet per second: ");
      MowingRate =  sc.nextDouble();
      MowingTime = LawnArea/MowingRate;
      System.out.print("The Lawn area is: ");
      System.out.println(LawnArea +"square feet.");
      }
}         
