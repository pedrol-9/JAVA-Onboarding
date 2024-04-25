package day_2.models;

import java.util.Arrays;

public class Persona {
    String firstName;
    String lastName;
    int identityCard;
    int age;
    double height;
    boolean married;
    String[] petsNames;

    // builders
    public Persona (String firstName, String lastName, int age, double height, boolean married, int identityCard, String[] petsNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.petsNames = petsNames;
    }

    public Persona (){
    }

    // Accessory Methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String[] getPetsNames() {
        return petsNames;
    }

    public void setPetsNames(String[] petsNames) {
        this.petsNames = petsNames;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identityCard=" + identityCard +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married +
                ", petsNames=" + Arrays.toString(petsNames) +
                '}';
    }

    public static void introduceYourself (String firstName, String lastName, int age, double height, boolean married, int identityCard, String[] petsNames) {
        System.out.println("\nPresentación de " + firstName + ": ");
        System.out.println("Hola!, Mi nombre es " + firstName + " " + lastName + ".");
        System.out.println("Tengo " + age + " y mido " + height + " metros de altura.");
        if (married) {
            System.out.println("Estoy casado/a");
        } else {
            System.out.println("No estoy casado/a");
        }
        System.out.println("Mi c.c. es: " + identityCard);
        System.out.println("Mis mascotas se llaman:");
        for (String pet : petsNames) {
            System.out.println(pet);
        }
        System.out.println(" ");
    }
}
