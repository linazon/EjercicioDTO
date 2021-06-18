package app;

import connection.Connection;
import data.Data;
import dto.ActorDTO;

public class Main {

    public static void main(String[] args)  {
        Connection connection = new Connection();
        ActorDTO actorDTO = new ActorDTO();
        Data data = new Data();

        connection.connectDB();

       actorDTO.setActor_idDTO(connection.consultActor("actor_id"));
        actorDTO.setFirst_nameDTO(connection.consultActor("first_name"));
        actorDTO.setLast_nameDTO(connection.consultActor("last_name"));
       actorDTO.setLast_updateDTO(connection.consultActor("last_update"));

       connection.closeConnection();

        data.obtainDate(actorDTO);
    }


}
