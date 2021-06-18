package connection;

import java.sql.*;
import java.util.ArrayList;

public class Connection {
    //creando objeto conexion
    java.sql.Connection connection = null;
    Statement statement;
    ResultSet rs;
    public Connection(){}

    public void connectDB(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://sofka-training.cpxphmd1h1ok.us-east-1.rds.amazonaws.com/LinaGarzon?user=sofka_training&password=BZenX643bQHw&serverTimezone=UTC");
        }catch (
                SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public  void closeConnection(){
        try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

    }

    public ArrayList consultActor(String field) {

        ArrayList<Short> actor_id = new ArrayList<>();
        ArrayList<String> first_name = new ArrayList<String>();
        ArrayList<String> last_name = new ArrayList<String>();
        ArrayList<Timestamp> last_update = new ArrayList<Timestamp>();

        try {
            statement = connection.createStatement();
            statement.setQueryTimeout(50);
            rs = statement.executeQuery("select * from actor");

            while (rs.next()) {
                actor_id.add(rs.getShort("actor_id"));
                first_name.add(rs.getString("first_name"));
                last_name.add(rs.getString("last_name"));
                last_update.add(rs.getTimestamp("last_update"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } /*finally {
            closeConnection();
        }*/
        switch (field) {
            case "actor_id":
                return actor_id;
            case "first_name":
                return first_name;
            case "last_name":
                return last_name;
            case "last_update":
                return last_update;
            default:
                return null;
        }
        //return first_name;
    }


}
