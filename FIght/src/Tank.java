public class Tank extends Hero {
    public int shield,hpShield;
    public Tank(int hp, int attack, int crit, int accuracy, int money, String name,int shield,int hpShield) {
        super(hp, attack, crit, accuracy, money, name);
        this.shield = shield;
        this.hpShield = hpShield;
    }
}
