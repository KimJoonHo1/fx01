package textfield;


import java.awt.TextField;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		javafx.scene.control.TextField tf = new javafx.scene.control.TextField();
		tf.setText("test");
		
		hbox.setPadding(new Insets(20));
		
		PasswordField pf = new PasswordField();
		pf.setText("abcd1234");
		
		ComboBox<String> cb = new ComboBox<>();
		cb.getItems().addAll("공부", "놀기", "멍타기");
		cb.setValue("공부");
		
		TextArea ta = new TextArea();
		ta.setPrefSize(150, 25);
		
		DatePicker dp = new DatePicker();
		
		
		hbox.getChildren().addAll(tf, pf, cb, ta, dp);
		hbox.setPrefSize(1000, 200);

		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}

}
