import java.security.PublicKey;

public class Chicken extends Animal{
    private Egg[] egg;
    private int cnt;
    private Human owner;

    public Chicken() {
        egg = new Egg[100];
    }

    public Chicken(String name) {
        setName(name);
        egg = new Egg[100];
    }

    public Egg createEgg() {
        Egg egg = new Egg();
        this.egg[cnt++] = egg;
        return egg;
    }

    public Egg createEgg(String type) {
        Egg egg = new Egg(type);
        this.egg[cnt++] = egg;
        return egg;
    }

    public void showEggs ()
    {
        for (Egg i : egg)
            if (i != null&&!i.isDestroyed())
                System.out.println(i.getType());
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
        if (owner.getPet() != this) owner.setPet(this);
    }
}
