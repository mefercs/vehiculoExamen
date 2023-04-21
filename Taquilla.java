//############################################
//Clase Taquilla
interface Taquilla{
  static final public String EMPRESA = "UPIITA-CORPS";
  static final public float PRECIO_SUGERIDO = 230;
  abstract public String comprarBoleto(float precio); 
  abstract public String asingnarLugar(int lugar);
}

