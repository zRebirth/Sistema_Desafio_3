package br.com.hospitalif.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Medico {

    @FXML
    private Label labelNomeMedico;

    @FXML
    private Label labelIDMedico;

    @FXML
    private JFXTextField txtCRM;

    @FXML
    private JFXComboBox<?> cboEspecialidade;

    @FXML
    private JFXButton btnAvancar;

    @FXML
    void Avancar(ActionEvent event) {
    	String nomeMedico = labelNomeMedico.getText();
    	String idMedico = labelIDMedico.getText();
    	String crm = txtCRM.getText();
    	ObservableList<?> especialidade = cboEspecialidade.getItems();

    }

}
