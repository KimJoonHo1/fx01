package textfield;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		VBox main = new VBox();
		main.setPrefSize(550, 350);
		
		HBox sub = new HBox();
		sub.setPrefSize(550, 200);
		
		// ----------------------------------------------------
		
		FlowPane top = new FlowPane();
		
		Label topLab1 = new Label("홈");
		Label topLab2 = new Label("사회");
		Label topLab3 = new Label("경제");
		Label topLab4 = new Label("국제");
		Label topLab5 = new Label("문화");
		
		top.getChildren().addAll(topLab1, topLab2, topLab3, topLab4, topLab5);
		top.setHgap(20);
		top.setPadding(new Insets(10, 50, 10, 10));
		top.setAlignment(Pos.CENTER_RIGHT);
		
		top.setPrefSize(550, 100);
		main.getChildren().add(top);
		
		// ---------------------------------------------------
		
		FlowPane left = new FlowPane(Orientation.VERTICAL);
		
		Label leftLab1 = new Label("카테고리");
		Label leftLab2 = new Label("노트북/pc");
		Label leftLab3 = new Label("자동차용품");
		Label leftLab4 = new Label("휴대폰");
		Label leftLab5 = new Label("캠핑/낚시");
		
		left.getChildren().addAll(leftLab1, leftLab2, leftLab3, leftLab4, leftLab5);
		
		left.setVgap(10);
		
		sub.getChildren().add(left);
		
		// -----------------------------------------------------------
		
		FlowPane center = new FlowPane(Orientation.VERTICAL);
		center.setPrefSize(50, 150);
		
		FlowPane idPane = new FlowPane();
		
		Label id = new Label("ID");
		TextField idField = new TextField();
		
		idPane.getChildren().addAll(id, idField);
		idPane.setHgap(10);
		
		center.getChildren().add(idPane);
		
		FlowPane pwPane = new FlowPane();
		
		Label pwd = new Label("PW");
		PasswordField pwdField = new PasswordField();
		
		pwPane.getChildren().addAll(pwd, pwdField);
		pwPane.setHgap(4);
		
		center.getChildren().add(pwPane);
		
		FlowPane radio = new FlowPane();
		
		RadioButton rb1 = new RadioButton("여");
		RadioButton rb2 = new RadioButton("남");
		
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		
		rb1.setSelected(true);
		
		radio.setHgap(20);
		
		radio.getChildren().addAll(rb1, rb2);
		
		center.getChildren().add(radio);
		
		
		FlowPane checkBox = new FlowPane();
		CheckBox cb1 = new CheckBox("게임");
		CheckBox cb2 = new CheckBox("공부");
		
		checkBox.getChildren().addAll(cb1, cb2);
		
		checkBox.setHgap(8);
		
		center.getChildren().add(checkBox);
		center.setVgap(10);
		
		center.setPadding(new Insets(15, -150, 0, 10));
		
		
		sub.getChildren().add(center);
		
		// -------------------------------------------------------------
		
		FlowPane rightBox = new FlowPane(Orientation.VERTICAL);
		GridPane right = new GridPane();
		
		TextField idBox = new TextField();
		PasswordField pwBox = new PasswordField();
		
		ToggleButton tb = new ToggleButton("로그인");
		
		idBox.setPrefSize(100, 20);
		pwBox.setPrefSize(100, 20);
		tb.setPrefSize(75, 45);
		
		GridPane.setConstraints(idBox, 0, 0);
		GridPane.setConstraints(pwBox, 0, 1);
		GridPane.setConstraints(tb, 1, 0, 1, 2);
	
		right.getChildren().addAll(idBox, pwBox, tb);
		rightBox.getChildren().add(right);
		
		rightBox.setPadding(new Insets(15, 0, 0, 0));
		
		
		sub.getChildren().add(rightBox);
		

		
		// ------------
		
		sub.setPadding(new Insets(20, 0, 0, 10));
		
		VBox bottom = new VBox();
		Label bottomLab = new Label("하고 싶은 말");
		TextArea bottomArea = new TextArea();
		
		bottomArea.setPrefSize(50, 50);
		
		bottom.getChildren().addAll(bottomLab, bottomArea);
		
		bottom.setPrefSize(200, 50);
		
		
		main.getChildren().add(sub);
		
		main.getChildren().add(bottom);
		
		arg0.setScene(new Scene(main));
		arg0.setTitle("Quiz03");
		arg0.show();
	}

}
