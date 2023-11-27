/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package locacaodegaragem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author gusta
 */
public class FXMLMenuController1 implements Initializable {

    @FXML
    private Button btnBuscar;
    @FXML
    private Button btnComentar;
    @FXML
    private Button btnContatoAjuda;
    @FXML
    private Button btnTelaRegistraVeiculo;
    
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void telaBuscar() throws IOException {
        Stage primaryStage = (Stage) btnBuscar.getScene().getWindow();
        primaryStage.close();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("buscar.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    @FXML
    public void telaComentar() throws IOException{
        Stage primaryStage = (Stage) btnComentar.getScene().getWindow();
        primaryStage.close();
        Stage stage = new Stage();
        Parent telaComentar = FXMLLoader.load(getClass().getResource("comentar.fxml"));
        stage.setScene(new Scene(telaComentar));
        stage.show();
    }
    
    @FXML
    public void telaContato() throws IOException {
        Stage primaryStage = (Stage) btnContatoAjuda.getScene().getWindow();
        primaryStage.close();
        Stage stage = new Stage();
        Parent telaAjuda = FXMLLoader.load(getClass().getResource("ajuda.fxml"));
        stage.setScene(new Scene(telaAjuda));
        stage.show();
    }
    
    @FXML
    public void telaRegistrar() throws IOException {
        Stage primaryStage = (Stage) btnTelaRegistraVeiculo.getScene().getWindow();
        primaryStage.close();
        Stage stage = new Stage();
        Parent telaRegistra = FXMLLoader.load(getClass().getResource("Registrar.fxml"));
        stage.setScene(new Scene(telaRegistra));
        stage.show();
    }
    
}
