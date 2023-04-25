//############################################
//Clase vehiculo
abstract class Vehiculo{
  protected int llantas;
  protected float aceleracion;
  protected int frenos;
  protected static String motor; 
  abstract public boolean encenderMotor();
  public float acelerar(float magnitud){
    return this.aceleracion + magnitud;
  }
  @Override
  public String toString() {
    return "Clase Vehiculo <Vehiculo>";
  }
}
