//#############################################
abstract class Automovil{
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
}
