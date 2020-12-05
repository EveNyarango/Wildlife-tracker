package models;

import java.util.Objects;

public class Animals {
    private int id;
private String animalName;

public String type;
    private final String DATABASE_TYPE = "animal";

    public Animals(int id, String animalName) {
        this.id = id;
        this.animalName = animalName;

    }

    public int getId() {
        return id;
    }

    public String getAnimalName() {
        return animalName;
    }

    @Override
    public boolean equals (Object otherAnimals){
        if (!(otherAnimals instanceof Animals)){
            return false;
        }else{
            Animals newAnimals = (Animals) otherAnimals;
            return this.getAnimalName().equals(newAnimals.getAnimalName()) &&
                    this.getId() == newAnimals.getId();
        }
    }
}
