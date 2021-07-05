public class Player {

    enum Color{
        WHITE,BLACK
    }

    private final String fullName;
    private final Color color;
    private final int age;

    public Player(String fullName, Color color, int age) {
        this.fullName = fullName;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return fullName;
    }

    public Color getColor() {
        return color;
    }
}
