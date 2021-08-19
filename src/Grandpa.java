public class Grandpa extends Human{

    private Granny wife;

    public Grandpa() {}
    public Grandpa(String name) {setName(name);}
    public Grandpa(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Granny getWife() {
        return wife;
    }

    public void setWife(Granny wife) {
        if (this.wife == null) {
            this.wife = wife;
            wife.setHusband(this);
        }
    }

    public void divorce()
    {
        if (this.wife != null)
        {
            Granny wife = this.wife;
            this.wife = null;
            wife.divorce();
        }
    }


    public void useWeapon(Weapon weapon, Egg egg) {
        weapon.destroy(egg);
    }

    /*public void cry ()
    {
        System.out.println("Я заплакал");
    };*/

}
