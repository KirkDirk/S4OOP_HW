public abstract class Tower implements Shield {
    @Override
    public String toString() {
        return String.format("Броня %d", armor());
    }
}
