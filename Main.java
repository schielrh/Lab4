/*
Lab 4
Solo: Ryan Schiell 
Date: 9/21/21
*/

//this imports multiple Java utilities
import java.util.*;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(50);
    randomNum += 1;

    System.out.println("The Random number is: " + randomNum);

    //here is the countdown loop
    for (int numCountdown = randomNum; numCountdown >= 0; numCountdown--){
      System.out.println(numCountdown);
    }

    //this will show the println outputs
    if (randomNum <= 5){
      System.out.println("Ahoy mateys!");
    }
    else if (randomNum > 25 && randomNum < 42){
      System.out.println("Cannonball!");
    }
    else {
      System.out.println("Blast off!");
    }
  }
}