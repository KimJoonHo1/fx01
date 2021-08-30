package flowpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		FlowPane flowPane = new FlowPane(); // flowPane 생성 Pane은 컨테이너와 비슷한 용도임
		Button btn01 = new Button("버튼01"); // 버튼 생성
		Button btn02 = new Button("버튼02");
		Button btn03 = new Button("버튼03");
		
		flowPane.getChildren().add(btn01); // flowPane에 버튼 적용
		flowPane.getChildren().add(btn02);
		flowPane.getChildren().add(btn03);
		
		Scene scene = new Scene(flowPane, 200, 100); // scene을 생성해서 flowPane 적용
		
		arg0.setScene(scene); // 생성한 scene을 스테이지에 적용
		
		
		arg0.show();
	}
}
