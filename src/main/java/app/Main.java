package app;

import connection.Connection;
import data.Data;
import dto.ActorDTO;
import dto.Film_ActorDTO;

public class Main {

    public static void main(String[] args)  {
        Connection connection = new Connection();
        ActorDTO actorDTO = new ActorDTO();
        Film_ActorDTO film_actorDTO = new Film_ActorDTO();
        Data data = new Data();

        connection.connectDB();

       actorDTO.setActor_idDTO(connection.consultActor("actor_id"));
       actorDTO.setFirst_nameDTO(connection.consultActor("first_name"));
       actorDTO.setLast_nameDTO(connection.consultActor("last_name"));
       actorDTO.setLast_updateDTO(connection.consultActor("last_update"));

       film_actorDTO.setActor_idDTO(connection.consultFilm_Actor("actor_id"));
       film_actorDTO.setFilm_idDTO(connection.consultFilm_Actor("film_id"));
       film_actorDTO.setLast_updateDTO(connection.consultFilm_Actor("last_update"));


       connection.closeConnection();

        data.obtainDate(actorDTO, film_actorDTO);
    }


}
