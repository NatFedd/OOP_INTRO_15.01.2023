public enum TypeLoadCapacityTrucks {

    N1(0.0f, 3.50f),
    N2(3.51f, 12f),
    N3(12.1f, 0.0f);

    private float lowerLoadCapacity;
    private float upperLoadCapacity;

    TypeLoadCapacityTrucks(float lowerLoadCapacity, float upperLoadCapacity) {
        this.lowerLoadCapacity = lowerLoadCapacity;
        this.upperLoadCapacity = upperLoadCapacity;
    }

    public float getLowerLoadCapacity() {
        return lowerLoadCapacity;
    }

    public void setLowerLoadCapacity(float lowerLoadCapacity) {
        this.lowerLoadCapacity = lowerLoadCapacity;
    }

    public float getUpperLoadCapacity() {
        return upperLoadCapacity;
    }

    public void setUpperLoadCapacity(float upperLoadCapacity) {
        this.upperLoadCapacity = upperLoadCapacity;
    }


    @Override
    public String toString() {
        if (getUpperLoadCapacity() == 0.0f) {
            return "Грузоподъемность: от " + getLowerLoadCapacity() + " тонн";
        } else {
            return "Грузоподъемность: от " + getLowerLoadCapacity() + " тонн до " + getUpperLoadCapacity() + " тонн";
        }
    }

}
