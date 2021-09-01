package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		Button bTop = new Button("Top");
		Button bCenter = new Button("Center");
		Button bBottom = new Button("Bottom");
		Button bLeft = new Button("Left");
		Button bRight = new Button("Right");
		
		BorderPane dp = new BorderPane();
		
		dp.setTop(bTop);
		dp.setCenter(bCenter);
		dp.setBottom(bBottom);
		dp.setLeft(bLeft);
		dp.setRight(bRight);
		
		arg0.setScene(new Scene(dp, 300, 100));
		
		bTop.setPrefSize(300, 20);
		
		arg0.setResizable(false);
		
		arg0.show();	
	}
}
