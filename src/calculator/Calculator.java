/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author El sayed
 */
public class Calculator extends Application {
      // First Number
      TextField txtf1 = new TextField();
      // 2and number
      TextField txtf2 = new TextField();
      // Label of Result
      Label label2 = new Label();
      // Label of Result Caption
      Label label3 = new Label();

      @Override
    public void start(Stage primaryStage) {
        //for Calculation Mark
        Label label1 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();
        label1.setText(" + ");   
        label4.setText(" X : ");
        label5.setText(" Y : ");
        FlowPane pane = new FlowPane();
//     set padding        
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(50);
        pane.setVgap(30);
 
        // TextField Width
        txtf1.setPrefColumnCount(8);
        txtf2.setPrefColumnCount(8);
        
        pane.getChildren().addAll(label4,txtf1,label1,label5,txtf2);
       
        Scene scene = new Scene(pane, 500, 310);
        
        primaryStage.setTitle("CALCULATOR");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
