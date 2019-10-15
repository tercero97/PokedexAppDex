package es.jefrytercero.pokedex.models.pokemon;

import es.jefrytercero.pokedex.models.general.NameUrl;

public class Stats {

    private double base_stat;
    private double effort;
    private NameUrl stat;

    public double getBase_stat() {
        return base_stat;
    }

    public double getEffort() {
        return effort;
    }

    public NameUrl getStat() {
        return stat;
    }
}
