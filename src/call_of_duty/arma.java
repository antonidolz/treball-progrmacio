package call_of_duty;

public class arma {

  private String nombre;
  private int da�o;
  private String cadencia;
  private boolean rafagas;

  public arma() {
    
  }

  public arma(String nombre, int da�o, String cadencia, boolean rafagas) {
    
    this.nombre = nombre;
    this.da�o = da�o;
    this.cadencia = cadencia;
    this.rafagas = rafagas;
  
  }

  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
 
  }
  
  public int getDa�o() {
    return da�o;
  }
  
  public void setDa�o(int da�o) {
    this.da�o = da�o;
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