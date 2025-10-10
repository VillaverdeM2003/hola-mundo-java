import java.util.Random;

public class SensorAceleracion extends Sensor {
    private double valorEjeX;
    private double valorEjeY;
    private double valorEjeZ;

    public SensorAceleracion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "m/s^2");
    }

    @Override
    public double leerValor() {
        Random random = new Random();
        valorEjeX = -5 + 10 * random.nextDouble();
        valorEjeY = -5 + 10 * random.nextDouble();
        valorEjeZ = -5 + 10 * random.nextDouble();
        double magnitud = Math.sqrt(valorEjeX * valorEjeX + valorEjeY * valorEjeY + valorEjeZ * valorEjeZ);
        System.out.printf("Aceleración: X=%.2f, Y=%.2f, Z=%.2f -> Magnitud: %.2f %s%n",
                valorEjeX, valorEjeY, valorEjeZ, magnitud, unidadMedida);
        return magnitud;
    }
}

