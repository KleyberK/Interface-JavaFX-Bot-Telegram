package SysPatrimonio.Cadastro;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CadastraBem {
    @FXML
    public javafx.scene.control.TextField fieldNome;
    @FXML
    public javafx.scene.control.TextField fieldDescricao;
    @FXML
    public javafx.scene.control.TextField fieldCategoria;
    @FXML
    public javafx.scene.control.TextField fieldLocal;
    @FXML
    private javafx.scene.control.Button OKButton;
    @FXML
    private javafx.scene.control.Button CancelButton;

    Stage primaryStage = new Stage();

    public void start() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("cadastraBem.fxml"));
        primaryStage.setTitle("Cadastrar Bem");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    protected void OKclique(){
        Stage stage = (Stage) OKButton.getScene().getWindow();
        fieldNome.getText();
        fieldDescricao.getText();
        fieldCategoria.getText();
        fieldLocal.getText();
        System.out.println(fieldNome.getText());
        System.out.println(fieldDescricao.getText());
        System.out.println(fieldCategoria.getText());
        System.out.println(fieldLocal.getText());
        stage.close();
    }

    @FXML
    protected void Cancelclique(){
        Stage stages = (Stage) CancelButton.getScene().getWindow();
        stages.close();
    }

}
