import java.util.Scanner;

public class Main {
    private static Object tn1;

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
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        if (player == 1) {
            Tank tn = new Tank(1000, 75, 25, 60, 100, "Райнхард", 5, 250);
        } else if (player == 2) {
            Tank tn = new Tank(900, 95, 30, 50, 100, "Tiny", 7, 350);
        } else if (player == 3) {
            Tank tn = new Tank(1200, 65, 20, 60, 100, "Голем", 3, 150);
        }
    }
    public static void FightHill() {
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        if (player == 1) {
            Health hl = new Health(1000, 75, 25, 60, 100, "Райнхард", 5, 250);
        } else if (player == 2) {
            Health hl = new Health(900, 95, 30, 50, 100, "Tiny", 7, 350);
        } else if (player == 3) {
            Health hl = new Health(1200, 65, 20, 60, 100, "Голем", 3, 150);
        }
    }  public static void FightDamage() {
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

