import models.Animals;
import models.Endangered;
import models.Sightings;
import spark.Request;
import spark.Response;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
import static spark.Spark.staticFileLocation;

public class App {
    public static void main (String[] args){
        staticFileLocation("/public");

//        homepage
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

//        animals
        get("/AnimalForm", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "AnimalForm.hbs");
        }, new HandlebarsTemplateEngine());
//
        post("/addAnimal", (request, response) -> {

            Map<String, Object> model = new HashMap<>();
            int id = Integer.parseInt(request.params("id"));
            String animalName = request.queryParams("animalName");

            Animals animals = new Animals(id,animalName);
            animals.save();
            model.put("animals", animals);
            return new ModelAndView(model, "successAnimal.hbs");

        }, new HandlebarsTemplateEngine());


//endangered
        get("/EndangeredForm", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "EndangeredForm.hbs");
        }, new HandlebarsTemplateEngine());


        post("/report", (request, response) -> {

            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String health = request.queryParams("health");
            String age = request.queryParams("age");
            String type = request.queryParams("type");

            Endangered endangered = new Endangered(name, health,age, type);
            endangered.save();
            model.put("endangered", endangered);
            return new ModelAndView(model, "SuccessDanger.hbs");
        }, new HandlebarsTemplateEngine());



//        Sightings
        get("/SightingsForm", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "SightingsForm.hbs");
        }, new HandlebarsTemplateEngine());

        post("/spotted", (request, response) -> {

            Map<String, Object> model = new HashMap<>();
            String location = request.queryParams("location");
            String rangerName = request.queryParams("rangerName");
            String aniName = request.queryParams("aniName");

            Sightings sightings = new Sightings(location,rangerName, aniName);
            sightings.save();
            model.put("sightings", sightings);
            return new ModelAndView(model, "SuccessSight.hbs");
        }, new HandlebarsTemplateEngine());

        get("/Sightings", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("Sightings", Sightings.getAllSightings());
            return new ModelAndView(model, "Sightings.hbs");
        }, new HandlebarsTemplateEngine());


    }


}
