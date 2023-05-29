public enum BodyTypePC {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP_TRUCK("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String bodyTypePC;

    public String getBodyTypePC() {
        return bodyTypePC;
    }

    BodyTypePC(String bodyTypePC) {
        this.bodyTypePC = bodyTypePC;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + this.bodyTypePC;
    }

}