package facil;

public class ValidPalindrome {
    public static void main(String[] args) {
        String testes[] = {"A man, a plan, a canal: Panama", "race a car", " "};
        for (String teste : testes) {
            System.out.printf("%s é um palindromo: %s\n", teste, ehPalindromo(teste));
        }
    }

    public static boolean ehPalindromo(String texto) {
        if (texto == null) return false;
        String textoNormalizado = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (texto.isEmpty()) return true;
        int i = 0, j = textoNormalizado.length() - 1;
        while (i < j) {
            if (textoNormalizado.charAt(i) != textoNormalizado.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}
