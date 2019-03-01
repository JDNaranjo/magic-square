package ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import model.*;

public class MagicSquareController {

    @FXML
    private TextField sizeTxt;

    @FXML
    private MenuButton startPosition;

    @FXML
    private MenuButton orientation;

    @FXML
    private Button clearButton;

    @FXML
    private Button createButton;

    @FXML
    private ScrollPane instructionPane;

    @FXML
    private GridPane gridPane;

    @FXML
    private ScrollPane scrollPane;

    
    private MagicSquare mg;

    @FXML
    void clearSquare(ActionEvent event) {

    }

    @FXML
    void createSquare(ActionEvent event) {
    	
    	instructionPane.setVisible(false);
    	scrollPane.setVisible(true);
    	int size = Integer.parseInt(sizeTxt.getText());
    	
    	String startN = startPosition.getText();
    	String orderN = orientation.getText();
    	
    	
    	MagicSquare mg = new MagicSquare(size, startN, orderN);
    	
    	int[][] matrix = new int[size][size];
    	matrix = mg.createTop(size);
    	
    	for(int i=0; i<matrix.length; i++) {
    		for(int j=0; j<matrix[0].length; j++) {
    			gridPane.add(new Button(""+matrix[i][j]), i, j);
    		}
    	}
    	
    }

}
