# HMC_HW_01
## Homework 01
- Task 1

  Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four attributes—a part number (type string), a part description (type string), a quantity of the item being purchased (type int) and a price per item (type int). Your class should have a constructor that initializes the four attributes. Provide a set and a get method for each attribute. In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as an int value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0. Write a test program that demonstrates class Invoice’s capabilities.
- Task 2

  Bonus exercise for extra credit.

  Implement a class Car with the following properties. A car has a certain fuel efficiency (measured in km/litre) and a certain amount of fuel in the fuel tank. The efficiency is specified in the constructor, and the initial fuel level is 0. Supply a method drive that simulates driving the car for a certain distance, reducing the fuel level in the tank, and methods getFuelLevel, to return the current fuel level, and addFuel, to tank up. Sample usage:
    - Car myHybrid = new Car(30); // 30 km per litre
    - myHybrid.addFuel(20); // Tank 20 litres
    - myHybrid.drive(100); // Drive 100 km
    - System.out.println(myHybrid.getFuelLevel()); //Print fuel remaining

- Task 3

  There is an interface Measurable:
  public interface Measurable {
  double getMeasure();
  }

    - Write and test a method

    - public static Measurable maximum(Measurable[] objects)

    - that returns the object with the largest measure.

  Use that method to determine the country with the largest area from an array of countries.