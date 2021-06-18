package app;

import connection.Connection;
import dto.ActorDTO;

public class Main {

    public static void main(String[] args)  {
        Connection connection = new Connection();
        ActorDTO actorDTO = new ActorDTO();
        connection.connectDB();

       actorDTO.setActor_idDTO(connection.consultActor("actor_id"));
        actorDTO.setFirst_nameDTO(connection.consultActor("first_name"));
        actorDTO.setLast_nameDTO(connection.consultActor("last_name"));
       actorDTO.setLast_updateDTO(connection.consultActor("last_update"));

        //System.out.println();
       connection.closeConnection();

       // actorDTO.setLast_nameDTO(Connection.column);


       // System.out.println(actorDTO.getFirst_nameDTO());
        for(int i=0; i<actorDTO.getActor_idDTO().size(); i++){
            System.out.println(actorDTO.getActor_idDTO().get(i)+ " "+ actorDTO.getFirst_nameDTO().get(i)+
                    " "+actorDTO.getLast_nameDTO().get(i)+" "+actorDTO.getLast_updateDTO().get(i)+"\n");
        }


    }


}
