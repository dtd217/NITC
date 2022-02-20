package org.nitc.Snake2;

import javafx.application.Application;
import java.io.IOException;
import java.io.InputStream;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Scene scene;

	@Override
    public void start(Stage stage) throws IOException {
		stage.setTitle("Snake game");
		stage.getIcons().add(new Image("https://cdn2.iconfinder.com/data/icons/animals-nature-2/50/1F40D-snake-512.png"));
        Scene scene = new Scene(loadFXML("layout"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}