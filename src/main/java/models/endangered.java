package models;

public class endangered {
    private int id;
    private String name;
    private String health;
    private int age;

    public static final String HEALTHY = "healthy";
    public static final String ILL = "ill";
    public static final String OKAY = "okay";
    public static final String NEWBORN = "newborn";
    public static final String YOUNG = "young";
    public static final String ADULT = "adult";

    private static final String DATABASE_TYPE = "endangered";

    public endangered(String name, String health, int age, String type) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.age = age;
        this.setType(DATABASE_TYPE);
    }

    private void setType(String databaseType) {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHealth() {
        return health;
    }

    public int getAge() {
        return age;
    }

    public static String getDatabaseType() {
        return DATABASE_TYPE;
    }
}
