public class Tail extends Weapon{
    private boolean destroyed;
    @Override
    public void destroy(Egg egg) {
        if ((!destroyed)&&(egg.getType()=="Золотое"))
            egg.selfDestroy();
    }
    public void selfDestroy(){
        destroyed = true;
    }
}
