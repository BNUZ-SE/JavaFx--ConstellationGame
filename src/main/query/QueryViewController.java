package main.query;

import com.jfoenix.controls.JFXSpinner;
import javafx.scene.control.*;
import logic.ConstellationMap;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import VIEW.Main;
import javafx.scene.text.Text;
import logic.Constellation;
import utils.Modal;

public class QueryViewController  implements Initializable {
    private Main application;
    @FXML
    public DatePicker queryDate; //日期选择
    public TextField inputName;  //输入名字的input
    public Text queryNameResult; //render 星座名字的text
    public Text queryResult; // render 星座特点Text
    public ToggleGroup sexual;
    public RadioButton radioButton;
    public Text resultTitle;
    public Text resultPersonName;
    public JFXSpinner resultSpinner;

    public void setApp(Main application) {
        this.application = application;
        resultSpinner.setVisible(false);
    }

    @FXML
    public void onQueryClick () {

        ConstellationMap constellationMap = new ConstellationMap();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        if (queryDate.getValue() == null){
           new Modal().display("提示", "请输入日期");
            return;
        }

        String time = df.format(queryDate.getValue());
        Constellation result = constellationMap.getCorrectConstellation(time);
        if(inputName.getText().equals("")){
            new Modal().display("错误", "请输入姓名");
            return;
        }

        try {

            resultSpinner.setVisible(true);
            resultSpinner.setVisible(false);
            resultPersonName.setText(inputName.getText());
            resultTitle.setText("的星座报告");
            queryNameResult.setText(result.getConstellationName());

            radioButton = (RadioButton)sexual.getSelectedToggle();
            if(radioButton.getText().equals("女生")){
                queryResult.setText(result.getConstellationDesc(0));

            }else {
                queryResult.setText(result.getConstellationDesc(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


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
