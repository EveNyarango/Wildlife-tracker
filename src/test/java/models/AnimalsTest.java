package models;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import static org.junit.Assert.*;

public class AnimalsTest {

//  @Rule
//  public DatabaseRule database = new DatabaseRule();

  @Test
  public void Animals_instantiatesName_of_the_animal_true_String(){
      Animals testAnimals = new Animals("Rhino");
      assertEquals("Rhino", testAnimals.getAnimalName());
    }

//
//    @Test
//    public void save_animals_to_the_Database() {
//      Animals testAnimals = new Animals(2, "Giraffe");
//      testAnimals.save();
//      assertTrue(Animals.all().get(2).equals(testAnimals));
//    }



}