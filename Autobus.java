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
  @Override
  public String toString() {
    return "Clase de Autobus <Autobus>";
  }
}

