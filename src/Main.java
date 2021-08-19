public class Main {
    public static void main(String[] args) {
        Grandpa grandpa = new Grandpa("Витя");
        Granny granny = new Granny("Лена");
        grandpa.setWife(granny);
        Chicken chicken1 = new Chicken("Ряба");
        Egg egg1 = chicken1.createEgg("Золотое");
        chicken1.showEggs();
        chicken1.setOwner(granny);
        Weapon weapon1 = new Weapon();
        Weapon weapon2 = new Weapon();
        grandpa.useWeapon(weapon1, egg1);
        egg1.showStatus();
        granny.useWeapon(weapon2, egg1);
        egg1.showStatus();
        Mouse mouse = new Mouse();
        mouse.useWeapon(egg1);
        egg1.showStatus();
        Egg egg2 = chicken1.createEgg("Простое");
        chicken1.showEggs();
    }
}
