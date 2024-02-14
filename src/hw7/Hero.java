package hw7;

public abstract class Hero implements HeroActions {
    // 省略 getter/setter...

    private String name;
    private int level;
    private double exp;

    public Hero() {
        this("David", 1, 0);
    }

    public Hero(String name, int level, double exp) {
        this.name = name;
        this.level = level;
        this.exp = exp;
    }

    public abstract void attack();

    @Override
    public void move() {
        System.out.println("跑步");
    }

    @Override
    public void defend() {
        System.out.println("做防禦動作");
    }
}
