package lambda;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		FlowPane hbox = new FlowPane();
		Label label1 = new Label("Search", new ImageView("/img/search.png"));
		label1.setTextFill(Color.web("3399FF"));
		label1.setFont(new Font(20));
		hbox.getChildren().add(label1);
		
		Label label2 = new Label("Values");
		label2.setRotate(270);
		label2.setFont(new Font(35));
		label2.setTranslateY(50);
		hbox.getChildren().add(label2);
		
		Label label3 = new Label("A label that needs to be wrapped");
		hbox.getChildren().add(label3);
		
		// -------------------------------------------------------------
		
		label1.setOnMouseEntered(e-> {
			label1.setTextFill(Color.web("FF0000"));
		});
		
		label1.setOnMouseExited(e-> {
			label1.setTextFill(Color.web("3399FF"));
		});
		
		
		hbox.setPrefSize(600, 300);
		hbox.setHgap(70);
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}

}
