package players;

import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

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

    @Override
    public void show(VBox vBox){
        Text error = new Text();
        error.setFont(Font.font ("Verdana", 15));
        error.setText("error");
        vBox.getChildren().add(error);
        vBox.setAlignment(Pos.CENTER);
    }

    public double getPRICE() {
        return PRICE;
    }

}
