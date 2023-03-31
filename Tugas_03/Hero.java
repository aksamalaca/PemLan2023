public class Hero {
    private String name;
    private double hp;
    private double atk;

    public Hero(){
    }
    public Hero(String name, double hp, double atk){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getHp(){
        return hp;
    }
    public void setHp(double hp){
        this.hp = hp;
    }
    public double getAtk(){
        return atk;
    }
    public void setAtk(double atk){
        this.atk = atk;
    }
    public void displayOp(){
        System.out.println("=======================================");
        System.out.println("Selamat Datang di Game Battle Sederhana");
        System.out.println("=======================================\n");
        System.out.println();
    }
}
