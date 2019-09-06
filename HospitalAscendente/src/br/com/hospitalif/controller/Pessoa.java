package br.com.hospitalif.controller;

import java.time.chrono.Chronology;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;


public class Pessoa {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCPF;

    @FXML
    private TextField txtRG;

    @FXML
    private DatePicker dateDataNascimento;

    @FXML
    private TextField txtNaturalidade;

    @FXML
    private TextField txtUF;

    @FXML
    private ChoiceBox<?> cboEstadoCivil;

    @FXML
    private ChoiceBox<?> cboSexo;

    @FXML
    private TextField txtNomeMae;

    @FXML
    private TextField txtNomePai;

    @FXML
    private Button btnFinalizarCadastro;

    @FXML
    private ChoiceBox<?> cboTipoSanguineo;

    @FXML
    void FinalizarCadastro(ActionEvent event) {
    	String nome = txtNome.getText();
    	String CPF = txtCPF.getText();
    	String RG = txtRG.getText();
    	Chronology DataNascimento = dateDataNascimento.getChronology();
    	String Naturalidade = txtNaturalidade.getText();
    	String UF = txtUF.getText();
    	StringConverter<?> EstadoCivil = cboEstadoCivil.getConverter();
    	StringConverter<?> sexo = cboSexo.getConverter();
    	String NomeMae = txtNomeMae.getText();
    	String NomePai = txtNomePai.getText();
    	StringConverter<?> TipoSanguineo = cboTipoSanguineo.getConverter();
    	   	

    }

}
