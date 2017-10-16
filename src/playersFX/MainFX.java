package playersFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import players.*;

public class MainFX extends Application{
    public static final int HEIGHT = 600;
    public static final int WIDTH = 600;

    public static void main(String[] args) {
        launch(args);
    }

    public void showUI(HBox root) {
        VBox menu = new VBox();     // Вертикальное меню со списком плеееров
        menu.setStyle("-fx-background-color: #27333F;");
        menu.setFillWidth(true);
        menu.setMinWidth(WIDTH / 4);

        VBox viewPlayer = new VBox();  // Хранит кнопки плеера который его вызывает
        viewPlayer.setMinWidth(WIDTH - menu.getMinWidth());
        Text text = new Text("Choose player");
        text.setFont(Font.font ("Verdana", 25));

        Button[] buttons = new Button[6];   // Массив кнопок для переключения плееров
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button("Player" + (i + 1));
            buttons[i].getStyleClass().add("menu-button");
        }

        // Создание обьектов классов и демострация работы методов
        buttons[0].setOnAction(event -> {
            viewPlayer.getChildren().clear(); // Очистка VВоx при повторном нажатии
            Player1 player1 = new Player1("The best song", 302);
            player1.show(viewPlayer);
        });

        buttons[1].setOnAction(event -> {
            viewPlayer.getChildren().clear();
            Player2 player2 = new Player2("Good song", 460);
            player2.show(viewPlayer);
        });

        buttons[2].setOnAction(event -> {
            viewPlayer.getChildren().clear();
            Player3 player3 = new Player3(256.80);
            player3.addSongToPlaylist("Super song");
            player3.addSongToPlaylist("Super song 1");
            player3.show(viewPlayer);
        });

        buttons[3].setOnAction(event -> {
            viewPlayer.getChildren().clear();
            Player4 player4 = new Player4(550.50);
            player4.addSongToPlaylist("Good song");
            player4.addSongToPlaylist("Good song 1");
            player4.addSongToPlaylist("Good song 2");
            player4.show(viewPlayer);
        });

        buttons[4].setOnAction(event -> {
            viewPlayer.getChildren().clear();
            Player5 player5 = new Player5(300);
            player5.addSongToPlaylist("Song");
            player5.addSongToPlaylist("Song 1");
            player5.addSongToPlaylist("Song 2");
            player5.show(viewPlayer);
        });

        buttons[5].setOnAction(event -> {
            viewPlayer.getChildren().clear();
            Player6 player6 = new Player6(300);
            player6.addSongToPlaylist("Song");
            player6.addSongToPlaylist("Song 1");
            player6.addSongToPlaylist("Song 2");
            player6.show(viewPlayer);
        });

        menu.getChildren().addAll(buttons);
        viewPlayer.setAlignment(Pos.CENTER);
        viewPlayer.getChildren().add(text);
        root.getChildren().addAll(menu, viewPlayer);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox root = new HBox();
        showUI(root);

        Scene scene = new Scene(root);
        scene.getStylesheets().add("playersFX/styles.css");
        primaryStage.setScene(scene);
        primaryStage.setHeight(HEIGHT);
        primaryStage.setWidth(WIDTH);
        primaryStage.show();
    }

}
