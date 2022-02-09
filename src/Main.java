import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Player> player =  new ArrayList<Player>();


        player = crearJugadores(player);
    }

    private static List<Player> crearJugadores(List<Player> player) {
        int cont = 0;
        int limit = createNumPlayers();
        while(cont < limit){
            player.add(createPlayer());
        }
        return player;
    }

    private static Player createPlayer() {
    
    }

    private static int createNumPlayers() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
