package main.match;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXSpinner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.security.PrivateKey;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import VIEW.Main;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import logic.*;
import utils.Modal;


public class MatchResultController implements Initializable{
    private Main application;
    private Person left;
    private Person right;
    private MatchResultMap matchResultMap = new MatchResultMap();

    @FXML
    private Text manNameText;
    @FXML
    private Text womanNameText;
    @FXML
    private Text resultPercentText;
    @FXML
    private Text manConstellationText;
    @FXML
    private Text womanConstellationText;
    @FXML
    private Text resultText;
    public void setApp(Main application, Person left, Person right) {
        this.application = application;
        this.left = left;
        this.right = right;
        MatchResult matchResult = matchResultMap.getMatchResult(left.getPersonConstellation(), right.getPersonConstellation());
        if (left.getPersonSex() == 1){   //左男右女
            manNameText.setText(left.getPersonName());
            womanNameText.setText(right.getPersonName());
            resultPercentText.setText(matchResult.getPercentManAndWoman()+"%");
            manConstellationText.setText(matchResult.getConstellationOne());
            womanConstellationText.setText(matchResult.getConstellationTwo());
            resultText.setText(matchResult.getDescManAndWoman());

        } else {   //左女右男
            manNameText.setText(right.getPersonName());
            womanNameText.setText(left.getPersonName());
            resultPercentText.setText(matchResult.getPercentWomanAndMan()+"%");
            manConstellationText.setText(matchResult.getConstellationTwo());
            womanConstellationText.setText(matchResult.getConstellationOne());
            resultText.setText(matchResult.getDescWomanAndMan());

        }
    }
    @FXML
    public void onShareClick() {
        application.doShare();
    }
    @FXML
    public void onAgainClick() {
        application.goToMatchView();
    }
    @FXML
    public void onGoToIndexViewClick() {
        application.goToIndexView();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        //TODO
    }
}
