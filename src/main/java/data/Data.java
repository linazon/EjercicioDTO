package data;

import dto.ActorDTO;

public class Data {
    public void obtainDate(ActorDTO actorDTO){
        for(int i=0; i<actorDTO.getActor_idDTO().size(); i++){
            System.out.println(actorDTO.getActor_idDTO().get(i)+ " "+ actorDTO.getFirst_nameDTO().get(i)+
                    " "+actorDTO.getLast_nameDTO().get(i)+" "+actorDTO.getLast_updateDTO().get(i)+"\n");
        }
    }
}
