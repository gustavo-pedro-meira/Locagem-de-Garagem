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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author gusta
 */
public class FXMLRegistrarVeiculoController implements Initializable {

    @FXML
    private ChoiceBox<String> cbVeiculo;
    private String[] veiculos = {"Carro","Moto","Bicicleta","Caminhão"};
    
    


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbVeiculo.getItems().addAll(veiculos);
    }    
}
