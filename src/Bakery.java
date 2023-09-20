import java.util.ArrayList;
class Bakery {
       private ArrayList<Pastry> pastries;

               public Bakery() {
                   pastries = new ArrayList<>();
              }

               public void addPastry(Pastry pastry) {
                   pastries.add(pastry);
               }

               public void displayPastries() {
                  System.out.println("Pastries in the bakery:");
                  for (Pastry pastry : pastries) {
                          System.out.println("Pastry: " + pastry.getName());
                          pastry.displayIngredients();

                      if (pastry instanceof Cake) {
                          Cake cake = (Cake) pastry;
                          System.out.println("Cake Flavor: " + cake.getFlavor());
                          System.out.println("Cake Size: " + cake.getSize());
                      } else {
                          System.out.println("This is not a Cake.");
                      }

                      System.out.println();
                  }
                           System.out.println();
                      }
}

