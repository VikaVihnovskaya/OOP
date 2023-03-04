package com.vicky;

import com.vicky.view.View;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static List<BaseClass> firstTeam = new ArrayList<>();
    public static List<BaseClass> secondTeam = new ArrayList<>();
    public static List<BaseClass> mergedTeam = new ArrayList<>();
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        userInput.nextLine();

        firstTeam.add(new CountryMen("Ivan", 1, 1));
        firstTeam.add(new CountryMen("Petr", 1, 2));
        firstTeam.add(new Bandit("Bill", 1, 3));
        firstTeam.add(new Sniper("Max", 1, 4));
        firstTeam.add(new Sniper("Garry", 1, 5));
        firstTeam.add(new Sniper("Frank", 1, 6));
        firstTeam.add(new Wizard("Rikky", 1, 7));
        firstTeam.add(new CountryMen("Alex", 1, 8));
        firstTeam.add(new Bandit("Stepan", 1, 9));
        firstTeam.add(new Wizard("Gerald", 1, 10));

        secondTeam.add(new CountryMen("Fedor", 10, 1));
        secondTeam.add(new CountryMen("Mihail", 10, 2));
        secondTeam.add(new Pikeman("Jordan", 10, 3));
        secondTeam.add(new Pikeman("Oleg", 10, 4));
        secondTeam.add(new Pikeman("Slava", 10, 5));
        secondTeam.add(new Archer("Bob", 10, 6));
        secondTeam.add(new Archer("Bred", 10, 7));
        secondTeam.add(new Archer("Viktor", 10, 8));
        secondTeam.add(new Monk("Ruslan", 10, 9));
        secondTeam.add(new Monk("Petr", 10, 10));


         mergedTeam.addAll(Stream.concat(firstTeam.stream(), secondTeam.stream())
                .sorted(Comparator.comparingInt(BaseClass::getSpeed))
                .collect(Collectors.toList()));
        mergedTeam.forEach(System.out::println);
        while (true){
            View.view();
            userInput.nextLine();
            for (BaseClass baseClass : mergedTeam) {
                if (firstTeam.contains(baseClass)) baseClass.step(firstTeam, secondTeam);
                else baseClass.step(secondTeam, firstTeam);
            }

        }
//        System.out.println("------- Игра начинается ----");
//        for (BaseClass baseClass : mergedTeam) {
//            if (firstTeam.contains(baseClass)) baseClass.step(firstTeam, secondTeam);
//            else baseClass.step(secondTeam, firstTeam);
//        }
//        System.out.println("------- Все ходы завершены ----");
//        mergedTeam.forEach(System.out::println);

    }
}