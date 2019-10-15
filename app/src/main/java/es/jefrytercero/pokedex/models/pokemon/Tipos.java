package es.jefrytercero.pokedex.models.pokemon;

import com.google.gson.annotations.SerializedName;

import es.jefrytercero.pokedex.models.general.NameUrl;

public class Tipos {

    @SerializedName("slot")
    private double slot;

    private NameUrl type;

    public double getSlot() {
        return slot;
    }

    public NameUrl getType() {
        return type;
    }
}
