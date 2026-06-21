package view;

import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {
    static MainView mainview;
    private MainView(){

    }
    public static MainView getInstance(){
        if(mainview==null)
            mainview=new MainView();
        return mainview;
    }
}
