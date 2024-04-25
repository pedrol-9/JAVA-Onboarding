package day_1;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // ***** EJERCICIO 1: Create the corresponding variables to read your first name, last name and age and print them to the console in a sentence.
        // 1ra forma de interpolación:
        String nombre = "Pedro";
        int edad = 27;
        String mensaje = String.format("""
                Hola, mi nombre es %s
                y tengo %d años.
                """, nombre, edad);
        System.out.println(mensaje);

        // 2da forma de interpolación:
        System.out.println("Hola, mi nombre es: " + nombre + " y tengo: " + edad);

        // ***** EJERCICIO 2: Create a method that prints a welcome message to the console.
//        String saludar = saludar();
//        System.out.println(saludar);
        saludar();


        // ***** EJERCICIO 3: Create a small program that allows you to enter 3 numbers and print through the console which one is the largest.
        System.out.println("Enter the first number:");
        byte num1 = scanner.nextByte();

        System.out.println("Enter the second number:");
        byte num2 = scanner.nextByte();

        System.out.println("Enter the third number:");
        byte num3 = scanner.nextByte();

        byte max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("The largest number is: " + max);

        // ***** EJERCICIO 4: Create a small program that allows you to enter a number and print through the console if it is even or odd.
        System.out.println("Enter a number:");
        byte numb = scanner.nextByte();

        if (numb % 2 == 0) {
            System.out.println("The number " + numb + " is an even number");
        } else {
            System.out.println("The number " + numb + " is an odd number");
        }

        // ***** EJERCICIO 5:
        System.out.println("Enter a random string:");
        String s1 = scanner.next();

        System.out.println("Enter a random string:");
        String s2 = scanner.next();

        if (s1.equals(s2)) {
            System.out.println("both string are the same");
        } else {
            System.out.println("the strings are different");
        }

        // ***** EJERCICIO 6: Create a method that receives a number and returns whether it is prime or not.
        System.out.println("Enter a number:");
        byte numero = scanner.nextByte();

        boolean validation = isPrime(numero);

        if (validation){
            System.out.println("your number is prime");
        } else {
            System.out.println("your number is not prime");
        }

        // ***** EJERCICIO 7: Create a method that receives an array of numbers and returns the sum of the odd numbers.

        int[] arrayNumbers = {2, 5, 6, 8, 9, 1};
        int result = sumOfOddNumbers(arrayNumbers);
        System.out.println("\nSum of the odd numbers is: " + result);

        // ***** EJERCICIO 8: Create a method that receives an array of numbers and prints the even numbers and the sum of the prime numbers.
        int result2 = sumPrimeNumbers(arrayNumbers);
        System.out.println("\nThe sum of the prime numbers is: " + result2);


        // ***** EJERCICIO 9: Create a method that prints a small menu through the console with the basic options of a calculator, adding option 0 to exit it.
        printMenu();

        // ***** EJERCICIO 10: Create another method that takes over the previous point to be able to create a small calculator using switch. Take into account the case of division by 0.

        int choice = 0;
        executeCalculator(choice, scanner);

        // EJERCICIO 11: Create the necessary algorithm to be able to manage entry to a bowling alley. It should have a small menu with the following options:

        int choice1;

        do {
            printAMenu();
            System.out.print("Enter your choice: ");
            choice1 = scanner.nextInt();

            switch (choice1) {
                case 1:
                    dataEntry(scanner);
                    break;
                case 2:
                    checkAvailableCapacity();
                    break;
                case 3:
                    checkMoneyRaised();
                    break;
                case 4:
                    System.out.println("Logging out of the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice1 != 4);

        // ***** EJERCICIO 12:

        mainMenu ();

        if (vipPass) {
            if (numbTckts == 1) {
                System.out.println("Great! You can get your ticket for free!");
            } else {
                System.out.println("You can get your ticket for free, and afford the rest of them");
                System.out.println("Do you have a discounted Pass? -true or false");
                discount = scanner.nextBoolean();
                if (discount && vipTicket) {
                    System.out.println("you can get the rest of VIP tickets for half the rate, it's gonna be: " + (1000*(numbTckts-1)) + " in total.");
                    System.out.println("Do you confirm the purchase?");
                    purchaseConfirmed = scanner.nextBoolean();
                    if (purchaseConfirmed) {
                        maxCapacity -= numbTckts;
                        usdIncome += (1000*(numbTckts-1));
                        peopleIn += numbTckts;
                        systemManager ();
                    } else {
                        System.out.println("thanks for coming today!");
                        systemManager ();
                    }

                } else if (!discount && vipTicket) {
                    System.out.println("you can get the rest of VIP tickets for: " + (numbTckts-1) * vipEntry + " per person");
                    System.out.println("The total is gonna be: " + (numbTckts-1) * vipEntry + " Do you confirm the purchase?");
                    purchaseConfirmed = scanner.nextBoolean();
                    if (purchaseConfirmed) {
                        maxCapacity -= numbTckts;
                        usdIncome += (numbTckts-1) * vipEntry;
                        peopleIn += numbTckts;
                        systemManager ();
                    } else {
                        System.out.println("thanks for coming today!");
                        systemManager ();
                    }
                } else if (discount) {
                    System.out.println("You can get the rest of the tickets for: " + (normalEntry * .5) + " pp");
                    System.out.println("The total is gonna be: " + (numbTckts-1)*(normalEntry/2) + " Do you confirm the purchase?");
                    purchaseConfirmed = scanner.nextBoolean();
                    if (purchaseConfirmed) {
                        maxCapacity -= numbTckts;
                        usdIncome += (numbTckts-1)*(normalEntry/2);
                        peopleIn += numbTckts;
                        systemManager ();
                    } else {
                        System.out.println("thanks for coming today!");
                        systemManager ();
                    }
                }
            }
        } else {
            System.out.println("Do you have a discounted Pass? -true or false");
            discount = scanner.nextBoolean();
            if (discount && vipTicket) {
                System.out.println("you can get your VIP tickets for half the rate, it's gonna be $1.000 pp");
                System.out.println("Do you confirm the purchase?");
                purchaseConfirmed = scanner.nextBoolean();
                if (purchaseConfirmed) {
                    maxCapacity -= numbTckts;
                    usdIncome += (1000*numbTckts);
                    peopleIn += numbTckts;
                    systemManager ();
                } else {
                    System.out.println("thanks for coming today!");
                    systemManager ();
                }
            } else if (!discount && vipTicket) {
                System.out.println("you can get the VIP tickets for: " + vipEntry + " per person");
                System.out.println("The total is gonna be: " + vipEntry * numbTckts + " Do you confirm the purchase?");
                purchaseConfirmed = scanner.nextBoolean();
                if (purchaseConfirmed) {
                    maxCapacity -= numbTckts;
                    usdIncome += (numbTckts * vipEntry);
                    peopleIn += numbTckts;
                    systemManager ();
                } else {
                    System.out.println("thanks for coming today!");
                    systemManager ();
                }
            } else if (discount) {
                System.out.println("You can get the tickets for: " + normalEntry * .5 + " pp");
                System.out.println("The total is gonna be: " + normalEntry * numbTckts + " Do you confirm the purchase?");
                purchaseConfirmed = scanner.nextBoolean();
                if (purchaseConfirmed) {
                    maxCapacity -= numbTckts;
                    usdIncome += (normalEntry * numbTckts);
                    peopleIn += numbTckts;
                    systemManager ();
                } else {
                    System.out.println("thanks for coming today!");
                    systemManager ();
                }
            }
        }

        returnMainMenu ();

//      scanner.close();
    }

    //variables punto 11:
    public static int availableCapacity = 100;
    public static double moneyRaised = 0.0;

    public static void saludar() {

//        return "Hello world";
        System.out.println("Hello World");
    }

    // initializing scanner:
    public static Scanner scanner = new Scanner(System.in);

    // método del ejercicio 6:
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

//        for (int i = 2; i <= number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }

        return true;
    }

    // método del ejercicio 7:
    public static int sumOfOddNumbers (int[] numbers) {
        int sumOdd = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sumOdd += number;
            }
        }
        return sumOdd;
    }

    // método del ejercicio 8:
    public static int sumPrimeNumbers(int[] numeros) {
        int sumPrime = 0;
        int evenNumb = 0;
        for (int number : numeros) {
            if (number % 2 == 0) {
                evenNumb += number;
            }
        }

        for (int number : numeros) {
            if (isPrime(number)) {
                sumPrime += number;
            }
        }

        System.out.println("\nThe sum of even numbers is: " + evenNumb);
        return sumPrime;
    }

    // método del ejercicio 9:
    public static void printMenu() {
        System.out.println("Calculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
    }

    // método del ejercicio 10:
    public static void executeCalculator (int choice, Scanner scanner) {
        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Perform addition operation...");
                    break;
                case 2:
                    System.out.println("Perform subtraction operation...");
                    break;
                case 3:
                    System.out.println("Perform multiplication operation...");
                    break;
                case 4:
                    System.out.println("Perform division operation...");
                    break;
                case 0:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 0);
    }

    // métodos del ejercicio 11:
    public static void printAMenu() {
        System.out.println("\nBowling Alley Manager:");
        System.out.println("1. Data Entry");
        System.out.println("2. Check Available Capacity");
        System.out.println("3. Check Money Raised");
        System.out.println("4. Log Out");
    }

    public static void dataEntry(Scanner scanner) {
        System.out.print("Enter number of people entering: ");
        int peopleEntering = scanner.nextInt();
        availableCapacity -= peopleEntering;

        System.out.print("Enter amount of money raised: $");
        double amountRaised = scanner.nextDouble();
        moneyRaised += amountRaised;

        System.out.println("Data entry successful.");
    }

    public static void checkAvailableCapacity() {
        System.out.println("Available Capacity: " + availableCapacity);
    }

    public static void checkMoneyRaised() {
        System.out.println("Money Raised: $" + moneyRaised);
    }

    // Métodos y variables del ejercicio 12:
    public static int maxCapacity = 500;
    public static int normalEntry = 1500;
    public static int vipEntry = 2000;
    public static String name;
    public static int age;
    public static int personalId;
    public static boolean vipTicket;
    public static boolean vipPass;
    public static boolean discount;
    public static int numbTckts;
    public static boolean purchaseConfirmed;
    // variables publicas para crear métodos de system manager
    public static int usdIncome = 0;
    public static int peopleIn;

    public static void mainMenu () {
        System.out.println("Hi, welcome tickets.com");

        System.out.println("How many tickets you'd like to get?");
        numbTckts = scanner.nextInt();

        System.out.println("You want to buy the VIP tickets? -true or false");
        vipTicket = scanner.nextBoolean();

        System.out.println("\nPlease enter your name");
        name = scanner.next();

        System.out.println("Please, enter your age");
        age = scanner.nextInt();
        String ageValidation = ageValidation(age);
        System.out.println(ageValidation);

        System.out.println("Please, enter your ID");
        personalId = scanner.nextInt();

        System.out.println("Do you have a VIP pass to get the tickets? -true or false");
        vipPass = scanner.nextBoolean();
    }

    public static void returnMainMenu () {
        mainMenu ();
        scanner.close();
    }

    public static String ageValidation (int age) {
        if (age < 21) {
            return "I am sorry, you're not allowed to purchase a ticket, only 21 and older";
        }
        return "you're eligible to get the tickets, please follow the next steps";
    }

    public static void systemManager () {
        System.out.println("\nSystem Manager:");
        System.out.println("your current usd income is: " + usdIncome);
        System.out.println("you've sold: " + peopleIn + " and your current maxCap. is: " + maxCapacity );
    }

}



