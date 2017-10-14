package players;

public class Player2 extends Player{
    private final double PRICE;

    public Player2(String song, double PRICE){
        super(song);
        this.PRICE = PRICE;
    }

    @Override
    public void playSong(){
        System.out.println("error");
    }

    public double getPRICE() {
        return PRICE;
    }

}
