import java.util.Scanner;

public class QuickUnionUF{
    int[] id;
    public QuickUnionUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public static void main(String[] args) {
        QuickUnionUF qf1 = new QuickUnionUF(10);
        boolean t = true;
        while (t) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Select an option");
            System.out.println("\t1\t->\tChecking the connection");
            System.out.println("\t2\t->\tConnecting two nodes");
            System.out.println("\tany other number\t->\tExit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter two numbers between 0-9 to check for connection");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Checking if "+a+" and "+b+" are connected...");
                if (qf1.connected(a, b)) {
                    System.out.println("Yes they are");
                }
                else {
                    System.out.println("Sorry They are not connected");
                }
            } else if (choice == 2) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                qf1.union(a, b);
            }
            else {
                t = false;
            }
        }
    }
}