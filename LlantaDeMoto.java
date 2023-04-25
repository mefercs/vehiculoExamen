//#############################################
//Clase LLanta de moto
class LlantaDeMoto{
  public String rodada; 
  public float medida; 
  public float presion; 
  public String ajustarPresion(float presion){
    return "La presion ahora es" + (this.presion + presion);
  }
  @Override
  public String toString() {
    return "Clase Llanta de moto <LlantaDeMoto>";
  }
}


