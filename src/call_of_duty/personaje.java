package call_of_duty;

public class personaje {

  private String nombre;
  private String aspecto;
  private int vida;
  private boolean humano;
  private int nivel;
  private String habilidad;
  private arma arma;
  private int id;
  
  public personaje() {
    
  }
  
  
  public personaje(String nombre, String aspecto, int vida, boolean humano, int nivel, String habilidad, int id){
    this.nombre = nombre;
    this.aspecto = aspecto;
    this.vida = vida;
    this.humano = humano;
    this.nivel = nivel;
    this.habilidad = habilidad;
    this.id = id;
  }


  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getAspecto() {
    return aspecto;
  }
  public void setAspecto(String aspecto) {
    this.aspecto = aspecto;
  }
  public int getVida() {
    return vida;
  }
  public void setVida(int vida) {
    this.vida = vida;
  }
  public boolean getHumano() {
    if (humano == true) {
      return true;
    } else {
      return false;
    }
  }
  public void setHumano(boolean humano) {
    this.humano = humano;
  }
  public int getNivel() {
    return nivel;  
  }
  public void setNivel(int nivel) {
    this.nivel = nivel;
  }
  public String getHabilidad() {
    return habilidad;
  }
  public void setHabilidad(String habilidad) {
    this.habilidad = habilidad;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  
}
