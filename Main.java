import java.util.Scanner; 
/**
 *
 * @author Liana Bazzarella 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner (System.in);

    // declare variable that stores Celsius temperature
    int celsiusTemperature; 

    //ask the user for Celsius temperature
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");

    // initialize the users Celsius temperature
    celsiusTemperature = input.nextInt();

    //declare and calculate Fahrenheit temperature
    int fahrenheitTemperature = (celsiusTemperature*9)/5+32;

    //tell the user the temperature in Fahrenheit 
    System.out.println(celsiusTemperature + "C"+ " is the same as "+ fahrenheitTemperature+ "F");


  }
}
