package com.example.demo6;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private MediaView mediaView;
    @FXML
    private ProgressBar progressBar;
    Duration startedTime;

    public void start() {
        MediaPlayer mediaPlayer = mediaView.getMediaPlayer();
        mediaPlayer.play();
        startedTime = mediaPlayer.getCurrentTime();
    }

    public void pause() {
        mediaView.getMediaPlayer().pause();
    }

    public void reset() {
        MediaPlayer mediaPlayer = mediaView.getMediaPlayer();
        mediaPlayer.seek(Duration.ZERO);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("src/main/resources/videos/test.MP4");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);

    }
}