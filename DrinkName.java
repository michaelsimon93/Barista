import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

//The different types of drinks that you can order.
//Used enum because these drinks are constants and have a
//predefined drink number In alphabetical order since that is how they are
//printed when the program is run.
public enum DrinkName {

  CAFFE_AMERICANO(1) {
    @Override public String toString() {
      return "Caffe Americano";
    }
  },

  CAFFE_LATTE(2) {
    @Override public String toString() {
      return "Caffe Latte";
    }
  },

  CAFFE_MOCHA(3) {
    @Override public String toString() {
      return "Caffe Mocha";
    }
  },

  CAPPUCCINO(4) {
    @Override public String toString() {
      return "Cappuccino";
    }
  },

  COFFEE(5) {
    @Override public String toString() {
      return "Coffee";
    }
  },

  DECAF_COFFEE(6) {
    @Override public String toString() {
      return "Decaf Coffee";
    }
  };

  private int drinkNum;
  private static final Map<Integer, DrinkName> drinks = new HashMap<Integer,DrinkName>();

  private DrinkName(int drinkNum) {
    this.drinkNum = drinkNum;
  }

  public int getDrinkNum() {
    return drinkNum;
  }

  public static DrinkName getDrinkName(int drinkNum) {
    return drinks.get(drinkNum);
  }

  static {
    for (DrinkName drinkName : EnumSet.allOf(DrinkName.class)) {
      drinks.put(drinkName.getDrinkNum(), drinkName);
    }
  }

}
