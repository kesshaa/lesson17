public class Main {
    public static void main(String[] args) {
     Palindrome p = new Palindrome();
     String str = "Казак";
     System.out.println(p.isPalindromeWord(str));
    }
}

class Palindrome {

    public boolean isPalindromeWord(String str) {
        String lower = str.toLowerCase();
        StringBuilder sb = new StringBuilder(lower);
        sb.reverse();
        return lower.equals(sb.toString());
    }
}
