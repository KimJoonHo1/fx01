package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex03 extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		ToggleButton tb1 = new ToggleButton("내용", new ImageView("/img/magi.png"));
		
		ToggleButton tb2 = new ToggleButton();
		tb2.setGraphic(new ImageView("/img/magi.png"));
		
		hbox.getChildren().addAll(tb1, tb2);
		hbox.setPrefSize(300, 200);
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}

}
