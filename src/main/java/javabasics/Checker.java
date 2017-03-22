package javabasics;

import java.util.Comparator;

public class Checker implements Comparator<Player>
{
    @Override
    public int compare(final Player o1, final Player o2)
    {
        if(o1.score > o2.score){
            return -1;
        }

        if(o1.score < o2.score){
            return 1;
        }

        return o1.name.compareTo(o2.name);

    }

    @Override
    public boolean equals(final Object obj)
    {
        return false;
    }
}
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
