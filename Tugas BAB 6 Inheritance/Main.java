public class Main {
    public static void main(String[] args) {
        // testcase - output
        Manusia a = new Manusia("A", "111", true, true);
        MahasiswaFILKOM b = new MahasiswaFILKOM("165150300111100", 4.0, "B", "111", false, false);
        Pekerja c = new Pekerja(1000, 2016, 3, 2, 4, "C", "111", true, true);
        Manager d = new Manager("HRD", 1000, 2017, 1, 2, 3, "D", "111", true, true);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // testcase
        Manusia a1 = new Manusia("Rendi", "111", true, true);
        Manusia a2 = new Manusia("Niki", "111", false, true);
        Manusia a3 = new Manusia("Andi", "111", true, false);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        MahasiswaFILKOM b1 = new MahasiswaFILKOM("205150400111100", 2.9, "Santi", "111", false, false);
        MahasiswaFILKOM b2 = new MahasiswaFILKOM("215150200111100", 3.4, "Dani", "111", true, false);
        MahasiswaFILKOM b3 = new MahasiswaFILKOM("225150701111029", 3.6, "Citra", "111", false, false);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        
        Pekerja p1 = new Pekerja(11000, 2021, 5, 10, 2, "Henndri", "111", true, true);
        Pekerja p2 = new Pekerja(15000, 2014, 2, 14, 0, "Lani", "111", false, false);
        Pekerja p3 = new Pekerja(20000, 2003, 1, 20, 10, "Agus", "111", true, true);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        Manager mn = new Manager("HRD", 7500, 2008, 3, 3, 5, "Rani", "111", true, true);
        System.out.println(mn);

    }
}