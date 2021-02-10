import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуй путник, ты прибыл на бои у тебя есть выбор и 3 классов \n1)Tank\n2)Health\n3)Damage");
        int player = sc.nextInt();
        if (player == 1) {
            System.out.println("Выбери героя за которого хочешь играть\n1)Райнхард\n2)Tiny\n3)Голем");
            FightTank();
        }
        if (player == 2) {
            System.out.println("Выбери героя за которого хочешь играть\n1)Райнхард\n2)Tiny\n3)Голем");
            FightTank();
        }
        if (player == 3) {
            System.out.println("Выбери героя за которого хочешь играть\n1)Райнхард\n2)Tiny\n3)Голем");
            FightTank();
        }
    }

    public static void FightTank() {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        Tank tn = new Tank(1000, 75, 25, 60, 100, "Райнхард", 5, 250);
        Enemy bot = new Enemy(50,20,80,20);
        int player = sc.nextInt();
        if (player == 1) {
             tn = new Tank(1000, 75, 25, 60, 100, "Райнхард", 5, 250);
        } else if (player == 2) {
             tn = new Tank(900, 95, 30, 50, 100, "Tiny", 7, 350);
        } else if (player == 3) {
             tn = new Tank(1200, 65, 20, 60, 100, "Голем", 3, 150);
        }
        int randomShoot,shieldCount=0,hpShieldPlayer = tn.hpShield, hp=0;
        while(true){
            for (int i = 0; i <5; i++) {
                for (int j = 0; j <5; j++) {
                    System.out.println("Вы встретились с "+j+ " уровнем монстра");
                    while (true){
                        bot.hp=bot.hp*j*i;
                        randomShoot = ran.nextInt(101);
                        if(randomShoot<=bot.randomShoot) {
                            if (tn.hpShield > 0) {
                                tn.hpShield = tn.hpShield - bot.attack;
                            }
                            else {
                                tn.hp-=bot.attack;
                                shieldCount++;
                                if(shieldCount==tn.shield){
                                    tn.hpShield = hpShieldPlayer;
                                    shieldCount=0;
                                }
                            }
                        }
                        randomShoot = ran.nextInt(101);
                        if(randomShoot<=tn.accuracy) {
                            randomShoot = ran.nextInt(101);
                            if(randomShoot<=tn.crit) {
                                bot.hp -= tn.attack+tn.crit;
                            }
                            else{
                                bot.hp -= tn.attack;
                            }
                        }
                        if(bot.hp<=0){
                            hp=1;
                            break;
                        }
                        if(tn.hp<=0){
                            break;
                        }
                    }
                }
                if(hp==1){
                    System.out.println("Ты проиграл но у тебя есть шанс пройти еще раз");
                    break;
                }

            }
        }
    }
    public static void Magazin(int money){

    }
    public static void FightHill() {
        Scanner sc = new Scanner(System.in);
        Health hl = new Health(1000, 75, 25, 60, 100, "Райнхард", 5, 250);
        int player = sc.nextInt();
        if (player == 1) {
            hl = new Health(1000, 75, 25, 60, 100, "Райнхард", 5, 250);
        } else if (player == 2) {
            hl = new Health(900, 95, 30, 50, 100, "Tiny", 7, 350);
        } else if (player == 3) {
           hl = new Health(1200, 65, 20, 60, 100, "Голем", 3, 150);
        }
    }
    public static void FightDamage() {
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        if (player == 1) {
            Damage dm = new Damage(1000, 75, 25, 60, 100, "Райнхард", 5, 250);
        } else if (player == 2) {
            Damage dm = new Damage(900, 95, 30, 50, 100, "Tiny", 7, 350);
        } else if (player == 3) {
            Damage dm = new Damage(1200, 65, 20, 60, 100, "Голем", 3, 150);
        }
    }
}

