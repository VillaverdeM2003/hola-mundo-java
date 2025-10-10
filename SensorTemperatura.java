import java.util.Random;

public class SensorTemperatura extends Sensor {
    private double valorActual;

    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "°C");
    }

    @Override
    public double leerValor() {
        Random random = new Random();
        valorActual = 20.0 + (35.0 - 20.0) * random.nextDouble();
        System.out.println("Valor de temperatura: " + valorActual + " " + unidadMedida);
        return valorActual;
    }
}
