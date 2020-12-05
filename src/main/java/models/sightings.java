package models;

public class sightings {
    private int id;
    private String location;
    private String rangerName;

    public sightings(String location, String rangerName) {
        this.id = id;
        this.location = location;
        this.rangerName = rangerName;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getRangerName() {
        return rangerName;
    }
}
