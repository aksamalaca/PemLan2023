import java.util.Scanner;;
public class MainHero {
    public static void main(String[] args) {
        Hero op = new Hero();
        op.displayOp();
        Scanner input = new Scanner(System.in);

        System.out.println("Permainan adu hero");
        System.out.println("Silakan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka Antara 0 hingga 500!");
        System.out.println("==============================");

        // set up hero1
        Hero hero1 = new Hero();
        System.out.print("Nama Hero          : ");
        hero1.setName(input.nextLine());
        System.out.print("Hitpoint Hero  : ");
        hero1.setHp(input.nextDouble());
        System.out.print("Attack Hero        : ");
        hero1.setAtk(input.nextDouble());
        input.nextLine();

        // set up hero2
        Hero hero2 = new Hero("Odette", 500, 100);
        System.out.println("==============================");
        System.out.println("==============================\n");

        // battle loop
        int ronde = 1;
        while (hero1.getHp() > 0 && hero2.getHp() > 0){
            System.out.println("==============================");
            System.out.println("Ronde " + ronde);

            // hero 1 menyerang hero 2
            System.out.println(hero1.getName() + " menyerang " + hero2.getName());
            System.out.println("");
            System.out.println(hero1.getName() + " menyerang sebesar " + hero1.getAtk());
            System.out.println(hero2.getName() + " memiliki hitpoint sebesar " + hero2.getHp() + " HP");
            hero2.setHp(hero2.getHp() - hero1.getAtk());
            System.out.println("");

            // Hero 2 menyerang Hero 1
            System.out.println(hero2.getName() + " menyerang " + hero1.getName());
            System.out.println(hero2.getName() + " menyerang sebesar " + hero2.getAtk());
            System.out.println(hero1.getName() + " memiliki hitpoint sebesar " + hero1.getHp() + " HP");
            hero1.setHp(hero1.getHp() - hero2.getAtk());
            System.out.println("");

            ronde++;
        }

        // Print winner
        if (hero1.getHp() > 0) {
            System.out.println(hero1.getName() + " adalah pemenangnya!");
        } else {
            System.out.println(hero2.getName() + " adalah pemenangnya!");
        }
        System.out.println("==============================");
        System.out.println("==============================");
        input.close();
    }
}
