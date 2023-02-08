public enum CapacityBus {
    EspeciallySmall(0, 10),
    Small(11, 25),
    Average(26, 50),
    Big(51, 80),
    EspeciallyBig(81, 120);

    private int lowerCapacityBus;
    private int upperCapacityBus;

    CapacityBus(int downCapacityBus, int upCapacityBus) {
        this.lowerCapacityBus = lowerCapacityBus;
        this.upperCapacityBus = upperCapacityBus;
    }

    public int getLowerCapacity() {
        return lowerCapacityBus;
    }

    public void setlowerCapacityBus(int lowerCapacityBus) {
        this.lowerCapacityBus = lowerCapacityBus;
    }

    public int getUpperCapacityBus() {
        return upperCapacityBus;
    }

    public void setUpCapacity(int upperCapacityBus) {
        this.upperCapacityBus = upperCapacityBus;
    }

    @Override
    public String toString() {
        return "Вместимость: " + getLowerCapacity() + " - " + getUpperCapacityBus() + " мест";
    }
}