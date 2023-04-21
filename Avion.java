//############################################
//Clase Avion
class Avion{ 
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
}

//############################################
class Autobus extends Vehiculo implements Taquilla{
  public Pasajero[] pasajeros;
  public int asientos;
  public String abrirCompuerta(){
    return "La puerta esta siendo abierta";
  }
  public boolean encenderMotor(){
    System.out.println("Motor encendido por un autobus");
    return true;
  }
  public String comprarBoleto(float precio){
    return "Boleto comprado por " + precio +" pesos";
  }
  public String asingnarLugar(int lugar){
    return "Tu lugar es " + lugar + ".";
  }
  public String prenderIntermitentes(float intensidad){ 
    return "La intensidad de las luces prendidas es: " + intensidad + ".";
  }
  public String apagarIntermitentes(){
    return "Las intermitentes han sido apagadas";
  }
}

