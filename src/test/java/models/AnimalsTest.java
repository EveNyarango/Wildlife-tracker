package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest {

  @Test
  public void Animals_instantiatesName_of_the_animal_true_String(){
      Animals testAnimals = new Animals(1, "Rhino");
      assertEquals("Rhino", testAnimals.getAnimalName());
    }

    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }
}