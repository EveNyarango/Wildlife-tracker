package models;
import org.sql2o.Connection;
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
    public void save() {
        try (Connection con = DB.sql2o.open()){
            String sql = "INSERT INTO animals (animalName, type) VALUES (:name, :id, :type)";
            this.id = (int) con.createQuery(sql,true)
            .addParameter("animalName", this.animalName)
                    .addParameter("type", this.type)
                    .executeUpdate()
                    .getKey();
        }
    }

}
