package app;

import connection.Connect;
import dto.ActorDTO;

import java.sql.*;

public class Main {

    public static void main(String[] args)  {
        Connect connect = new Connect();
        ActorDTO actorDTO = new ActorDTO();

        connect.conectar("select * from film", "title");
        actorDTO.setFirst_nameDTO(connect.column);
        connect.conectar("select * from customer", "last_name");
        actorDTO.setLast_nameDTO(connect.column);


        System.out.println(actorDTO.getLast_nameDTO());
    }


}
