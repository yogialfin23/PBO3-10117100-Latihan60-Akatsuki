package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {

    public static void main(String[] args) {
        String cloth = "Black Red Cloud";
        String goal = "Gathering all Jinchuriki";

        Member deidara = new Member("Deidara", "Iwagakure", "Explosive Clay",
                "S-Rank Missing Ninja", "Explosive Release",
                "Killed in Battle by Chiyo", true, cloth, goal);
        Member sasori = new Member("Sasori", "Sunagakure", "Hiruko",
                "S-Rank Missing Ninja from Sunagakure's Puppet Brigade",
                "Puppet Mastery", "Killed in Battle by Sakura", true, cloth, goal);
        Member kisame = new Member("Kisame Hoshigaki", "Kirigakure", "Samehada",
                "S-Rank Missing Ninja", "Shark-o-mation", "Committed Suicide", true, cloth, goal);
        Member itachi = new Member("Itachi Uchiha", "Konohagakure", "Kunai",
                "Anbu Captain Missing Ninja", "Mangekyo Sharingan",
                "Killed by his own brother", true, cloth, goal);
        Member orochimaru = new Member("Orochimaru", "Konohagakure", "Snakes",
                "Konohagakure's Legendary Sannin", "Power of White Snake",
                "Killed & Revived by Sasuke", false, cloth, goal);

        System.out.println("Akatsuki Bio");
        System.out.println("============");
        System.out.println();
        System.out.println("Cloth : " + deidara.getClothes());
        System.out.println("Goal : " + deidara.getGoals());
        System.out.println();

        deidara.displayMember();
        sasori.displayMember();
        kisame.displayMember();
        itachi.displayMember();
        orochimaru.displayMember();

    }
}
