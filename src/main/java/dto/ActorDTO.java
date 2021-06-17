package dto;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class ActorDTO {
    ArrayList<String> first_nameDTO = new ArrayList<String>();
    ArrayList<String> last_nameDTO = new ArrayList<String>();
    ArrayList<Integer> actorIDDTO = new ArrayList<Integer>();
    ArrayList<Date> lastUpdateDDTO = new ArrayList<Date>();

    public ActorDTO() {
    }

    public ArrayList<String> getLast_nameDTO() {
        return last_nameDTO;
    }

    public void setLast_nameDTO(ArrayList<String> last_nameDTO) {
        this.last_nameDTO = last_nameDTO;
    }

    public ArrayList<Integer> getActorIDDTO() {
        return actorIDDTO;
    }

    public void setActorIDDTO(ArrayList<Integer> actorIDDTO) {
        this.actorIDDTO = actorIDDTO;
    }

    public ArrayList<Date> getLastUpdateDDTO() {
        return lastUpdateDDTO;
    }

    public void setLastUpdateDDTO(ArrayList<Date> lastUpdateDDTO) {
        this.lastUpdateDDTO = lastUpdateDDTO;
    }

    public ArrayList<String> getFirst_nameDTO() {
        return first_nameDTO;
    }

    public void setFirst_nameDTO(ArrayList<String> first_nameDTO) {
        this.first_nameDTO = first_nameDTO;
    }
}
