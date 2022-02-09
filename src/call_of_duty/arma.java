package call_of_duty;

public class arma {

  private String nombre;
  private int daño;
  private String cadencia;
  private boolean rafagas;

  public arma() {
    
  }

  public arma(String nombre, int daño, String cadencia, boolean rafagas) {
    
    this.nombre = nombre;
    this.daño = daño;
    this.cadencia = cadencia;
    this.rafagas = rafagas;
  
  }

  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
 
  }
  
  public int getDaño() {
    return daño;
  }
  
  public void setDaño(int daño) {
    this.daño = daño;
  }
  
  public String getCadencia() {
    return cadencia;
  }
  
  public void setCadencia(String cadencia) {
    this.cadencia = cadencia;
  }
  
  public boolean getRafagas() {
    if(rafagas = true) {
    return true;
    }
      else {
        return false;
    }
  }
  public void setRafagas(boolean rafagas) {
    this.rafagas = rafagas;
  }
  
  
  
  
  
}