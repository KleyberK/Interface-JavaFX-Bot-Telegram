package SysPatrimonio.Cadastro;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class CadastraBem {
    public javafx.scene.control.TextField fieldNome;
    public javafx.scene.control.TextField fieldDescricao;
    public javafx.scene.control.TextField fieldCategoria;
    public javafx.scene.control.TextField fieldLocal;

    public void start() throws Exception {
        Stage primaryStage = new Stage();
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("cadastraBem.fxml"));
        primaryStage.setTitle("Cadastrar Bem");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        JButton OKButton = new JButton();

        if(OKButton.isSelected()){
            fieldNome.getText();
            fieldDescricao.getText();
            fieldCategoria.getText();
            fieldLocal.getText();
            System.out.println(fieldNome);
            System.out.println(fieldDescricao);
            System.out.println(fieldCategoria);
            System.out.println(fieldLocal);
        }
    }

}
