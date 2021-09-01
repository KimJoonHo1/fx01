package label;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex03 extends Application{
	static int i=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		
		Label label = new Label("A label that needs to be wraaped");
		hbox.getChildren().add(label);
		hbox.setPrefSize(100, 100);
		
		label.setWrapText(true);
		label.setFont(new Font(20));
		label.setRotate(48);
		label.setTranslateY(50);
		
		
		
		label.setOnMouseClicked(e->{
			if(i == 0) {
				label.setRotate(0);
				label.setTranslateY(0);
				i = 1;
			} else {
				label.setRotate(45);
				label.setTranslateY(50);
				i = 0;
			}
			
		});
		
		
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}

}
