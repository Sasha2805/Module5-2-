package players;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainFX extends Application{
    public static final int HEIGHT = 600;
    public static final int WIDTH = 600;

    public static void main(String[] args) {
        launch(args);
    }

    public void showUI(HBox root){
        VBox menu = new VBox();
        menu.setStyle("-fx-background-color: #27333F;");
        menu.setFillWidth(true);

        Button player = new Button("Player");
        Button player1 = new Button("Player1");
        Button player2 = new Button("Player2");
        Button player3 = new Button("Player3");
        Button player4 = new Button("Player4");
        Button player5 = new Button("Player5");
        Button player6 = new Button("Player6");
        menu.getChildren().addAll(player, player1, player2, player3, player4, player5, player6);
        root.getChildren().add(menu);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox root = new HBox();
        showUI(root);
        primaryStage.setScene(new Scene(root));
        primaryStage.setHeight(HEIGHT);
        primaryStage.setWidth(WIDTH);
        primaryStage.show();

    }

}
