package es.jefrytercero.pokedex.controller;

import es.jefrytercero.pokedex.models.pokeMoves.Tipo;
import es.jefrytercero.pokedex.models.pokeStats.Ability;
import es.jefrytercero.pokedex.models.pokemon.Pokemon;
import es.jefrytercero.pokedex.models.pokemon.PokemonRespuesta;
import es.jefrytercero.pokedex.models.pokeSpecies.PokemonSpecies;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit,@Query("offset") int offset);

    @GET("pokemon/{id}")
    Call<Pokemon> obtenerPokemon(@Path("id") int id);

    @GET("pokemon-species/{id}")
    Call<PokemonSpecies> obtenerPokemonSpecies(@Path("id") int id);

    @GET("/ability/{id}")
    Call<Ability> obtenerHabilidad(@Path("id") int id);

    @GET("/type/{id}")
    Call<Tipo> obtenerTipo(@Path("id") int id);
}
