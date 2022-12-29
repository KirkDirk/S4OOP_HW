public class Barbarian extends Warrior<Axe, Tower> {
    public Barbarian(String name, int healthpoint, Axe weapon, Tower shield) {
        super(name, healthpoint, weapon, shield);
    }

    @Override
    public String toString() {
        return "Варвар: "+super.toString();
    }
}
