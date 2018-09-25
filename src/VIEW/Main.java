package VIEW;

import account.AccountViewController;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.WritableImage;
import main.match.MatchResultController;
import main.match.MatchViewController;
import main.query.QueryViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import logic.Person;
import index.IndexViewController;
import main.match.MatchResultController;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Timer;

public class Main extends Application {
    private Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("2018占星");
        stage.setResizable(false);
        goToIndexView(); // 进入首页
        stage.show();
    }


    //进入首页
    public void goToIndexView() {
        try {
            IndexViewController indexView = (IndexViewController) replaceSceneContent("IndexView.fxml");
            indexView.setApp(this);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    //进入星座查询页面
    public void goToQueryView() {
        try {
            QueryViewController queryView = (QueryViewController) replaceSceneContent("QueryView.fxml");
            queryView.setApp(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //进入星座匹配页面
    public void goToMatchView() {
        try {
            MatchViewController matchView = (MatchViewController) replaceSceneContent("MatchView.fxml");
            matchView.setApp(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //选择用户界面
    public void goToAccountView() {
        try {
            AccountViewController accountViewController = (AccountViewController) replaceSceneContent("AccountView.fxml");
            accountViewController.setApp(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //进入星座匹配结果页面
    public void goToMatchResultView(Person left, Person right) {
        try {

            MatchResultController matchResultController = (MatchResultController) replaceSceneContent("MatchResultView.fxml");
            matchResultController.setApp(this, left, right);
        } catch (Exception e) {

        }
    }
    //截图
    public void doShare(){
        Scene scene = stage.getScene();
        Date date = new Date();
        WritableImage writableImage = scene.snapshot(null);
        File file = new File("src/View/static/img/share/" + date.toString() + ".png");
        try{
            ImageIO.write(SwingFXUtils.fromFXImage(writableImage, null),"png", file);
        } catch (IOException e) {

        }

    }
     Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = Main.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        }
        Scene scene = new Scene(page, 900, 600);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
