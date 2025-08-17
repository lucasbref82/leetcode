package facil;

public class PalindromeNumber {

    public static boolean ehPalindromo(int valor) {
        if (valor < 0) {
            return false;
        }
        String s = Integer.toString(valor);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] testes = {0, 5, 11, 121, 12321, 123321, -121, 10, 1001, 1000000001};
        for (int t : testes) {
            System.out.printf("%d -> %b%n", t, ehPalindromo(t));
        }
    }
}
