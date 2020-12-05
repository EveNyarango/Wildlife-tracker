//package models;
//
//import java.util.Objects;
//
//import org.sql2o.Connection;
//
//public class Ranger {
//    public  String name;
//    public int rangerId;
//    public static String health;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Ranger ranger = (Ranger) o;
//        return rangerId == ranger.rangerId &&
//                Objects.equals(name, ranger.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, rangerId);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getRangerId() {
//        return rangerId;
//    }
//
//    public static <Ranger> Ranger() {
//        String sql = "SELECT * FROM rangers";
//        try(Connection con = DB.sql2o.open()){
//            return con.createQuery(sql).executeAndFetch(Ranger.class);
//        }
//    }
//}
