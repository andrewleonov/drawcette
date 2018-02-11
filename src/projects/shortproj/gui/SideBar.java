package projects.shortproj.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import projects.shortproj.util.Context;

public final class SideBar extends VBox {
	
	final ToggleGroup group1;
	Context context;
	
	public SideBar(Context context) {
		this.context = context;
		
        this.setPadding(new Insets(5, 25, 15, 15));
        this.setSpacing(10);
        this.setStyle("-fx-background-color: #336699;");

        // Tool Group 1
        group1 = new ToggleGroup();

        Label toolsLabel1 = new Label("Brushes");
        toolsLabel1.setTextFill(Color.WHITE);
        
        ToggleButton tool1 = new ToggleButton("Brush 1");
        tool1.setToggleGroup(group1);
        tool1.setPrefSize(60, 25);
        tool1.setUserData("brush1");
        tool1.setOnAction(getContextClear());

        ToggleButton tool2 = new ToggleButton("Brush 2");
        tool2.setToggleGroup(group1);
        tool2.setPrefSize(60, 25);
        tool2.setUserData("brush2");
        tool2.setOnAction(getContextClear());
        
        ToggleButton tool3 = new ToggleButton("Brush 3");
        tool3.setToggleGroup(group1);
        tool3.setPrefSize(60, 25);
        tool3.setUserData("brush3");
        tool3.setOnAction(getContextClear());

        Label toolsLabel2 = new Label("Shapes");
        toolsLabel2.setTextFill(Color.WHITE);
        
        ToggleButton tool4 = new ToggleButton("Line");
        tool4.setToggleGroup(group1);
        tool4.setSelected(true);
        tool4.setPrefSize(60, 25);
        tool4.setUserData("line");
        tool4.setOnAction(getContextClear());

        ToggleButton tool5 = new ToggleButton("Square");
        tool5.setToggleGroup(group1);
        tool5.setPrefSize(60, 25);
        tool5.setUserData("square");
        tool5.setOnAction(getContextClear());

        ToggleButton tool6 = new ToggleButton("Circle");
        tool6.setToggleGroup(group1);
        tool6.setPrefSize(60, 25);
        tool6.setUserData("circle");
        tool6.setOnAction(getContextClear());
        
        Label toolsLabel3 = new Label("Manipulate");
        toolsLabel3.setTextFill(Color.WHITE);
        
        ToggleButton tool7 = new ToggleButton("Drag");
        tool7.setToggleGroup(group1);
        tool7.setPrefSize(60, 25);
        tool7.setUserData("drag");
        tool7.setOnAction(getContextClear());
        
        ToggleButton tool8 = new ToggleButton("New Group");
        tool8.setToggleGroup(group1);
        tool8.setPrefSize(60, 25);
        tool8.setUserData("group");
        tool8.setOnAction(getContextClear());
        
        // Add all elements to the toolbar
        this.getChildren().addAll(toolsLabel1, tool1, tool2, tool3, 
        		toolsLabel2, tool4, tool5, tool6, toolsLabel3, tool7, 
        		tool8);
        
	}
	
	// Returns the string associated with the depressed button of group 1.
	public String getDepressedButtonGroup1() {
		return (String) group1.getSelectedToggle().getUserData();
	}
	
	private EventHandler<ActionEvent> getContextClear() {
		return new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				context.resetLastClick();
			}
		};
	}
}
