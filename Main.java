import java.util.Scanner;




class Main {
  public static void main(String[] args) {
    int avgMenopauseAge = 51;
    int avgMenstrualProductPerCycle = 20;
    int avgMenstrualProductsPerYear = avgMenstrualProductPerCycle * 12;
    
    
    Scanner keyboardInput = new Scanner(System.in);
    System.out.print("Enter your name: "); 
    String name = keyboardInput.nextLine();

    System.out.print("Enter your age: "); 
    int age = keyboardInput.nextInt();

    int yearsLeftToMenstrate = avgMenopauseAge - age;
    int productsSaved = yearsLeftToMenstrate * avgMenstrualProductsPerYear;
    System.out.println("");
    System.out.println("Hey " + name + "!");
    System.out.println("Did you know that by swithcing to a reusable menstrual product, you would save " + productsSaved + " plastic products from ending up in the environment!");
  }
}