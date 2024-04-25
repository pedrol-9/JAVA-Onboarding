package day_3;

public class Pet {
    // Properties:
    private String name;
    private PetType type;
    private int age;
    private Persona owner;

    // Builders
    public Pet(String name, PetType type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public Pet() {
    }

    // Accessory Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Persona getOwner() {
        return owner;
    }

    public void setOwner(Persona owner) {
        this.owner = owner;
    }

    //
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                '}';
    }
}
