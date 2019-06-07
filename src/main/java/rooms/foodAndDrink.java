package rooms;

public enum foodAndDrink {

    TEA(15),
    COFFEE(20),
    BANANA(10),
    ORANGE(5),
    APPLE(5),
    KIWI(1);

    public final double value;
    foodAndDrink(double value) {
        this.value = value;
    }
}
