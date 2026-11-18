package Buílder;

public class Progam {

    public static void main(String[] args) {
        Computador basico = new ComputadorBuilder()
                .processador("Intel Core i5")
                .memoriaRam("8GB")
                .armazenamento("256GB SSD")
                .build();

        Computador gamer = new ComputadorBuilder()
                .processador("Intel Core i9")
                .memoriaRam("32GB")
                .armazenamento("1TB SSD")
                .placaDeVideo("RTX 4070")
                .build();

        System.out.println("=== Computador Básico ===");
        System.out.println(basico);
        System.out.println();
        System.out.println("=== Computador Gamer ===");
        System.out.println(gamer);
    }
}
