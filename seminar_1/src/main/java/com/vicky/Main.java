package com.vicky;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<BaseClass> firstTeam = new ArrayList<>();
        firstTeam.add( new CountryMen("Ivan"));
        firstTeam.add( new CountryMen("Petr"));
        firstTeam.add( new Bandit ("Bill"));
        firstTeam.add( new Sniper("Max"));
        firstTeam.add( new Sniper("Garry"));
        firstTeam.add( new Sniper("Frank"));
        firstTeam.add( new Wizard("Rikky"));
        firstTeam.add( new CountryMen("Alex"));
        firstTeam.add( new Bandit("Stepan"));
        firstTeam.add( new Wizard("Gerald"));


        List<BaseClass> secondTeam = new ArrayList<>();
        secondTeam.add (new CountryMen("Fedor"));
        secondTeam.add (new CountryMen("Mihail"));
        secondTeam.add (new Pikeman("Jordan"));
        secondTeam.add (new Pikeman("Oleg"));
        secondTeam.add(new Pikeman("Slava"));
        secondTeam.add(new Archer("Bob"));
        secondTeam.add(new Archer("Bred"));
        secondTeam.add(new Archer("Viktor"));
        secondTeam.add(new Monk("Ruslan"));
        secondTeam.add(new Monk("Petr"));


        Stream.concat(firstTeam.stream(), secondTeam.stream())
                .sorted(Comparator.comparingInt(BaseClass::getSpeed))
                .forEach(System.out::println);
    }
}