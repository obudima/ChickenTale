public class Egg {
    String type;
    private boolean destroyed;

    public Egg() {
    }

    public Egg(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!destroyed)
        this.type = type;
    }

    public void selfDestroy (){
        destroyed = true;
        type = null;
    }

    public void showStatus(){
        if (destroyed) System.out.println("Разбилось");
        else System.out.println("Не разбилось");
    }

    public boolean isDestroyed(){
        return destroyed;
    }
}
