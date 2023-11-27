/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package locacaodegaragem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

/**
 * FXML Controller class
 *
 * @author gusta
 */
public class FXMLRegistrarVeiculoController1 implements Initializable {

    @FXML
    private ChoiceBox<String> cbTipoVeiculo;
    private String[] veiculos = {"Carro","Moto","Caminhão","Bicicleta"};

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbTipoVeiculo.getItems().addAll(veiculos);
    }    
    
}
