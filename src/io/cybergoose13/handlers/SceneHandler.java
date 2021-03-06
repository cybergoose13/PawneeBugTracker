package io.cybergoose13.handlers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

public class SceneHandler {

    private Parent root;
    private Stage stage;

    public SceneHandler(){}

    public void setScene(String fxmlFile, Window window) throws Exception{
        root= FXMLLoader.load(getClass().getResource(fxmlFile));
        stage= (Stage) window;
        System.out.println(window.getWidth() + " : " + window.getHeight() );
        stage.setScene(new Scene(root, 400, 600));
        stage.show();
    }
}
