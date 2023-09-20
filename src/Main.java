public class Main {
      public static void main(String[] args) {
                  Ingredient flour = new Ingredient("Flour");
                   Ingredient sugar = new Ingredient("Sugar");

                  Pastry croissant = new Pastry("Croissant");
                   croissant.addIngredient(flour);
                   croissant.addIngredient(sugar);

                   Pastry muffin = new Pastry("Blueberry Muffin");
                   muffin.addIngredient(flour);
                   muffin.addIngredient(sugar);

                   Bakery bakery = new Bakery();
                   bakery.addPastry(croissant);
                   bakery.addPastry(muffin);

                   bakery.displayPastries();

                   Cake myCake = new Cake("Wedding Cake", "Vanilla", 5);
                   bakery.displayPastries();
              }
  }