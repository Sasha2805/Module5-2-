package players;

import javafx.scene.layout.VBox;

public class Player1 extends Player {
    private final double PRICE;

    public Player1(String song, double PRICE){
        super(song);
        this.PRICE = PRICE;
    }

    @Override
    public void playSong(){
        super.playSong();
    }

    @Override
    public void show(VBox vBox){
        super.show(vBox);
    }

    public double getPRICE() {
        return PRICE;
    }

}
