


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */

//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	Button button1, button2,button3,button4,button5;
	Label label1;
	TextField textfield1;
	HBox hbox1,hbox2;

	
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager data1;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		
 button1 = new Button("hello");
 button2 = new Button("Howdy");
 button3 = new Button("Chinese");
 button4 = new Button("Clear");
 button5 = new Button("Exit");
 label1 = new Label("Feedback");
 textfield1 = new TextField();
 hbox1 = new HBox();
 hbox2 = new HBox();	


	
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
 		data1 = new DataManager();
		button1.setOnAction(new ButtonHandler());
		button2.setOnAction(new ButtonHandler());
		button3.setOnAction(new ButtonHandler());
		button4.setOnAction(new ButtonHandler());
		button5.setOnAction(new ButtonHandler());
		Insets inset = new Insets(10);
		HBox.setMargin(button1,inset);
		HBox.setMargin(button2,inset);
		HBox.setMargin(button3,inset);
		HBox.setMargin(button4,inset);
		HBox.setMargin(button5,inset);
		HBox.setMargin(label1,inset);
		HBox.setMargin(textfield1,inset);
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);

		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		
		hbox1.getChildren().addAll(button1,button2,button3,button4,button5);
		hbox2.getChildren().addAll( label1,textfield1);
		this.getChildren().addAll(hbox1,hbox2);
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler <ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			if (event.getTarget()==button1) {
				textfield1.setText(data1.getHello());
			}
			else if (event.getTarget()==button2) {
				textfield1.setText(data1.getHowdy());
			}
			else if (event.getTarget()==button3) {
				textfield1.setText(data1.getChinese());
			}
			else if (event.getTarget()==button4) {
				textfield1.setText(" ");
			}
			else if (event.getTarget()==button5) {
				System.exit(0);
				Platform.exit();
			}
		}
	}
}
	