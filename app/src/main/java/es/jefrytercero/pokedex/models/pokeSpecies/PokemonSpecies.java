package es.jefrytercero.pokedex.models.pokeSpecies;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import es.jefrytercero.pokedex.models.general.FlavorText;

public class PokemonSpecies {

    @SerializedName("flavor_text_entries")
    ArrayList<FlavorText> flavor_text_entries;

    public ArrayList<FlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }
}
