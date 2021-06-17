package connection;

import java.sql.*;
import java.util.ArrayList;

public class Connect {
    //creando objeto conexion
    Connection connection = null;
    public ArrayList<String> column = new ArrayList<String>();


    public void conectar(String consulta, String field){


        try{
            //creo la conexion, con BD, usuario y contraseña
            //10:23
            connection = DriverManager.getConnection("jdbc:mysql://sofka-training.cpxphmd1h1ok.us-east-1.rds.amazonaws.com/LinaGarzon?user=sofka_training&password=BZenX643bQHw&serverTimezone=UTC");

            //Creo el objeto para ejecutar la setencia SQL
            Statement statement = connection.createStatement();

            //Establecer un tiempo maximo de respuesta
            statement.setQueryTimeout(50);

            //Ejecutar una consulta sencilla
             ResultSet rs = statement.executeQuery(consulta);

            // recorrer los resultados
            while (rs.next()){
                column.add( rs.getString(field));


            }

        }catch (
                SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }



}
