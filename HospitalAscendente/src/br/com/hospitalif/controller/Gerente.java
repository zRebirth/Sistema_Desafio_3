package br.com.hospitalif.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Gerente {

    @FXML
    private Label labelNomeGerente;

    @FXML
    private JFXTextField txtCargo;

    @FXML
    private JFXTextField txtID;

    @FXML
    private JFXComboBox<?> cboDepartamento;

    @FXML
    private JFXButton btnValidar;

    @FXML
    private JFXButton btnAvancar;

    @FXML
    void Avancar(ActionEvent event) {
    	String id = txtID.getText();
    	String cargo = txtCargo.getText();
    	String departamento = cboDepartamento.getPromptText();
    	

    }

    @FXML
    void Validar(ActionEvent event) {
    	String id = txtID.getText();

    }

}
