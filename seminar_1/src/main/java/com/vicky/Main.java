package com.vicky;
public class Main {

    public static void main(String[] args) {
        BaseClass archer = new Archer("Bob", 1, 100, 100,"Crossbow", 12, 10);
        BaseClass bandit = new Bandit("Rob", 1, 100, 100, "Knife", 10);
        BaseClass countrymen = new CountryMen("Ivan", 1, 50, 30, "Stick");
        BaseClass monk = new Monk("Gerald", 1, 100, 50, "Book", 10, true);
        BaseClass pikeman = new Pikeman("Alex", 1,100, 50, "Pika", 10);
        BaseClass sniper = new Sniper("Mike", 1, 100, 30, "Gun", 12, 30);
        BaseClass wizard = new Wizard("Sansay", 1, 100, 100, "Stick", 20, true);
    }
}