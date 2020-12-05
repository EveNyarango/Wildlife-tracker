package models;

public abstract class animals {
    private int id;
private String animalName;

    public animals(int id, String animalName) {
        this.id = id;
        this.animalName = animalName;

    }

    public int getId() {
        return id;
    }

    public String getAnimalName() {
        return animalName;
    }
}
