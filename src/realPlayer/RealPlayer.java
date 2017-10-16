package realPlayer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

public class RealPlayer  extends Application {
    public static final int HEIGHT = 200;
    public static final int WIDTH = 600;
    Media media;
    MediaPlayer mediaPlayer;
    Text song = new Text();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final Label fileLabel = new Label();

        // Создаем обьект Media и задаем ему начальный путь к mp3 файлу
        media = new Media(new File("E:/GoJava/music/Rules.mp3").toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);    // Воспроизводиться атоматически при запуске плеера
        MediaView mediaView = new MediaView(mediaPlayer);

        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: #0e2f44");
        Text title = new Text("Welcome to MP3 player");
        title.setFont(Font.font("Thoma", FontWeight.NORMAL, 20));
        title.setFill(Color.valueOf("#c6e2ff"));

        Button filesButton = new Button("Open file");
        filesButton.setMaxWidth(150);
        filesButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Создание обьекта для отрытия диалога выбора файла
                FileChooser fileChooser = new FileChooser();
                FileChooser.ExtensionFilter extFilter =
                        new FileChooser.ExtensionFilter("mp3 files (*.mp3)", "*.mp3"); // Фильтры выбора
                fileChooser.getExtensionFilters().add(extFilter); // добавляем фильтры

                File selectedDirectory = fileChooser.showOpenDialog(primaryStage);
                if(selectedDirectory != null)
                    fileLabel.setText(selectedDirectory.getPath());

                media = new Media(new File(fileLabel.getText()).toURI().toString());  // Задаем новый абсолютный URI
                mediaPlayer.stop();
                mediaPlayer = new MediaPlayer(media); // Воспроизведение выбранной песни
                mediaPlayer.setAutoPlay(true);
                mediaView.setMediaPlayer(mediaPlayer);

                String nameSong = media.getSource();
                nameSong = nameSong.substring(nameSong.lastIndexOf("/") + 1, nameSong.length()); // Извлекаем имя указаного трека
                song.setText(nameSong);
            }
        });

        // Play or pause
        Button play = new Button("Play/Pause");
        play.setMaxWidth(150);
        play.setOnAction(event -> {
            boolean playing = mediaPlayer.getStatus().equals(MediaPlayer.Status.PLAYING);
            if (playing) mediaPlayer.pause();
            else mediaPlayer.play();
        });

        song.setText("Rules.mp3");      // Название песни при запуска плеера
        song.setFont(Font.font("Thoma", FontWeight.NORMAL, 15));
        song.setFill(Color.valueOf("#c6e2ff"));

        gridPane.add(title, 0, 0);
        gridPane.add(filesButton, 0, 2);
        gridPane.add(play, 0, 1);
        gridPane.add(song, 1, 1);
        gridPane.setHgap(40);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(gridPane);
        scene.getStylesheets().add("realPlayer/styles.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("mp3 player");
        primaryStage.setHeight(HEIGHT);
        primaryStage.setWidth(WIDTH);
        primaryStage.show();
    }

}
