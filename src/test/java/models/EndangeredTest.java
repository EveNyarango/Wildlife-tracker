package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredTest {

    @Test
    public void Animals_instantiatesName_of_the_animal_true_String(){
        Endangered testEndangered = new Endangered("Lion", "okay", 10, "Female");
        assertEquals("Lion", testEndangered.getName());
    }

//    @Test
//    public void saveMethodWorks(){
//        Endangered tiger = new Endangered("Lion", "okay", 10, "Female");
//        tiger.save();
//        System.out.println("successfully saved");
//        assertEquals(tiger.getName(), Endangered.All().get(0).getName());
//    }

    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }
}