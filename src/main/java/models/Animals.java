package models;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;
import java.util.List;
import java.util.Objects;

public class Animals {
    private int id;
private String animalName;

public String type;
    private final String DATABASE_TYPE = "animal";
//    private final Sql2o sql2o;

    public Animals(int id, String animalName) {
        this.id = id;
        this.animalName = animalName;
//        this.sql2o = sql2o;
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

//    add interface
//    @Override
//    public List<Animals>getAllAnimals() {
//        String sql = "SELECT * FROM animals WHERE type='animal'";
//        try (Connection con = sql2o.open()) {
//            return con.createQuery(sql)
//                    .throwOnMappingFailure(false)
//                    .executeAndFetch(Animals.class);
//        } catch (Sql2oException ex) {
//System.out.println( ex);
//return null;
//        }
//    }

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
public void delete(){
    try (Connection con = DB.sql2o.open()){
        String sql = "DELETE FROM animals WHERE id =:id;";
        con.createQuery(sql)
        .addParameter("id", this.id)
                .executeUpdate();
    }
}
}
