package day_3;

import static day_3.Persona.introduceYourself;

public class Main {
    public static void main(String[] args) {

        // creo instancias de Persona
        Persona pedro = new Persona("Pedro", "Luis", 27, 1.85, false, 1098796342);
        Persona gabriela = new Persona("Gabriela", "Castelblanco", 25, 1.67, true, 1097893365);

        // Creo instancias de Pets
        Pet mascota1 = new Pet("Fido", PetType.DOG, 5);
        Pet mascota2 = new Pet("Luna", PetType.CAT, 3);
        Pet mascota3 = new Pet("Silencio", PetType.BIRD, 2);
        Pet mascota4 = new Pet("Rulfo", PetType.FISH, 1);
        Pet mascota5 = new Pet("Ortencio", PetType.OTHERS, 2);

        // Asigno las Pets a la Persona1
        pedro.addPet(mascota1);
        pedro.addPet(mascota2);

        // Llamo función introduce yourself
        introduceYourself(pedro);

        // Asigno las Pets a la Persona2
        gabriela.addPet(mascota3);
        gabriela.addPet(mascota4);
        gabriela.addPet(mascota5);

        // Llamo función introduce yourself
        introduceYourself(gabriela);

        // Imprimo información
        System.out.println(pedro);
        System.out.println(gabriela);
    }
}
