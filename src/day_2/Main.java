package day_2;

import day_2.models.Persona;
import static day_2.models.Persona.introduceYourself;

public class Main {
    public static void main(String[] args){
        String[] myPets = {"Silencio", "Rulfo"};

        Persona pedro = new Persona("Pedro", "Sanabria", 27, 1.84, false, 1098796342, myPets);
        System.out.println(pedro.toString());

        introduceYourself("Pedro", "Sanabria", 27, 1.84, false, 1098796342, myPets);

        String[] gabiPets = {"Mona", "Roberto", "Copito"};
        Persona gabriela = new Persona("Gabriela", "Castelblanco", 25, 1.67, true, 1097893365, gabiPets);
        System.out.println(gabriela);

        introduceYourself("Gabriela", "Castelblanco", 25, 1.67, true, 1097893365, gabiPets);
    }
}
