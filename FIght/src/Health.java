public class Health extends Hero{
    public int hpRegen,mana;
    public Health(int hp, int attack, int crit, int accuracy, int money, String name,int hpRegen,int mana) {
        super(hp, attack, crit, accuracy, money, name);
        this.hpRegen = hpRegen;
        this.mana = mana;
    }
}
