package SysPatrimonio;

import javafx.fxml.FXML;
import SysPatrimonio.Cadastro.CadastraBem;

public class Controller {
    public Controller() {
    }

    @FXML
    private void cadastraBem() throws Exception {
        CadastraBem cadastro = new CadastraBem();
        cadastro.start();
    }

    @FXML
    private void deletaBem() {
    }

    @FXML
    private void cadastraCategoria() {
    }

    @FXML
    private void deletaCategoria() {
    }

    @FXML
    private void cadastraLocal() {
    }

    @FXML
    private void deletaLocal() {
    }

    @FXML
    private void listaBem() {
    }

    @FXML
    private void listaCategoria() {
    }

    @FXML
    private void listaLocal() {
    }

    @FXML
    private void relatorioGeral() {
    }
}
