package gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex01 extends Application{
	public static void main(String[] args) {
		launch(args);
		
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// 그리드팬 : 배열하고 비슷한 형식
		GridPane gridPane = new GridPane(); // 그리드 팬 생성
		Button btn = new Button("Button");
		GridPane.setConstraints(btn, 0, 0); // 가로, 세로
		
		Label label = new Label("Label");
		Label label02 = new Label("Label02");
		
		// 그리드팬에서 해당하는 영역에 버튼이나 라벨을 올림
		GridPane.setConstraints(label, 1, 1); // 가로, 세로
		GridPane.setConstraints(label02, 0, 1); // 가로, 세로
		
		gridPane.getChildren().addAll(btn, label, label02);
		
		arg0.setScene(new Scene(gridPane, 300, 100)); // 그리드팬을 스테이지에 적용
		arg0.show();
	}

}
