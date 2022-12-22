package methodexs;

public class x7pentagonal {
    public static void main(String[] args) {
        System.out.println("pentagonals:");
        int count = 1;
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%-6d",pentagonal(i));
            if (count % 10 == 0) System.out.println();
                count++;
            }
        }

    static int pentagonal(int i) {
        return i * (3 * i - 1) / 2;
    }
}