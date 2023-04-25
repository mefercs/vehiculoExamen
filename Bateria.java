//#############################################
class Bateria{
  public float ampers;
  public float voltaje;
  public Bateria(float ampers, float voltaje) {
    this.ampers = ampers;
    this.voltaje = voltaje;
  }
  public String cargar(){
    return "Cargando bateria";
  }
  public String descargar(){
    return "Comsumiendo bateria";
  }
  public float getAmpers() {
    return ampers;
  }
  public float getVoltaje() {
    return voltaje;
  }
  @Override
  public String toString() {
    return "Clase de Bateria <Bateria>";
  } 
}

