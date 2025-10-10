import java.util.ArrayList;

public class SistemaMonitoreo {
    public static void main(String[] args) {
        ArrayList<Sensor> listaSensores = new ArrayList<>();

     
        listaSensores.add(new SensorTemperatura("DHT11", "Adafruit", 0.5));
        listaSensores.add(new SensorTemperatura("TMP36", "AnalogDevices", 0.4));
        listaSensores.add(new SensorPresion("BMP180", "Bosch", 0.3));
        listaSensores.add(new SensorPresion("BME280", "Bosch", 0.35));
        listaSensores.add(new SensorAceleracion("ADXL345", "AnalogDevices", 0.6));
        listaSensores.add(new SensorAceleracion("MPU6050", "InvenSense", 0.65));

        
        for (Sensor sensor : listaSensores) {
            System.out.println("\n--- Sensor: " + sensor.modelo + " ---");
            sensor.encender();
            sensor.calibrar();
            double valor = sensor.leerValor();
            System.out.println("Resultado de lectura: " + valor + " " + sensor.unidadMedida);
            System.out.println(sensor.obtenerEstado());
        }
    }
}
