public class QuickFindUF{
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public static void main(String[] args) {
        QuickFindUF qf1 = new QuickFindUF(10);
        System.out.println(qf1.connected(1, 2));
        qf1.union(2,3);
        qf1.union(2,5);
        qf1.union(2,4);
        qf1.union(8,4);
        qf1.union(1,2);
        System.out.println(qf1.connected(1, 2));
        System.out.println(qf1.connected(1, 5));
        System.out.println(qf1.connected(1, 9));
        /*for (int i :
                qf1.id) {
            System.out.println(i);
        }*/
    }
}
