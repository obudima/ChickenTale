public class Weapon {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void destroy (Egg egg) {
        if (egg.getType()!="Золотое")
            egg.selfDestroy();
    }

}
