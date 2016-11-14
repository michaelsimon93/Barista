//The different types of ingredients that are used to make drinks.
//Used enum because these ingredients are constants and have a
//predefined cost. In alphabetical order since that is how they are
//printed when the program is run.
public enum Ingredients {

  COCOA(0.90) {
    @Override public String toString() {
      return "Cocoa";
    }
  },

  COFFEE(0.75) {
    @Override public String toString() {
      return "Coffee";
    }
  },

  CREAM(0.25) {
    @Override public String toString() {
      return "Cream";
    }
  },

  DECAF_COFFEE(0.75) {
    @Override public String toString() {
      return "Decaf Coffee";
    }
  },

  ESPRESSO(1.10) {
    @Override public String toString() {
      return "Espresso";
    }
  },

  FOAMED_MILK(0.35) {
    @Override public String toString() {
      return "Foamed Milk";
    }
  },

  STEAMED_MILK(0.35) {
    @Override public String toString() {
      return "Steamed Milk";
    }
  },

  SUGAR(0.25) {
    @Override public String toString() {
      return "Sugar";
    }
  },

  WHIPPED_CREAM(1.00) {
    @Override public String toString() {
      return "Whipped Cream";
    }
  };

  public double ingredientCost;

  private Ingredients(double cost) {
    this.ingredientCost = cost;
  }

  public double getIngredientCost() {
    return ingredientCost;
  }
}
