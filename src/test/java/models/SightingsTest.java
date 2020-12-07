package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class SightingsTest {



    @Test
    public void Sighting_location_true_string(){
        Sightings testSightings = new Sightings("Zone B", "Kamala", "tiger");
        assertEquals("Zone B", testSightings.getLocation());
    }
//    @Test
//    public void save_successfully_List() {
//        Sightings testSightings = new Sightings("Zone A", "Kamala", "Zebra");;
//        testSightings.save();
//        assertTrue(Endangered.getAllEndangered().get(0).equals(testSightings));
//    }

}