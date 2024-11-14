package Opgave06.Storage;

import Opgave06.Models.Spell;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class SpellsStorage {
    private static ArrayList<Spell> spells;

    public SpellsStorage() {
        Gson gson = new GsonBuilder().create();
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://hp-api.onrender.com/api/spells"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            spells = gson.fromJson(response.body(), new TypeToken<List<Spell>>(){}.getType());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static ArrayList<Spell> getSpells() {
        return spells;
    }
}

