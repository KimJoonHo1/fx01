package hbox_vbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(); // 가로 정령
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		
		VBox vbox = new VBox(); // 세로 정렬
		Label la1 = new Label("la1");
		Label la2 = new Label("la2");
		Label la3 = new Label("la3");
		vbox.getChildren().addAll(la1, la2, la3);
		vbox.setSpacing(20);
		
		hbox.getChildren().addAll(btn1, btn2, btn3, vbox);
		hbox.setSpacing(20);
		
		arg0.setScene(new Scene(hbox, 300, 300));
		arg0.show();
	}

}
