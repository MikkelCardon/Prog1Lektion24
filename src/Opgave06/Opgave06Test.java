package Opgave06;

import Opgave06.Models.Spell;
import Opgave06.Storage.SpellsStorage;

import java.util.ArrayList;

public class Opgave06Test {
    public static void main(String[] args) {
        SpellsStorage storage = new SpellsStorage();
        ArrayList<Spell> spells = storage.getSpells();

        System.out.println(getSpellByName("Silencio"));
    }

    public static Spell getSpellByName(String spellName){
        Spell[] spells = SpellsStorage.getSpells().toArray(new Spell[0]);
        int left = 0;
        int right = spells.length-1;


        while (left <= right){
            int middle = (left + right) / 2;

            if (spells[middle].getName().compareTo(spellName) == 0){
                return spells[middle];
            } else if (spells[middle].getName().compareTo(spellName) > 0) {
                right = middle -1;
            }
            else {left = middle +1;}
        }
        return null;
    }

}
