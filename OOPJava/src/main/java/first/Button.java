package first;

public class Button {
    private int clickCount;

    public Button() {
        this.clickCount = 0;
    }

    public String click() {
        clickCount++;
        return "Количество нажатий: " + clickCount;
    }
}