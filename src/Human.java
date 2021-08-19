public class Human {
    private String name;
    private int age;
    private Chicken pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 200)
            this.age = age;
    }

    public Chicken getPet() {
        return pet;
    }

    public void setPet(Chicken pet) {
        this.pet = pet;
        pet.setOwner(this);
        if (pet.getOwner() != this) pet.setOwner(this);

    }
}
