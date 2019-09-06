package br.com.hospitalif.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class Atendimento {

    @FXML
    private ComboBox<?> cboComentarioEnfermeiro;

    @FXML
    private ComboBox<?> cboComentarioMedico;

    @FXML
    private TextField txtCodigoEnfermidade;

    @FXML
    private DatePicker tctData;

    @FXML
    private Spinner<?> sknPeso;

    @FXML
    private Spinner<?> sknAltura;

}
