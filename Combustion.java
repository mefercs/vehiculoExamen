//#############################################
class Combustion{
  public String marca;
  public String modelo;
  public int year;
  public float combustible;
  public float cilindraje;
  public boolean cajuela = false;
  public Combustion(String marca, String modelo, int year, float combustible, float cilindraje) {
    this.marca = marca;
    this.modelo = modelo;
    this.year = year;
    this.combustible = combustible;
    this.cilindraje = cilindraje;
  }
  public String llenarTanque(float litros){
    return "Cosbustible actual: " + (litros + this.combustible);
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
  public float getCombustible() {
    return combustible;
  }
  public float getCilindraje() {
    return cilindraje;
  }
  public String abrirCajuela(){
    if(cajuela == true){
      return "La cajuela ya esta abierta";
    }
    return "Abriendo la cajuela";
  }
  public String cerrarCajuela(){
    if(cajuela == false){
      return "La cajuela ya esta cerrada";
    }
    return "Cerrando cajuela";
  }
}
