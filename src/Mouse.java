public class Mouse extends Animal {

    private Tail tail;
    private boolean destroyed;
    public Mouse() {
        this.tail = new Tail();
    }

    public Tail getTail() {
        return tail;
    }

    public void selfDestroy(){
        this.tail.selfDestroy();
        destroyed = true;
    }

    public void useWeapon(Egg egg) {
        this.tail.destroy(egg);
    }

}
