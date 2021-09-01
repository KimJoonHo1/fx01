package lambda;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex04 extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane anch = new AnchorPane();
		Label label = new Label("Value");
		label.setFont(new Font(32));
		
		label.setRotate(48);
		label.setTranslateX(100);
		label.setTranslateY(70);
		
		EventHandler<MouseEvent> entered = new EventHandler<>() {
			public void handle(MouseEvent arg0) {
				label.setScaleX(1.5);
				label.setScaleY(1.5);
			}
		};
		
		label.setOnMouseEntered(entered);
		
		label.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
				label.setScaleX(1.0);
				label.setScaleY(1.0);
			}
		});
		
		label.setOnMousePressed(e-> {
			label.setRotate(0);
		});
		
		anch.getChildren().add(label);
		anch.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(anch));
		arg0.show();	
	}

}
