package day_3;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    // Properties
    private String firstName;
    private String lastName;
    private int identityCard;
    private int age;
    private double height;
    private boolean married;
    private List<Pet> pets = new ArrayList<>();

    // Builders
    public Persona(String firstName, String lastName, int age, double height, boolean married, int identityCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public Persona(){
    }

    // Accessory Methods:
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

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    // Class Methods:
    public void addPet(Pet pet) {
        pet.setOwner(this);
        pets.add(pet);
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
                ", pets=" + pets +
                '}';
    }

    public static void introduceYourself(Persona persona) {
        System.out.println("\nPresentación de " + persona.getFirstName() + ": ");
        System.out.println("Hola!, Mi nombre es " + persona.getFirstName() + " " + persona.getLastName() + ".");
        System.out.println("Tengo " + persona.getAge() + " y mido " + persona.getHeight() + " metros de altura.");
        if (persona.isMarried()) {
            System.out.println("Estoy casado/a");
        } else {
            System.out.println("No estoy casado/a");
        }
        System.out.println("Mi c.c. es: " + persona.getIdentityCard());
        System.out.println("Mis mascotas se llaman:");
        for (Pet pet : persona.getPets()) {
            System.out.println(pet.getName() + " es un " + pet.getType() + " y tiene: " + pet.getAge() + " años");
        }
        System.out.println(" ");
    }
}
