package fifth;

public class Table {
    private int[][] table;

    public Table(int rows, int cols) {
        table = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return table[row][col];
    }

    public void setValue(int row, int col, int value) {
        table[row][col] = value;
    }

    public int rows() {
        return table.length;
    }

    public int cols() {
        return table[0].length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : table) {
            for (int value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public double average() {
        int sum = 0;
        int count = 0;
        for (int[] row : table) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
    }
}