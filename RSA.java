import java.util.Scanner;

public class RSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to generate the public and private key");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int n = p * q;
        System.out.println("n is " + n);
        int z = (p - 1) * (q - 1);
        System.out.println("z is " + z);
        int e = gcd(z);
        System.out.println("e is " + e);
        int d = mod(e, z);
        System.out.println("d is " + d);
        System.out.println("Enter a msg number");
        int m = sc.nextInt();
        System.out.println("You entered " + m);
        double pwr = Math.pow(m, e);
        int c = ((int) pwr) % n;
        System.out.println("The encrypted msg is " + c);
        System.out.println("Now decrypting");
        int decipher = decr(c, d, n);
        System.out.println("The decrypted msg is " + decipher);
    }

    public static int basicMod(int c, int n) {
        return c % n;
    }

    public static int decr(int c, int d, int n) {
        int bm = basicMod(c, n);
        int mul = bm;
        for (int i = 1; i < d; i++) {
            bm = (bm * mul) % n;
        }
        return bm;
    }

    public static int gcd(int z) {
        int e = 1;
        for (int i = 2; i < z; i++) {
            int x = z % i;
            if (x != 0) {
                e = i;
                return e;
            }
        }
        return e;
    }

    public static int mod(int e, int z) {
        int d = 1;
        for (int i = 1; i < z; i++) {
            d = i;
            if ((e * d) % z == 1) {
                return d;
            }
        }
        return d;
    }
}