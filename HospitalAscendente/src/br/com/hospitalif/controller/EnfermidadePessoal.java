package br.com.hospitalif.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class EnfermidadePessoal {

    @FXML
    private JFXTextField txtEnfermidade;

    @FXML
    private JFXTextArea txtComentario;

    @FXML
    private JFXComboBox<?> cboStatus;

    @FXML
    private JFXButton btnAvancar;

    @FXML
    void Avancar(ActionEvent event) {

    }

}
