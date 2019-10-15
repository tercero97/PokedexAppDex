package es.jefrytercero.pokedex.models.pokeMoves;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import es.jefrytercero.pokedex.models.general.Nombres;

public class Tipo {

    @SerializedName("names")
    private ArrayList<Nombres> names;

    public ArrayList<Nombres> getNames() {
        return names;
    }
}
