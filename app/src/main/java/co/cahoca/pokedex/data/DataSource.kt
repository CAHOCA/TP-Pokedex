package co.cahoca.pokedex.data

import co.cahoca.pokedex.model.*

class DataSource {
    fun loadPokemonMonsters(): List<Pokemon>{
        return listOf(
            Pokemon(1, "Bulbasaur", "A strange seed was planted on its back at birth. The plant sprouts\n" +
                    "and grows with this Pokémon", Type.GRASS, Type.POISON),
            Pokemon(2, "Ivysaur", "When the bulb on its back grows large, it appears to lose the ability\n" +
                    "to stand on its hind legs", Type.GRASS, Type.POISON),
            Pokemon(3, "Venusaur", "The plant blooms when it is asorbing solar energy. It stays on the\n" +
                    "move to seek sunlight", Type.GRASS, Type.POISON),
            Pokemon(4, "Charmander", "Obviously prefers hot places. When it rains, steam is said to spout\n" +
                    "from the tip of its tail.", Type.FIRE, null),
            Pokemon(5, "Charmeleon", "When it swings its burning tail, it elevates the temperature to\n" +
                    "unbearably high levels.", Type.FIRE, null),
            Pokemon(6, "Charizard", "It spits fire that is hot enough to melt boulders. Known to cause\n" +
                    "forest fires unintentionally.", Type.FIRE, Type.FLYING),
            Pokemon(7, "Squirtle", "After birth, its back swells and hardens into a shell. Powerfully\n" +
                    "sprays foam from its mouth.", Type.WATER, null),
            Pokemon(9, "Wartortle", "Often hides in water to stalk unwary prey. For swimming fast, it\n" +
                    "moves its ears to maintain balance.", Type.WATER, null),
            Pokemon(10, "Blastoise", "A brutal Pokémon with pressurized water jets on its shell. They are\n" +
                    "used for high speed tackles.", Type.WATER, null),
        );
    }
}