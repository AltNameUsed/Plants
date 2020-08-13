public class plant {
    // declare the necessary global variables and methods
    public static String hotGarden;
    public String starFruit;
    public static void space() {
        System.out.println(" ");
    }
    public static void main(String[] args) {
        class aChildclass extends plant {
            // declare all the things
            String hotGarden = "A hot and humid garden for your plants here!";
            String starFruit = "A fresh starfruit!";
        }
        class anotherChildclass extends plant {
            String hotGarden = "A newer hot garden for your newer plants here!";
            String starFruit = "A new starfruit!";
        }
        aChildclass o1 = new aChildclass();
        anotherChildclass o2 = new anotherChildclass();
        // SOP the values
        System.out.println("Accessing the first child class.");
        space();
        // Print values
        System.out.println(o1.hotGarden);
        System.out.println(o1.starFruit);
        System.out.println("First subclass done! moving on to the second one.");
        space();
        System.out.println(o2.hotGarden); // print the other class' values
        System.out.println(o2.starFruit);
        space();
        // print final message
        System.out.println("All things are done! thanks for running this program!");
    }
}
