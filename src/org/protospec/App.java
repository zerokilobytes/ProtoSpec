package org.protospec;

import javafx.application.Application;
import javafx.scene.DepthTest;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import protospect.controls.WindowResizeButton;

public class App extends Application {

    private Group root;
    //private WindowResizeButton windowResizeButton;
    private Scene scene;

    public static void main(String[] args) {
        Application.launch(App.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create root
        root = new Group();
        root.setId("root");

        setMenu(stage);
        scene = new Scene(root, 600, 600, false);
        scene.getStylesheets().add(App.class.getResource("protospec.css").toExternalForm());

        stage.setScene(scene);
        stage.show();
    }

    private void setMenu(Stage stage) {
        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(stage.widthProperty());
        root.getChildren().add(menuBar);

        // File menu - new, save, exit
        Menu menu = new Menu("File");
        menu.getItems().add(new MenuItem("New"));
        menu.getItems().add(new MenuItem("Save"));
        menu.getItems().add(new SeparatorMenuItem());
        menu.getItems().add(new MenuItem("Exit"));

        menuBar.getMenus().add(menu);
    }
}
