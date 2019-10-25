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
    double x ,y ,Result;
    char ch ;
      // First Number
      TextField txtf1 = new TextField();
      // 2and number
      TextField txtf2 = new TextField();
      // Label of Result
      Label label3 = new Label();
      // Label of Result Caption
      Label label2 = new Label();

      @Override
    public void start(Stage primaryStage) {
        //for Calculation Mark
        Label label1 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();
        label1.setText("  ");   
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
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        btn1.setText("+");
        btn2.setText("-");
        btn3.setText("*");
        btn4.setText("/");
        btn5.setText("=");
        
        
         //add   
        btn1.setOnAction(e->{
          
            if(!txtf1.getText().isEmpty() ){  
                label1.setText(" + ");  
         x=Integer.parseInt(txtf1.getText());
         ch ='+';
            }
        });
         
        
        //subtract   
        btn2.setOnAction(e->{
            
            if(!txtf1.getText().isEmpty()){
                label1.setText(" - ");  
         x=Integer.parseInt(txtf1.getText());
        ch ='-';
            }
        });
        
        // The Multiplication button
        btn3.setOnAction(e ->{
             
            if(!txtf1.getText().isEmpty() ){
             label1.setText(" * "); 
            x=Integer.parseInt(txtf1.getText());
           ch='*';
            }
        });
        
           // The Division function
        btn4.setOnAction(e ->{
              
            if(!txtf1.getText().isEmpty()){
                label1.setText(" / ");
            x=Integer.parseInt(txtf1.getText());
            ch='/';
            }
        });
        // The result
        btn5.setOnAction(e ->{
            if (!txtf2.getText().isEmpty() ){
                y=Integer.parseInt(txtf2.getText());;
        switch(ch){
            case '+' :
                    Result=x+y;
                    break ;
            case '-' :
                    Result=x-y;
                    break ;
            case '*' :
                    Result=x*y;
                    break ;
                    
            case '/' :
                    Result=x/y;
                    break ;
         
        }         
        label2.setText(""+ Result);
            
            }});
        
        pane.getChildren().addAll(btn1,btn2,btn3 ,btn4 ,btn5); 
        label3.setText("   The Result of Calculation is    :   ");
        
        pane.getChildren().addAll(label3,label2); 
        Scene scene = new Scene(pane, 500, 300);
        
        primaryStage.setTitle("CALCULATOR");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
