package third;

public class Bell {
    private boolean isDing;

    public Bell() {
        this.isDing = true;
    }

    public String sound() {
        if (isDing) {
            isDing = false;
            return "ding";
        }
        isDing = true;
        return "dong";
    }
}
