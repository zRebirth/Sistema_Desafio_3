package br.com.hospitalif.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;

public class Paciente {

    @FXML
    private JFXTextField txtCodigoPaciente;

    @FXML
    private JFXTextField txtEnfermidade;

    @FXML
    private JFXDatePicker tctEntrada;

    @FXML
    private JFXTimePicker txtHorario;

    @FXML
    private JFXButton btnAvancar;

    @FXML
    void Avancar(ActionEvent event) {
    	String codigoPaciente = txtCodigoPaciente.getText();
    	String enfermidade = txtEnfermidade.getText();
    	Paint entrada = tctEntrada.getDefaultColor();
    	StackPane horario = txtHorario.getDialogParent();
    	

    }

}
