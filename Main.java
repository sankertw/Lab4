import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(51);
    System.out.println("The Random Number is: " + randomNum); //random number

    if (randomNum < 25) {
      while (randomNum != 0) { //counting down from numbers to 0
        randomNum--;
        System.out.println(randomNum);  
      }
      System.out.println("Ahoy Mateys!");      //print ahoy mateys after done counting down

    } else if (randomNum > 25 && randomNum < 42) {
      while (randomNum != 0) {
        randomNum--;
        System.out.println(randomNum);
      }        System.out.println("CannonBall!!"); 

    } else {
      while (randomNum != 0) {
        randomNum--;
        System.out.println(randomNum); 
      }        System.out.println("Blast off!");
    }

  }
}