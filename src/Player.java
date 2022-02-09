import java.util.Date;

public class Player {
    private String name;
    private String DNI;
    private double height;
    private Date bornDay;
    private int numBasket;
    private int numRebound;
    private int numAssistance;
    private String team;

    public Player(String name, String DNI, double height, Date bornDay, int numBasket, int numRebound, int numAssistance, String team) {
        this.name = name;
        this.DNI = DNI;
        this.height = height;
        this.bornDay = bornDay;
        this.numBasket = numBasket;
        this.numRebound = numRebound;
        this.numAssistance = numAssistance;
        this.team = team;
    }


}
