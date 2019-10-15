package es.jefrytercero.pokedex.models.pokemon;

import com.google.gson.annotations.SerializedName;

import es.jefrytercero.pokedex.models.general.NameUrl;

public class Movimientos {

    @SerializedName("move")
    private NameUrl move;

    public NameUrl getMove() {
        return move;
    }
}
