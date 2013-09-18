
package lista;


public class registro {
    
  private persona [] listado;
    
  public registro (int n){
      listado=new persona [n];
      
  }
  
  public void ingresar (String identificacion, String nombre, String saldo,int j){
      persona p=new persona (identificacion,nombre,saldo);
      listado [j] = p;
  }
  
  public void ingresar (persona p,int j){
      listado [j]=p;
      
  }
  
  public persona darpersona (int j){
      return listado [j]; 
  }
  
  
}
