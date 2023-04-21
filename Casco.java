//#############################################
//Clase casco
class Casco{
  public String marca;
  public float talla;
  public double modelo;
  public String abrirLente(int nivel){
    if(nivel>3){
      return "No se puede reclinar el lente mas de 3 niveles";
    }
    return "El lente del casco ha sido abierto con " + nivel + " niveles.";
  }
  public String apretarCaso() {
    return "El casco fue apretado";
  }
  public boolean ponerCasco(){
    return true;
  }
  public boolean quitarCasco(){
    return true;
  }
}


