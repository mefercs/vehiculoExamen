//#############################################
class Electrico extends Automovil{
  public String marca;
  public String modelo;
  public int year;
  public Bateria bateria; 
  public String recargarBateria(float tiempoMinutos){
    return "Bateria recargada durante " + tiempoMinutos + " minutos";
  }
  public String iniciarAhorroBateria(){
    return "Iniciado ahorro de bateria";
  }
  public Electrico(String marca, String modelo, int year) {
      this.marca = marca;
      this.modelo = modelo;
      this.year = year;
  }
  public String getMarca() {
      return marca;
  }
  public String getModelo() {
      return modelo;
  }
  public int getYear() {
      return year;
  }
  public Bateria getBateria() {
      return bateria;
  }
}
