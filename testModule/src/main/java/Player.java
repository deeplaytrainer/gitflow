public class Player {

    enum Color{
        WHITE,BLACK
    }

    private final String fullName;
    private final Color color;

    public Player(String fullName, Color color) {
        this.fullName = fullName;
        this.color = color;
    }

    public String getName() {
        return fullName;
    }

    public Color getColor() {
        return color;
    }
}
