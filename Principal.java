import java.time.Duration;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        Duration duracao = Duration.ofMinutes(30);
        double km = 5.0;

        Treino meuTreino = new Treino(hoje, duracao, km);
        System.out.println("Pace do treino: " + meuTreino.calcularPace() + "min/km");        
        System.out.println(meuTreino);
    }
}   