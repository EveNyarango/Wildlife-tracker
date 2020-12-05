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


    public endangered( String name, String health, int age) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.age = age;
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
}
