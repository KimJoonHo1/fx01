package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{
	public static void main(String[] args) {
		launch(args); // start 메소드 실행
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// arg0 : 스테이지
		Label lb = new Label("Hello World !!"); // 라벨(텍스트) 생성
		lb.setFont(new Font(20)); // 폰트 설정
		
		Scene scene = new Scene(lb, 200, 100); // 씬 생성하고 미리 생성한 라벨 적용
		arg0.setScene(scene); // 스테이지에 장판 적용
		
		arg0.setTitle("연습중"); // 타이틀 지정
		arg0.show(); // 화면을 보여줌
	}
	
	
}
