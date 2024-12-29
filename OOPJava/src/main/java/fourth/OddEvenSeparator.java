package fourth;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private List<Integer> numbers;

    public OddEvenSeparator() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public String even() {
        String result = "";
        for (int number : numbers) {
            if (number % 2 == 0) {
                result += number + " ";
            }
        }
        return result;
    }

    public String odd() {
        String result = "";
        for (int number : numbers) {
            if (number % 2 != 0) {
                result += number + " ";
            }
        }
        return result;
    }
}