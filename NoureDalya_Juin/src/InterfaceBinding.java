/*
*Author: noure-d-zobiri
*Date: May 31, 2021
*Description:
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class InterfaceBinding extends Application {

	@Override
	public void start(Stage primaryStage) {
		Group groupe = new Group();
		Scene scene = new Scene(groupe,400,400);
		
//Les nouveau TextFields est ou ils se trouveraient
		
		TextField txt1=new TextField();
		txt1.setLayoutX(20);
		txt1.setLayoutY(60); // Le premier nombre a additioner
		
		TextField txt2=new TextField();
		txt2.setLayoutX(20);
		txt2.setLayoutY(40); // Le deuxieme nombre a additioner

// Les nouveau Labels et ou ils se trouveraient
		
		Label Label1=new Label();
		Label1.setLayoutX(20);
		Label1.setLayoutY(70); // Va demontrer le premier nombre
		
		Label Label2=new Label();
		Label2.setLayoutX(25);
		Label2.setLayoutY(70); // Va demontrer le sign d'addition
		
		Label Label3=new Label();
		Label3.setLayoutX(30);
		Label3.setLayoutY(70); //Va demontrer le deuxieme nombre
		
		Label Label4=new Label();
		Label4.setLayoutX(35);
		Label4.setLayoutY(70); //Va demontrer le sign =
		
		Label Label5=new Label();
		Label5.setLayoutX(40);
		Label5.setLayoutY(70); // Le reultat de l'addition

// Print dans les labels qui non pas besoin de calculs:
Label1.setText(txt1.getText());
Label2.setText("+");
Label3.setText(txt2.getText());
Label4.setText("=");

// Addition

		int nombre1=0,nombre2=0,resultat=0;
		nombre1=Integer.parseInt(txt1.getText());
		nombre2=Integer.parseInt(txt2.getText());
		resultat=nombre1+nombre2;
		
		
		

		groupe.getChildren().add(txt1);
		groupe.getChildren().add(txt2);
		groupe.getChildren().add(Label1);
		groupe.getChildren().add(Label2);
		groupe.getChildren().add(Label3);
		groupe.getChildren().add(Label4);
		groupe.getChildren().add(Label5);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
