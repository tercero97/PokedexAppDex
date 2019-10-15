package es.jefrytercero.pokedex.models.pokemon;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import es.jefrytercero.pokedex.models.general.NameUrl;

public class Pokemon {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("weight")
    private int weight;

    @SerializedName("height")
    private int height;

    @SerializedName("species")
    private NameUrl species;

    @SerializedName("types")
    private ArrayList<Tipos> types;

    @SerializedName("sprites")
    private Sprites sprites;


    @SerializedName("abilities")
    private ArrayList<Habilidades> abilities;

    @SerializedName("moves")
    private ArrayList<Movimientos> moves;

    @SerializedName("stats")
    private ArrayList<Stats> stats;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public NameUrl getSpecies() {
        return species;
    }

    public ArrayList<Tipos> getTypes() {
        return types;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public ArrayList<Habilidades> getAbilities() {
        return abilities;
    }

    public ArrayList<Movimientos> getMoves() {
        return moves;
    }

    public ArrayList<Stats> getStats() {
        return stats;
    }
}
