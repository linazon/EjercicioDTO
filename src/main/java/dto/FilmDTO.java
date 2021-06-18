package dto;

import java.time.Year;
import java.util.ArrayList;

public class FilmDTO {
    private ArrayList<Short> film_idDTO = new ArrayList<>();
    private ArrayList<String> titleDTO = new ArrayList<String>();
    private ArrayList<String> descriptionDTO = new ArrayList<String>();
    private ArrayList<Year> release_yearDTO = new ArrayList<Year>();
    private ArrayList<Integer> language_idDTO = new ArrayList<Integer>();
}
