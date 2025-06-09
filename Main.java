public class Main {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Racecar"));
    }
}