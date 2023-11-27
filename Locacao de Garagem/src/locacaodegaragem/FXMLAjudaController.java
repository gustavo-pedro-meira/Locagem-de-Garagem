/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package locacaodegaragem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author gusta
 */
public class FXMLAjudaController implements Initializable {

    @FXML
    private Rectangle textExperiencia;
    @FXML
    private Button btnAjuda;
    @FXML
    private Label labelEnviado;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void exibirEmailEnviado(){
        labelEnviado.setText("Você receberá um email como resposta!");
    }


    
}
