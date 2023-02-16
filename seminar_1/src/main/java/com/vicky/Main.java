package com.vicky;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BaseClass archer = new Archer("Bob");
        BaseClass bandit = new Bandit("Rob");
        BaseClass countrymen = new CountryMen("Ivan");
        BaseClass monk = new Monk("Gerald");
        BaseClass pikeman = new Pikeman("Alex");
        BaseClass sniper = new Sniper("Mike");
        BaseClass wizard = new Wizard("Sansay");
        BaseClass pikemanTwo = new Pikeman("Jordan");
        BaseClass sniperTwo = new Sniper("Miguel");
        BaseClass wizardTwo = new Wizard("Sunny");

        List<BaseClass> baseClasses = new ArrayList<>();
        baseClasses.add(archer);
        baseClasses.add(bandit);
        baseClasses.add(countrymen);
        baseClasses.add(monk);
        baseClasses.add(pikeman);
        baseClasses.add(sniper);
        baseClasses.add(wizard);
        baseClasses.add(pikemanTwo);
        baseClasses.add(sniperTwo);
        baseClasses.add(wizardTwo);

        baseClasses.forEach(baseClass -> System.out.println(baseClass.getInfo()));

    }
}