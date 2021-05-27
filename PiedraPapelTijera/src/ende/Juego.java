/**
 * Simula el juego de Piedra, Papel o tijera
 */

package ende;


public class Juego 
{
    public static void main(String args[])
    {
    	final String J1GANA = "Jugador 1 GANA";
    	final String J2GANA = "Jugador 2 GANA";
    	final String PIEDRA = "piedra";
    	final String PAPEL = "papel";
    	final String TIJERAS = "tijera";
    	
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
            else if((opcionJugador1.equals(PAPEL)) && (opcionJugador2.equals(PIEDRA))) {
            	exitosJugador1 = ++p1.exitos;
                System.out.println(J1GANA);
            }
            else if((opcionJugador1.equals(PIEDRA)) && (opcionJugador2.equals(TIJERAS))) {
            	exitosJugador1 = ++p1.exitos;
                System.out.println(J1GANA);
            }
            else if((opcionJugador1.equals(TIJERAS)) && (opcionJugador2.equals(PIEDRA))) {
            	exitosJugador2 = ++p2.exitos;
                System.out.println(J2GANA);
            }
            else if((opcionJugador1.equals(TIJERAS)) && (opcionJugador2.equals(PAPEL))) {
            	exitosJugador1 = ++p1.exitos;
                System.out.println(J1GANA);
            }
            else if((opcionJugador1.equals(PAPEL)) && (opcionJugador2.equals(TIJERAS))) {
            	exitosJugador2 = ++p2.exitos;
                System.out.println(J2GANA);
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
   
	int exitos;    
	
    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcionAlAzar() {
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
            	break;
            default:
            	break;
        }
        return opcion;
    }
    public void setExitos() {
        exitos++;
    }
    public int getExitos() {
        return(exitos);
    }
    
    
}
