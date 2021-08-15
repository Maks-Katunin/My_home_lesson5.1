package kg.geektech.hless5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setBossHealth(700);
        boss.setBossDamage(50);
        boss.setBossDefence("Warrior");
        System.out.println("Boss health: (" + boss.getBossHealth() + ")" +

                " Boss damage: [" + boss.getBossDamage() + "] " +

                "Boss defence is " + boss.getBossDefence() + ".");

        System.out.println("------------------------------------");

        createHeroes();
    }

    public static Hero createHeroes() {

        Hero hero1 = new Hero(250, 15);

        System.out.println("Hero1 helth " + hero1.getHeroHealth() + ":" +
                "  damage " + "[" + hero1.getHeroDamage() + "]");
        System.out.println(" ");

        Hero hero2 = new Hero(260, 20, "Magic");

        System.out.println("Hero2 helth " + hero2.getHeroHealth() + ":" +
                "  damage " + "[" + hero2.getHeroDamage() + "]" +
                "  defence is " + hero2.getHeroDefence() + ".");
        System.out.println(" ");

        Hero hero3 = new Hero(270, 25, "Medic");

        System.out.println("Hero3 helth " + hero3.getHeroHealth() + ":" +
                "  damage " + "[" + hero3.getHeroDamage() + "]" +
                "  defence is " + hero3.getHeroDefence() + ".");


        System.out.println("------------------------------------");


        int[][] createHeroes = {{hero1.getHeroHealth(), hero1.getHeroDamage()},
                {hero2.getHeroHealth(), hero2.getHeroDamage(),},
                {hero3.getHeroHealth(), hero3.getHeroDamage(),}};
        System.out.println(Arrays.deepToString(createHeroes));

        return hero1; // не могу понять как это сделать.
    }
}
