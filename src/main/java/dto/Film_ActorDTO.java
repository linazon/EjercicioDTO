package dto;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Film_ActorDTO {
    private ArrayList<Short> actor_idDTO = new ArrayList<>();
    private ArrayList<Short> film_idDTO = new ArrayList<>();
    private ArrayList<Timestamp> last_updateDTO = new ArrayList<Timestamp>();

    public ArrayList<Short> getActor_idDTO() {
        return actor_idDTO;
    }

    public void setActor_idDTO(ArrayList<Short> actor_idDTO) {
        this.actor_idDTO = actor_idDTO;
    }

    public ArrayList<Short> getFilm_idDTO() {
        return film_idDTO;
    }

    public void setFilm_idDTO(ArrayList<Short> film_idDTO) {
        this.film_idDTO = film_idDTO;
    }

    public ArrayList<Timestamp> getLast_updateDTO() {
        return last_updateDTO;
    }

    public void setLast_updateDTO(ArrayList<Timestamp> last_updateDTO) {
        this.last_updateDTO = last_updateDTO;
    }
}
