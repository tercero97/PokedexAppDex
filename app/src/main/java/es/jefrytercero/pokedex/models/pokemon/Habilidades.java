package es.jefrytercero.pokedex.models.pokemon;

import com.google.gson.annotations.SerializedName;

import es.jefrytercero.pokedex.models.general.NameUrl;

public class Habilidades {

    @SerializedName("ability")
    private NameUrl ability;

    @SerializedName("is_hidden")
    private Boolean is_hidden;

    @SerializedName("slot")
    private double slot;

    public NameUrl getAbility() {
        return ability;
    }

    public Boolean getIs_hidden() {
        return is_hidden;
    }

    public double getSlot() {
        return slot;
    }
}
