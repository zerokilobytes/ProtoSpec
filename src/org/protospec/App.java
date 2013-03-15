package org.protospec;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.DepthTest;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import protospect.controls.WindowResizeButton;

public class App extends Application {

     private BorderPane root;
    private WindowResizeButton windowResizeButton;
    private Scene scene;

    public static void main(String[] args) {
        Application.launch(App.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane layerPane = new StackPane();

        stage.initStyle(StageStyle.UNDECORATED);
        windowResizeButton = new WindowResizeButton(stage, 1020, 700);
        // create root
        root = new BorderPane() {
            @Override
            protected void layoutChildren() {
                super.layoutChildren();
                windowResizeButton.autosize();
                windowResizeButton.setLayoutX(getWidth() - windowResizeButton.getLayoutBounds().getWidth());
                windowResizeButton.setLayoutY(getHeight() - windowResizeButton.getLayoutBounds().getHeight());
            }
        };
        
        root.getStyleClass().add("application");

        root.setId("root");
        layerPane.setDepthTest(DepthTest.DISABLE);
        layerPane.getChildren().add(root);

        windowResizeButton.setManaged(false);
        this.root.getChildren().add(windowResizeButton);
        
        scene = new Scene(layerPane, 1020, 700, false);
        scene.getStylesheets().add(App.class.getResource("protospec.css").toExternalForm());

         stage.setScene(scene);
        stage.show();



        /*stage.setTitle("Protocol Inspector");
         root = FXMLLoader.load(getClass().getResource("protospec.fxml"));
         root.setId("root");

         stage.setScene(new Scene(root, 1020, 700));
         stage.show();*/
    }
}
