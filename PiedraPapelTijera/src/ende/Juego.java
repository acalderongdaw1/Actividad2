/**
 * Simula el juego de Piedra, Papel o tijera
 */

package ende;


public class Juego 
{
    public static void main(String args[])
    {
    	final String j1Gana = "Jugador 1 GANA";
    	final String j2Gana = "Jugador 2 GANA";
    	
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean finDeJuego = false;  
        int rondasJugadas = 0;
        int exitosJugador1 = p1.exitos;
        int exitosJugador2 = p2.exitos;
        int empates = 0;
        
        // Bucle de juego
        do {
            System.out.println("***** Ronda: " + rondasJugadas+" *********************\n");
            System.out.println("Numero de empates: " + empates + "\n");
            String opcionJugador1 = p1.opcionAlAzar();
            System.out.println("Jugador 1: " + opcionJugador1+"\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
            String opcionJugador2 = p2.opcionAlAzar();
            System.out.println("Jugador 2: " + opcionJugador2+"\t Jugador 2 - Partidas ganadas: " + exitosJugador2);
            
            if((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("papel"))) {
                System.out.println("Jugador 2 GANA");
                exitosJugador2 = ++p2.exitos;
                
            }
            else if((opcionJugador1.equals("papel")) && (opcionJugador2.equals("piedra"))) {
            	exitosJugador1 = ++p1.exitos;
                System.out.println(j1Gana);
            }
            else if((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("tijeras"))) {
            	exitosJugador1 = ++p1.exitos;
                System.out.println(j1Gana);
            }
            else if((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("piedra"))) {
            	exitosJugador2 = ++p2.exitos;
                System.out.println(j2Gana);
            }
            else if((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("papel"))) {
            	exitosJugador1 = ++p1.exitos;
                System.out.println(j1Gana);
            }
            else if((opcionJugador1.equals("papel")) && (opcionJugador2.equals("tijeras"))) {
            	exitosJugador2 = ++p2.exitos;
                System.out.println(j2Gana);
            }
            if(opcionJugador1 == opcionJugador2) {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasJugadas++;
            if((p1.exitos >= 3) || (p2.exitos >= 3)) {
            	finDeJuego = true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(finDeJuego != true);
    }
}
/**
 *
 */
class Jugador{
   
    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcionAlAzar()
    {
        String opcion = "";
        int num = (int)(Math.random() * 3);
        switch(num){
            case 0:
            	opcion = ("piedra");
                break;
            case 1:
            	opcion = ("papel");
                break;
            case 2:
            	opcion = ("tijeras");
        }
        return opcion;
    }
    public void setExitos() 
    {
        exitos++;
    }
    public int getExitos() 
    {
        return(exitos);
    }
    
    int exitos;      // número de partidas ganadas
    int winTotal;
}
