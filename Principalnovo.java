import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principalnovo {
    public static void main(String[] args) {
        List<Treino> meusTreinos = new ArrayList<>();
        String continuar;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("--- Registro de Treino ---");
                System.out.println("Digite a distância (km): ");
                double distancia = scanner.nextDouble();

                System.out.println("Digite a duração (minutos): ");
                int minutos = scanner.nextInt();

                meusTreinos.add(new Treino(LocalDate.now(), Duration.ofMinutes(minutos), distancia));

                System.out.print("Deseja registar outro treino? (S/N): ");
                continuar = scanner.next();

            } while (continuar.equalsIgnoreCase("S"));
       }

        System.out.println("/n--- Relatório Final de Treinos ---");
        for (Treino t : meusTreinos) {
        System.out.println(t);
        System.out.printf("Pace: %.2f min/km%n", t.calcularPace());
        }
    }
}