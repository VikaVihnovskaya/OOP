package com.vicky.view;

import com.vicky.BaseClass;
import com.vicky.Main;
import com.vicky.Status;

import java.util.Collections;

public class View {
    private static int step = 1;
    private static final int[] l = {0};
    private static final String TOP_10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String MIDL_10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String BOTTOM_10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");
    private static void tabSetter(int cnt, int max){
        int dif = max - cnt + 2;
        if (dif>0) System.out.printf("%" + dif + "s", ":\t"); else System.out.print(":\t");
    }
    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }
    private static String getChar(int x, int y){
        String out = "| ";
        for (BaseClass baseClass: Main.mergedTeam) {
            if (baseClass.getCoordinate().getX() == x && baseClass.getCoordinate().getY()== y){
                if (baseClass.getState() == Status.DIE) {
                    out = "|" + (AnsiColors.ANSI_RED + baseClass.getInfo().toUpperCase().charAt(2) + AnsiColors.ANSI_RESET);
                    break;
                }
                if (Main.firstTeam.contains(baseClass)) out = "|" + (AnsiColors.ANSI_GREEN + baseClass.getInfo().toUpperCase().charAt(2) + AnsiColors.ANSI_RESET);
                if (Main.secondTeam.contains(baseClass)) out = "|" + (AnsiColors.ANSI_BLUE + baseClass.getInfo().toUpperCase().charAt(2) + AnsiColors.ANSI_RESET);
                break;
            }
        }
        return out;
    }
    public static void view() {
        if (step == 1 ){
            System.out.print(AnsiColors.ANSI_RED + "First step" + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_RED + "Step:" + step + AnsiColors.ANSI_RESET);
        }
        step++;
        Main.mergedTeam.forEach((v) -> l[0] = Math.max(l[0], v.toString().length()));
        for (int i = 0; i < l[0]*2; i++) System.out.print("_");
        System.out.println("");
        System.out.print(TOP_10 + "    ");
        System.out.print("Blue side");
        for (int i = 0; i < l[0]-9; i++) System.out.print(" ");
        System.out.println(":\tGreen side");
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i));
        }
        System.out.print("|    ");
        System.out.print(Main.secondTeam.get(0));
        tabSetter(Main.secondTeam.get(0).toString().length(), l[0]);
        System.out.println(Main.firstTeam.get(0));
        System.out.println(MIDL_10);

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|    ");
            System.out.print(Main.secondTeam.get(i-1));
            tabSetter(Main.secondTeam.get(i-1).toString().length(), l[0]);
            System.out.println(Main.firstTeam.get(i-1));
            System.out.println(MIDL_10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j));
        }
        System.out.print("|    ");
        System.out.print(Main.secondTeam.get(9));
        tabSetter(Main.secondTeam.get(9).toString().length(), l[0]);
        System.out.println(Main.firstTeam.get(9));
        System.out.println(BOTTOM_10);
    }
}