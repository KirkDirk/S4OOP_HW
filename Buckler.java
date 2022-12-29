public abstract class Buckler implements Shield {
    public abstract int chanceBlock();

    @Override
    public String toString() {
        return String.format("Броня %d, шанс блока %d", armor(), chanceBlock());
    }
}
