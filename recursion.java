
public class recursion {

    public static int num(int n) {
        if (n == 1) {
            System.out.println(n);
            return 1;
        }
        num(n - 1);
        System.out.println(n);

        return 1;
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        ans = n * fact(n - 1);
        return ans;
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int ans = 0;
        ans = n + sum(n - 1);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        num(10);
        System.out.println("    ");
        System.out.println(fact(5));
        System.out.println("    ");
        System.out.println(sum(5));

    }
}
