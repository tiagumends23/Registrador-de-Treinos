import java.time.Duration;
import java.time.LocalDate;

public class Treino {
    private final LocalDate data;
    private final Duration duracao;
    private final double distanciaKm;

    public Treino(LocalDate data, Duration duracao, double distanciaKm) {
        this.data = data;
        this.duracao = duracao;
        this.distanciaKm = distanciaKm;
    }

    public double calcularPace() {
        long segundosTotais = duracao.getSeconds();
        double minutosTotais = segundosTotais / 60.0;

        return minutosTotais / distanciaKm;
    }

    public LocalDate getData() {
        return data;
    }
    
    public Duration getDuracao() {
        return duracao;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    @Override
    public String toString() {
        return "Treino do dia" + data + ": " + distanciaKm + "km em " + duracao.toMinutes() + "minutos.";
    }
}