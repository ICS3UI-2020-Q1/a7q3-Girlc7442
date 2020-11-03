/**
 * Prints asterisks to the screen randomly between 1 to 5
 * @author Cole Girling
 */
public class Main {

  public static void chaotic(int n){
     //stops the loop when i is equal to n
     for(int i = 0; i < n; i++){
      //generates a random number between 1 and 5
      int randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
      //uses the randomly generated number to print that many asterisks to the screen
      for(int j = 0; j <= randNum; j++){
        System.out.print("*");
      }
      //spaces the asterisks out
      System.out.println("");
     }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //calls the method and inserts the number into the method
    int n = 5;
    chaotic(n);
    
  }
}
