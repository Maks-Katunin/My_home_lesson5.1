package kg.geektech.hless5;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroDefence;

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public Hero(int heroHealth, int heroDamage, String heroDefence) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroDefence = heroDefence;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroDefence() {
        return heroDefence;
    }
    public Hero(){

    }
}

