package gof.estrutural.Flyweight;

import java.util.Random;

public class CounterStrike {

    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] wearpons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static String getRandPlayerType() {
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);
        return playerType[randInt];
    }

    public static String getRandWearpon() {
        Random r = new Random();
        int randInt = r.nextInt(wearpons.length);
        return wearpons[randInt];
    }
}
