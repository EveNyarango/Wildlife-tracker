package models;
//import models.Endangered;

import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class Endangered {
    private int id;
    private String name;
    private String health;
    private String age;

    public static final String HEALTHY = "healthy";
    public static final String ILL = "ill";
    public static final String OKAY = "okay";
    public static final String NEWBORN = "newborn";
    public static final String YOUNG = "young";
    public static final String ADULT = "adult";

    private static final String DATABASE_TYPE = "endangered";
    private int type;

    public Endangered(String name, String health, String age, String type) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.age = age;
//        this.setType(DATABASE_TYPE);
        type = DATABASE_TYPE;
    }

//    public static List<Endangered> All() {
//        return list;
//    }

    private void setType(String databaseType) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    public static String getDatabaseType() {
        return DATABASE_TYPE;
    }


    @Override
    public boolean equals(Object otherEndangered){
        if (!(otherEndangered instanceof Endangered)) {
            return false;
        } else {
            Endangered newEndangered = (Endangered) otherEndangered;
            return this.getName().equals(newEndangered.getName()) &&
                    this.getId() == newEndangered.getId();
        }
    }

    public void save() {
        try (Connection con = DB.sql2o.open()){
            String sql = "INSERT INTO animals (name, health, age, type) VALUES (:name, :health, :age, :type)";
            this.id = (int) con.createQuery(sql,true)
                    .addParameter("name", this.name)
                    .addParameter("health", this.health)
                    .addParameter("age", this.age)
                    .addParameter("type", this.type)
                            .executeUpdate()
                            .getKey();
        }
    }

    public void delete() {
        try(Connection con = DB.sql2o.open()) {
            String sql = "DELETE FROM animals WHERE id = :id;";
            con.createQuery(sql)
                    .addParameter("id", this.id)
                    .executeUpdate();
        }catch (Sql2oException ex ){
            System.out.println(ex);
        }
    }
}
