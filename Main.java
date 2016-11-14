import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InvalidInputException {

    Machine coffeeMachine = new Machine();

    Scanner cmd = new Scanner(System.in);
    String input;
    Character inputChar = 0;

    coffeeMachine.printInventory();
    coffeeMachine.printMenu();

    while (true) {

      input = cmd.nextLine();

      if (input.trim().isEmpty()) {
        continue;
      }
      else if (input.length() > 1) {
        System.out.println("Invalid Selection: " + input);
        coffeeMachine.printInventory();
        coffeeMachine.printMenu();
      }
      else {
        inputChar = input.charAt(0);
        if (inputChar == 'q' || inputChar == 'Q') {
          break;
        }

        if (inputChar == 'r' || inputChar == 'R') {
          coffeeMachine.restock();
          coffeeMachine.printInventory();
          coffeeMachine.printMenu();
          continue;
        }
        else if ((inputChar != 'r' || inputChar != 'R') && (inputChar <= '0' || inputChar >= '7')) {
            System.out.println("Invalid Selection: " + input);
            coffeeMachine.printInventory();
            coffeeMachine.printMenu();
        }

        try {
          if (inputChar >= '1' && inputChar <= '6') {
              DrinkName drinkName = DrinkName.getDrinkName(Character.getNumericValue(inputChar));
              coffeeMachine.dispense(drinkName);
              coffeeMachine.printInventory();
              coffeeMachine.printMenu();
          }
        } catch (OutOfStockException e) {
          System.out.println(e.getMessage());
          coffeeMachine.printInventory();
          coffeeMachine.printMenu();
        }
      }
    }
    cmd.close();
  }
}
