//#############################################
//Clase motocicleta
class Motocicleta extends Vehiculo{
  public String marca;
  public String modelo; 
  public float cilindraje; 
  public int year;
  public float tamanoDeLaLlanta;
  public float combustible; 
  public LlantaDeMoto[] llantas; 
  public Casco casco; 
  public String llenarTanque(float litros){
    return "El tanque fue rellenado con " + litros;
  }
  public boolean encenderMotor(){
    System.out.println("Motor encendido por una motocicleta");
    return true;
  }
  public String frenar(int intensidad){
    return "Se freno con una intensidad de " + intensidad;
  }
  @Override
  public String toString() {
    return "Clase de Motocicleta <Motocicleta>";
  } 
}

