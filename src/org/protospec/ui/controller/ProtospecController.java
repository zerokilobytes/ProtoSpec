/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.protospec.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SNOW
 */
public class ProtospecController implements Initializable {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    void test(ActionEvent event) 
    {
        JOptionPane.showMessageDialog(null, "", "InfoBox: " + location, JOptionPane.INFORMATION_MESSAGE);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
