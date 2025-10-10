import java.util.Random;

public class SensorPresion extends Sensor {
    private double valorActual;

    public SensorPresion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "hPa");
    }

    @Override
    public double leerValor() {
        Random random = new Random();
        valorActual = 900.0 + (1100.0 - 900.0) * random.nextDouble();
        System.out.println("Valor de presión: " + valorActual + " " + unidadMedida);
        return valorActual;
    }
}
