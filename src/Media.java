import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner media = new Scanner(System.in);
        System.out.println("Qual a nota da AV1?");
        float av1 = media.nextFloat(); // Lendo a nota da AV1 como float
        System.out.println("AV1 =" + av1);

        System.out.println("Qual a nota da AV2?");
        float av2 = media.nextFloat(); // Lendo a nota da AV2 como float
        System.out.println("AV2 =" + av2);

        System.out.println("Qual a nota da AV3?");
        float av3 = media.nextFloat(); // Lendo a nota da AV3 como float
        System.out.println("AV3 =" + av3);

        System.out.println("Qual a nota da AV4?");
        float av4 = media.nextFloat(); // Lendo a nota da AV4 como float
        System.out.println("AV4 =" + av4);

        float mediaTotal = (av1 + av2 + av3 + av4) / 4; // Calculando a média

        System.out.println("A média das notas é: " + mediaTotal);
    }
}