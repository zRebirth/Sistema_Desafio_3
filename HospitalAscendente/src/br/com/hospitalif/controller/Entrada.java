package br.com.hospitalif.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Entrada {

    @FXML
    private JFXDatePicker tctDataEntrada;

    @FXML
    private JFXDatePicker tctDataSaida;

    @FXML
    private JFXTextArea txtObservacao1;

    @FXML
    private JFXTextArea txtObservacao2;

    @FXML
    private JFXComboBox<?> cboStatus;

    @FXML
    private JFXButton btnInserir;

    @FXML
    void Inserir(ActionEvent event) {
    	String dataEntrada = tctDataEntrada.getPromptText();
    	String datasaida = tctDataSaida.getPromptText();
    	String observacao1 = txtObservacao1.getPromptText();
    	String observacao2 = txtObservacao2.getPromptText();
    	String status = cboStatus.getPromptText();
    	   	
    	

    }

}
