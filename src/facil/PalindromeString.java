package facil;

public class PalindromeString {
    public static void main(String[] args) {
        String[] testes = {"aibofobia", "jose", "ana", "pedro", "matheus", "ala", "ama"};
        for (String texto : testes) {
            System.out.printf("%s é um palindromo ? %s\n", texto, ehPalindrimo(texto));
        }
    }

    private static boolean ehPalindrimo(String texto) {
        if (texto.isBlank()) {
            return false;
        }
        int i = 0, j = texto.length() -1;
        while(i < j) {
            if (texto.charAt(i) != texto.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }
}
