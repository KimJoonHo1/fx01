package gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex02 extends Application{

	public static void main(String[] args) {
		launch(args);
		
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridPane = new GridPane();
		Button btn = new Button("Button");
		GridPane.setConstraints(btn, 0, 0);
		
		Label label = new Label("Label");
		GridPane.setConstraints(label, 1, 1);
		
		gridPane.getChildren().addAll(btn, label);
		Button bu = new Button("1, 0");
		gridPane.add(bu, 1, 0);
		gridPane.add(new Label("0, 1"), 0, 1);
		
		gridPane.setPadding(new Insets(20)); // 위, 오, 아, 왼 모두 20
		gridPane.setHgap(90);
		gridPane.setVgap(10);
		
		arg0.setScene(new Scene(gridPane, 500, 300));
		
		FlowPane flowPane = new FlowPane();
		flowPane.getChildren().add(new Button("merge col(0), row(2)"));
		flowPane.setStyle("-fx-background-color:black;"); // 색상 조정
		flowPane.setAlignment(Pos.CENTER);
		gridPane.add(flowPane, 0, 2, 2, 1);
		
		arg0.show();
	}

}
