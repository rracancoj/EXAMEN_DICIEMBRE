package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class LogInController implements Initializable {

	@FXML
	public ImageView imageRotation;

	@FXML
	public Pane secondPane;

	@FXML
	public Pane thirdPane;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		rotateAnimation();
		translateAnimation(0.1,secondPane,600);
		translateAnimation(0.1,thirdPane,600);

	}

	public void translateAnimation(double duracion,Node node, int distancia){
		TranslateTransition translate = new TranslateTransition(Duration.seconds(duracion),node);
		translate.setByY(distancia);
		translate.play();
	}

	@FXML
	public void openSecondView(){
		translateAnimation(0.7,secondPane,-600);
	}

	@FXML
	public void closeSecondView(){
		translateAnimation(0.7,secondPane,600);
	}

	@FXML
	public void openThirdView(){
		translateAnimation(0.7,thirdPane,-600);
	}

	@FXML
	public void closeThirdView(){
		translateAnimation(0.7,thirdPane,600);
	}

	public void rotateAnimation(){
		RotateTransition rotacion = new RotateTransition(Duration.seconds(35),imageRotation);
		rotacion.setByAngle(360*11);
		rotacion.play();
	}

}
