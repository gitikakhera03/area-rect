public class input {
    static void swapthe(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("the number after swap is " + x + "and" + y);
    }

    public static void main(String[] args) {
        swapthe(4, 5);
    }

};
