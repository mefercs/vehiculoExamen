import javax.swing.text.html.HTMLDocument.BlockElement;

//#############################################
abstract class Automovil extends Vehiculo{
  public boolean aireAcondicionado;
  public int asientos;
  public int intermitentes; 
  public int puertas;
  public String encenderAire(){
    return "Aire encendido";
  }
  public boolean encenderIntermitentes(){
    System.out.println("Intermitentes encendidas");
    return true;
  }
  public String inclinarAsientos(){
    return "Los asientos estan siendo inclinados";
  }
  public String abrirPuertas(){
    return "Las puertas has sido abiertas";
  }
  public boolean encenderMotor(){ 
    return true;
  }
  @Override
  public String toString() {
      return "Clase automovil <Automovil>";
  }
}
