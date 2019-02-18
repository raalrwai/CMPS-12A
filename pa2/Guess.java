/*===============================================// 
//  Author:      Rami Alrwais                    //
//  Date:        01/25/16                        //
//  Program:     Pa2                             //
//  Description: This program picks a            //
//  random integer between 1 and 10              //
//  depending on the seed number    	           //
//  entered directs the user        	           //
//  throuh the process of guessing  	           //
//  and leting the user know the    	           //
//  result                          	           //
//                                  	           //
//===============================================*/

import java.util.*;

public class Guess
{         
  public static final int Max_Guess = 10;

  public static void main(String[] args)
  {

    Scanner scan = new Scanner( System.in ); //defines a scanner /*sets variables*/
    int guess;     //seed value
    int answer = (int)(Math.random()*10 + 1);   //random number value
    int tries = 3;         //Sets tries to 3
    int guesses;     
    System.out.print("I'm thinking of an integer in the range 1 to 10.You have three guesses: "); 
    System.out.print("Enter your first guess.");
    guess = scan.nextInt(); //sets the seed value
    while (true)
    {
      if (guess != answer)
      {
        //	while (guess != answer)
        // 	{//
        if(tries == 1){
          System.out.println("You lose, the number was " + answer);
          return;
        }
        if (guess < answer)
        {
          System.out.print("Your Guess is too low.:"); //prompts the user to guess
          // a higher number
          guess = scan.nextInt(); //sets the guess variable to the new guess
        }      
        else  {
          System.out.print("Your Guess is too high.:");//prompts the user to guess a
          // lower number
          guess = scan.nextInt();//sets the guess variable to the new guess tries = tries +1;
        }   tries = tries - 1;
        //	}
      }
      else
      {
        //	if (tries == 1)
        System.out.print("You Win!");
        return;
      }	
    }
  }
}
/*
 *
 * The code contines to operate untill the usrer guesse's the random numbe
 */


