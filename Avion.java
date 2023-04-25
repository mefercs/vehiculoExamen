//############################################
//Clase Avion
class Avion extends Vehiculo{ 
  public String aerolinea;
  private int numVuelo;
  public float altitud;
  public Pasajero[] pasajeros;
  public boolean enVuelo;

   public Avion(String aerolinea, int numVuelo, float altitud, Pasajero[] pasajeros) {
        this.aerolinea = aerolinea;
        this.numVuelo = numVuelo;
        this.altitud = altitud;
        this.pasajeros = pasajeros;
    }
  public int getNumVuelo() {
    return numVuelo;
  }
  public void setNumVuelo(int numVuelo) {
    this.numVuelo = numVuelo;
  } 
  public String aterrizar(){
    return "Aterrizando el avión";
  }
  public String despegar(){
    return "Estamos despegando";
  }
  public boolean encenderMotor(){
    return true;
  }
  @Override
  public String toString() {
      return "Clase Avion <Avion>";
  }
}
