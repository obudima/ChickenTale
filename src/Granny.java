public class Granny extends Human {

    private Grandpa husband;

        public Granny() {}
    public Granny(String name) {setName(name);}
    public Granny(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Grandpa getHusband() {
        return husband;
    }

    public void setHusband(Grandpa husband) {
        if (this.husband == null) {
            this.husband = husband;
            husband.setWife(this);
        }
    }

    public void divorce()
    {
        if (this.husband != null)
        {
            Grandpa husband = this.husband;
            this.husband = null;
            husband.divorce();
        }
    }

    public void useWeapon(Weapon weapon, Egg egg) {
        weapon.destroy(egg);
    }


    /*public void cry ()
    {
        System.out.println("Я заплакала");
    }*/

}
