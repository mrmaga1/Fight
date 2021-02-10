public class Damage extends Hero {
    int dopPunch,randomDopPunch;
    public Damage(int hp, int attack, int crit, int accuracy, int money, String name,int dopPunch,int randomDopPunch) {
        super(hp, attack, crit, accuracy, money, name);
        this.dopPunch = dopPunch;
        this.randomDopPunch = randomDopPunch;

    }
}
