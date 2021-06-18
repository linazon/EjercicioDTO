package data;

import dto.ActorDTO;
import dto.Film_ActorDTO;

public class Data {
    public void obtainDate(ActorDTO actorDTO, Film_ActorDTO film_actorDTO){
       for(int i=0; i<actorDTO.getActor_idDTO().size(); i++){
            System.out.println(actorDTO.getActor_idDTO().get(i)+ " "+ actorDTO.getFirst_nameDTO().get(i)+
                    " "+actorDTO.getLast_nameDTO().get(i)+" "+actorDTO.getLast_updateDTO().get(i)+"\n ---------\n");
        }
        for(int i=0; i<film_actorDTO.getActor_idDTO().size(); i++) {
            System.out.println(film_actorDTO.getActor_idDTO().get(i)+" "+ film_actorDTO.getFilm_idDTO().get(i)+
                    " "+film_actorDTO.getLast_updateDTO().get(i));
        }
    }
}
