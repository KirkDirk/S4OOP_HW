public abstract class Warrior <T extends Weapon, E extends Shield> {
    private  String name;
    private int healthpoint;
    private T weapon;
    private E shield;


    @Override
    public String toString() {
        return String.format("name: %s, здоровье: %d, вооружен: %s и %s", name,healthpoint,weapon.toString(), shield.toString());
    }

    public Warrior(String name, int healthpoint, T weapon, E shield) {
        this.name = name;
        this.healthpoint = healthpoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthpoint() {
        return healthpoint;
    }

    public void setHealthpoint(int healthpoint) {
        this.healthpoint = healthpoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public E getShield() {
        return shield;
    }

    public void setShield(E shield) {
        this.shield = shield;
    }

    
}
