package facil;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {2,2,1}));
        System.out.println(singleNumber(new int[] {4,1,2,1,2}));
        System.out.println(singleNumber(new int[] {1}));
    }


    public static int singleNumber(int[] nums) {
        int numero = 0;
        for (int num : nums) {
            numero ^= num; // Usando operador bit a bit, caso o número não exista ele adiciona, caso exista subtrai o valor,
        }
        return numero;
    }
}
