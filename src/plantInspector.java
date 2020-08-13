import java.util.concurrent.*;
import java.util.*;
public class plantInspector {
    // Some global variables
    public static class personalDetailsAndIntroduction {
      String name = "Name: John";
      String age = "Age: 22";
      String companyFrom = "Company name: Literally Rotten Tomato";
      String creditCardNumber = "HSCH SHJF SJKL"; // Just for fun ;)
      String intro = "Hello there, I'm an inspector for the Literally Rotten Tomato organization keeping plant safety on par.";
      public void moodOMeter() {
        if (Math.random() < 0.5) {
          System.out.println("The inspector is happy today, lucky for you.");
          boolean angryOrNot = false; // lel completely worthless code but idc.
        }
        else {
          System.out.println("The inspector is mad right now, don't do anything suspicious with your plants, otherwise, he'll get angry.");
          boolean angryOrNot = true; // another completely worthless code haha
        }
        // Flip a coin kinda method
      }
      public void space() {
        System.out.println(" "); // Kinda almost useless cause you can do /n but eh.
        }
    }
    public static void main(String[] args) {
        personalDetailsAndIntroduction obj1 = new personalDetailsAndIntroduction();
        // make obj to access class
        // Print variables
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.companyFrom);
        // Say his mood
        obj1.moodOMeter();
        obj1.space(); // Space between it
        // Introduction
        Scanner ascanner = new Scanner(System.in);
        System.out.println(obj1.intro);
        System.out.println("So, how do you want to present your plants? [Options, 1 is for Just do it, now! or 2 is for Later]");
        obj1.space();
        int theInputTaken = ascanner.nextInt();
        switch (theInputTaken) {
            case 1:
                System.out.println("Okay, fine!");
            break;
            case 2:
                System.out.println("Okay bud, now exit the program.");
            break;
            default:
                System.out.println("You didn't write the correct response, try again.");
            break;
        }
        System.out.println("End of program, proceed to plant.");
    }
  }
