//############################################
// Clase pasajero
class Pasajero{
  private String nombre;
  public int edad;
  public boolean estudiante;

    public Pasajero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Pasajero(String nombre, int edad, boolean estudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.estudiante = estudiante;
    }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  } 
  public String tomarAsiento(){
    return "El estudiante tomo asiento";
  }
  String getNumAsiento() {
      throw new UnsupportedOperationException("Not supported yet."); 
  }
  public String reclinarAsiento(int reclinacion){
    if(reclinacion > 5){
      return "No se puede reclinar más de 5 niveles";
    }
    return "Tu asiento se reclinó al nivel" + reclinacion;
  }
  @Override
  public String toString() {
    return "Clase Pasajero <Pasajero>";
  }
}

