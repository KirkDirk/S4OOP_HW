public class BattleBuckler extends Buckler {

    @Override
    public int armor() {
        return 5;
    }

    @Override
    public int chanceBlock() {
        return 50;
    }

    @Override
    public String toString() {
        return "Боевой щит: " + super.toString();
    }
    
}
