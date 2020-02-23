package pack;
public class charCheck{
    public static void main(String[] args) {
        char A[] = {'a', 'A', '1', ' ', '*'};
        for (int i = 0; i < A.length; i++) {
            if (Character.isDigit(A[i])) {
                System.out.println(A[i]+" is Digit");
            } else if (Character.isAlphabetic(A[i])) {
                if (Character.isLowerCase(A[i])) {
                    System.out.println(A[i] + " is LowerCase");
                } else {
                    System.out.println(A[i] + " is UpperCase");
                }
            } else if (Character.isWhitespace(A[i])) {
                System.out.println(A[i] + " is a White Space");
            } else {
                System.out.println(A[i] + " is not Recognised");
            }
        }
    }
}