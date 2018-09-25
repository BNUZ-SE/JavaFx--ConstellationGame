package index;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import VIEW.Main;

public class IndexViewController implements Initializable {

    private Main application;
    public void setApp(Main application) { this.application = application; }


    @FXML
    public void ON_MATCH_CLICK() {
        application.goToMatchView();
    }

    @FXML
    public void ON_QUERY_CLICK() {
        application.goToQueryView();
    }




    @Override
    public void initialize(URL url, ResourceBundle rb){
        //TODO
    }
}
