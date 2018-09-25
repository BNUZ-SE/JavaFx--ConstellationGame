package main.match;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXSpinner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import VIEW.Main;
import javafx.scene.control.*;
import logic.Constellation;
import logic.ConstellationMap;
import logic.Person;
import utils.Modal;
public class MatchViewController  implements Initializable {

    private Main application;
    public TextField inputNameLeft;
    public TextField inputNameRight;
    public JFXSpinner resultSpinner;
    public JFXComboBox<Label> constellationComboBoxLeft = new JFXComboBox<Label>();
    public JFXComboBox<Label> constellationComboBoxRight = new JFXComboBox<Label>();
    public DatePicker matchDateLeft;
    public DatePicker matchDateRight;
    public ToggleGroup sexual;
    public RadioButton radioButtonLeft;
    public ToggleGroup sexual1;
    public RadioButton radioButtonRight;
    private ConstellationMap constellationMap = new ConstellationMap();
    private Person personLeft = new Person();
    private Person personRight = new Person();
    private String [] constellationList = {"白羊座", "金牛座", "双子座", "巨蟹座", "狮子座",
            "处女座", "天秤座", "天蝎座", " 射手座", "摩羯座", "水瓶座", "双鱼座" };
    public void setApp(Main application) {
        this.application = application;
        resultSpinner.setVisible(false);
        for (String constellation : constellationList) {
            constellationComboBoxLeft.getItems().add(new Label(constellation));
            constellationComboBoxRight.getItems().add(new Label(constellation));
        }
        constellationComboBoxLeft.setPromptText("请选择星座");
        constellationComboBoxRight.setPromptText("请选择星座");
    }

    @FXML
    public void onGoToIndexViewClick() {
        application.goToIndexView();
    }
    @FXML
    public void onChangeDateLeft() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String time = df.format(matchDateLeft.getValue());
        if(time.length()!=0) {
            Constellation result = constellationMap.getCorrectConstellation(time);
            personLeft.setConstellation(result.getConstellationName());
            constellationComboBoxLeft.setPromptText(result.getConstellationName());
        }
    }
    @FXML
    public void onChangeDateRight() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String time = df.format(matchDateRight.getValue());
        if(time.length()!=0){
            Constellation result = constellationMap.getCorrectConstellation(time);
            personRight.setConstellation(result.getConstellationName());
            constellationComboBoxRight.setPromptText(result.getConstellationName());

        }
    }

    @FXML
    public void onConstellationChangeLeft() {
        constellationComboBoxLeft.setPromptText(constellationComboBoxLeft.getValue().getText());
        personLeft.setConstellation(constellationComboBoxLeft.getValue().getText());
    }

    @FXML
    public void onConstellationChangeRight(){
        constellationComboBoxRight.setPromptText(constellationComboBoxRight.getValue().getText());
        personLeft.setConstellation(constellationComboBoxRight.getValue().getText());
    }

    @FXML
    public void handleMatchClick() {
        if(constellationComboBoxLeft.getPromptText().equals("请选择星座")){
            new Modal().display("提示", "请选择匹配者1的星座");
            return;
        } else if(constellationComboBoxLeft.getPromptText().equals("请选择星座")){
            new Modal().display("提示", "请选择匹配者2的星座");
            return;
        }
        personLeft.setConstellation(constellationComboBoxLeft.getPromptText());
        personRight.setConstellation(constellationComboBoxRight.getPromptText());
        if (personLeft.getPersonConstellation().length()==0){
            new Modal().display("提示", "请输入匹配者1日期或星座");
            return;
        }
        if (personRight.getPersonConstellation().length()==0){
            new Modal().display("提示", "请输入匹配者2的日期或星座");
            return;
        }
        if(inputNameLeft.getText().equals("")){
            new Modal().display("错误", "请输入匹配者1的姓名");
            return;
        }
        if(inputNameRight.getText().equals("")){
            new Modal().display("错误", "请输入匹配者2的姓名");
            return;
        }
        radioButtonLeft = (RadioButton)sexual.getSelectedToggle();
        radioButtonRight= (RadioButton)sexual1.getSelectedToggle();
        if (radioButtonLeft.getText().matches(radioButtonRight.getText())){
            new Modal().display("错误", "请重新选择性别");
            return;
        }
        personLeft.setSex(radioButtonLeft.getText().matches("男生")? 1 : 0);
        personRight.setSex(radioButtonRight.getText().matches("男生")? 1 : 0);
        personLeft.setName(inputNameLeft.getText());
        personRight.setName(inputNameRight.getText());
        application.goToMatchResultView(personLeft, personRight);

    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        //TODO
        //
    }
}
