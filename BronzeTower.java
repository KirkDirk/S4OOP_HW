public class BronzeTower extends Tower {

    @Override
    public int armor() {
        return 8;
    }
    
    @Override
    public String toString() {
        return "Башенный щит: " + super.toString();
    }
}
