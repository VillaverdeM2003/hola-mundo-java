public class DispositivoElectronico {
    protected String modelo;
    protected String fabricante;
    protected double consumoEnergia;
    protected boolean encendido;

   
    public DispositivoElectronico(String modelo, String fabricante, double consumoEnergia) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        System.out.println(modelo + " encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(modelo + " apagado.");
    }

    public String obtenerEstado() {
        return "Modelo: " + modelo +
               ", Fabricante: " + fabricante +
               ", Consumo: " + consumoEnergia + " W, Estado: " +
               (encendido ? "Encendido" : "Apagado");
    }
}
