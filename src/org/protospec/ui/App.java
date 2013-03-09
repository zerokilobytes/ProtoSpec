/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.protospec.ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author SNOW
 */
public class App extends Application {
    Parent root;
    @Override
    public void start(Stage stage) {
        stage.setTitle("Protocol Inspector");
        try {
            root = FXMLLoader.load(getClass().getResource("view/protospec.fxml"));
            root.setId("root");

         stage.setScene(new Scene(root, 1020, 700));
         stage.show();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
