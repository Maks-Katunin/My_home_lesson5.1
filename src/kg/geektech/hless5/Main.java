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

        for (int i = 0; i < createHeroes().length; i++) {

            System.out.println(createHeroes()[i].getHeroHealth() + " " + createHeroes()[i].getHeroDamage() + " " + createHeroes()[i].getHeroDefence());

        }

    }

    public static Hero[] createHeroes() {

        Hero hero1 = new Hero(250, 15);

        Hero hero2 = new Hero(260, 20, "Magic");

        Hero hero3 = new Hero(270, 25, "Medic");




        Hero[] heroesMassive = {hero1, hero2, hero3};

        return heroesMassive;
    }



}
