//Rami Alrwais
//Enter input of house and lawn to recieve calculated output
import java.util.Scanner;
class Lawn {
   public static void main(String[] args ){
      double LotWidth, MowingTime, HouseWidth, MowingRate,  LotHeight, LawnArea, HouseHeight, lotArea, HouseArea;
      double height, width;
      int hour, minute, second;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the length and width of the lot, in feet: ");
      LotWidth = sc.nextDouble();
      LotHeight = sc.nextDouble();
      System.out.print("Enter the length and width of the house, in feet: ");
      HouseHeight = sc.nextDouble();
      HouseWidth = sc.nextDouble();
      lotArea = LotWidth* LotHeight;
      HouseArea = HouseWidth * HouseHeight;
      LawnArea  = (lotArea - HouseArea);
      System.out.println("The Lawn area is: "+ LawnArea + "square feet.");
      System.out.println("Enter the mowing rate, in square feet per second: ");
      MowingRate =  sc.nextDouble();
      


     // MowingTime = LawnArea/MowingRate;
     second = (int) Math.round(LawnArea/MowingRate); //333.6 33
     minute = second/60;
       second = second%60;
       hour = minute/60;
       minute = minute%60;
      System.out.print("The MowingTime is: "+hour +" hour"+(hour==1?". ":"s ") +minute+ " minute"+(minute==1?".":"s ")+second+ " second" + (second==1?".":"s "));
     // System.out.println(hour + " hour " +minute+ " minute " +second+ " seconds.  ");
   }
}

