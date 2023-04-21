public class Main {
    public static void main(String[] args) {
        int num = 100;
        int num2 = 200;
        int num3 = 0;
        if (num2 > 1000) {
            num3 = num2 / 100;
        }
        int num4 = num + num2 + num3;
        System.out.println(num4);
    }
}