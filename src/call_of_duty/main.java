package call_of_duty;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    // El programa consiste en un sencillo menu donde simula que consultas las estadisticas de personajes y armas del juego call of duty,
	// primero te preguntara que presonaje quieres consultar y luego tambien puedes consultar estadisticas de su arma.
	  
	  
    int numper = 0;
    Scanner teclado = new Scanner(System.in);
    
    personaje p = new personaje();
    arma arm1 = new arma ("SCAR-H", 80, "Alta", false);
    arma arm2 = new arma ("Man-o-War", 95, "Alta", false);
    arma arm3 = new arma ("XML", 70, "Media", true);
    arma arm4 = new arma ("M8A1", 80, "Alta", true);
    arma arm5 = new arma ("Gorgon", 100, "Baja", false);
    arma arm6 = new arma ("Kuda", 50, "Muy Alta", false);
    arma arm7 = new arma ("VMP", 60, "Muy Alta", false);
    arma arm8 = new arma ("M4", 80, "Alta", true);
    arma arm9 = new arma ("FAL", 90, "Baja", false);
    arma arm10 = new arma ("Locus", 120, "Muy baja", false);
    
    personaje per1 = new personaje("Reaper", "Guerra", 200, false, 80, "Guadaña", 1);
    personaje per2 = new personaje("Spectre", "Camuflaje", 120, true, 30, "Hojas ocultas", 2);
    personaje per3 = new personaje("Nomad", "Camuflaje", 150, true, 40, "Colmena", 3);
    personaje per4 = new personaje("Blackjack", "Tecnico", 100, true, 70, "Ludopata", 4);
    personaje per5 = new personaje("Battery", "Guerra", 200, true, 50, "Armadura cinetica", 5);
    personaje per6 = new personaje("Prophet", "Tecnico", 150, false, 10, "Tormenta", 6);
    personaje per7 = new personaje("Outrider", "Camuflaje", 100, true, 20, "Halcón", 7);
    personaje per8 = new personaje("Ruin", "Guerra", 200, false, 60, "Puas gravitatorias", 8);
    personaje per9 = new personaje("Seraph", "Tecnico", 150, false, 100, "Aniquilador", 9);
    personaje per10 = new personaje("Firebreak", "Tecnico", 200, false, 90, "Lanzallamas", 10);
    
    personaje[] selectPersonaje = new personaje[10];
    selectPersonaje[0] = per1;
    selectPersonaje[1] = per2;
    selectPersonaje[2] = per3;
    selectPersonaje[3] = per4;
    selectPersonaje[4] = per5;
    selectPersonaje[5] = per6;
    selectPersonaje[6] = per7;
    selectPersonaje[7] = per8;
    selectPersonaje[8] = per9;
    selectPersonaje[9] = per10;
    
    arma[] armaDisponible = new arma[10];
    armaDisponible[0] = arm1;
    armaDisponible[1] = arm2;
    armaDisponible[2] = arm3;
    armaDisponible[3] = arm4;
    armaDisponible[4] = arm5;
    armaDisponible[5] = arm6;
    armaDisponible[6] = arm7;
    armaDisponible[7] = arm8;
    armaDisponible[8] = arm9;
    armaDisponible[9] = arm10;
    
    System.out.println("Selecciona un personaje: \n");
    seleccionPersonaje(selectPersonaje);
    numper = teclado.nextInt();
   
    switch(numper){
      
      case 1: System.out.println("Has seleccionado a " + selectPersonaje[0].getNombre());
      opcionPersonaje(numper, selectPersonaje, armaDisponible);
      break;

      case 2: System.out.println("Has seleccionado a " + selectPersonaje[1].getNombre());
      opcionPersonaje(numper, selectPersonaje, armaDisponible);
      break;
      
      case 3: System.out.println("Has seleccionado a " + selectPersonaje[2].getNombre());
      opcionPersonaje(numper, selectPersonaje, armaDisponible);
      break;
      
      case 4: System.out.println("Has seleccionado a " + selectPersonaje[3].getNombre());
      opcionPersonaje(numper, selectPersonaje, armaDisponible);
      break;
      
      case 5: System.out.println("Has seleccionado a " + selectPersonaje[4].getNombre());
      opcionPersonaje(numper, selectPersonaje, armaDisponible);
      break;
      
      case 6: System.out.println("Has seleccionado a " + selectPersonaje[5].getNombre());
      opcionPersonaje(numper, selectPersonaje, armaDisponible);
      break;
      
      case 7: System.out.println("Has seleccionado a " + selectPersonaje[6].getNombre());
      opcionPersonaje(numper, selectPersonaje, armaDisponible);
      break;
      
      case 8: System.out.println("Has seleccionado a " + selectPersonaje[7].getNombre());
      opcionPersonaje(numper, selectPersonaje, armaDisponible);
      break;
      
      case 9: System.out.println("Has seleccionado a " + selectPersonaje[8].getNombre());
      opcionPersonaje(numper, selectPersonaje, armaDisponible);
      break;
      
      case 10: System.out.println("Has seleccionado a " + selectPersonaje[9].getNombre());
      opcionPersonaje(numper, selectPersonaje, armaDisponible);
      break;
    }
      
      
      
      
      
    
    
    
  }

  public static void seleccionPersonaje(personaje[] selectPersonaje) {
  
    
    for(int i = 0; i < selectPersonaje.length; i++) {
      
      System.out.println(selectPersonaje[i].getId() + " - " + selectPersonaje[i].getNombre());
      
    }
  }
  
 public static void opcionPersonaje(int i, personaje[] selectPersonaje,  arma[] armaDisponible ) {
   Scanner teclado2 = new Scanner(System.in);
   i -= 1;
   int opcion;
   System.out.println("\nSelecciona una opción:");
   System.out.println("\n1. Consultar estadisticas");
   System.out.println("2. Habilidad especial");
   System.out.println("3. ¿Es humano?");
   System.out.println("4. Aspecto");
   System.out.println("5. Consultar arma");
   System.out.println("6. Salir");
   opcion = teclado2.nextInt();
   
   switch(opcion){
     
     case 1: System.out.println("Las estadisticas de " + selectPersonaje[i].getNombre() + " son " + selectPersonaje[i].getVida() + " puntos de vida " + " y nivel " + selectPersonaje[i].getNivel());
     break;
     case 2: System.out.println("La habilidad especial de " + selectPersonaje[i].getNombre() + " es " + selectPersonaje[i].getHabilidad()); 
     break;
     case 3: if(selectPersonaje[i].getHumano() == false) {
       System.out.println(selectPersonaje[i].getNombre() + " no es " + "humano" );
     }else {
       System.out.println(selectPersonaje[i].getNombre() + " es " + "humano" );
     }
     break;
     case 4: System.out.println("El aspecto de " + selectPersonaje[i].getNombre() + " es " + selectPersonaje[i].getAspecto());
     break;
     case 5: opcionArma(i, armaDisponible, selectPersonaje);
     break;
     default:
    	 System.out.println("Gracias por usar el programa");
   }
    
     
 }
 
 public static void opcionArma(int i, arma [] armaDisponible, personaje [] selectPersonaje) {
   Scanner teclado3 = new Scanner(System.in);
   i-=1;
   int opcion = 0;
   System.out.println("El arma de " + selectPersonaje[i].getNombre() + " es " + armaDisponible[i].getNombre());
   System.out.println("¿Que desea consultar?:");
   System.out.println("\n1. Estadisticas");
   System.out.println("2. ¿Es de rafagas?");
   System.out.println("3. Salir");
   opcion = teclado3.nextInt();
   
   
   
   
   
   
   switch (opcion){
	 
   case 1: System.out.println("Las estadisticas de la " + armaDisponible[i].getNombre() + " son " + armaDisponible[i].getDaño() + " puntos de daño por disparo y una cadencia " + armaDisponible[i].getCadencia());
   break;
   case 2: if(armaDisponible[i].getRafagas() == false) {
       System.out.println(armaDisponible[i].getNombre() + " no es de rafagas." );
     }else {
       System.out.println(armaDisponible[i].getNombre() + " es de rafagas" );
     }
   break;
   default:
	   System.out.println("Gracias por usar el programa");
	   
	   
	   
   }
   
	 
   
   
   
   
 }
  
}

