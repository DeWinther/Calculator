import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


import static javafx.application.Application.launch;

/**
 * Created by DeWinther on 27/08/15.
 */
public class mainStart extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonEquals, buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonPercent, buttonPlusMinus, buttonClear, buttonComma;
    Label labelResult;
    String pressed;
    double dPressed;
    String result;
    double dResult;
    double endResult;

    String finalEnd;

    boolean plus = false;
    boolean minus = false;
    boolean divide = false;
    boolean multiply = false;

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainLayout = new BorderPane();
        GridPane topLayout = new GridPane();
        GridPane centerLayout = new GridPane();
        centerLayout.setStyle("-fx-background-color: #CCCCCC;-fx-padding: 2;-fx-grid-lines-visible: false;");


        labelResult = new Label("Result");
        labelResult.setText("Result");
        labelResult.setPrefHeight(50);
        labelResult.setPrefWidth(2000);
        labelResult.setStyle("-fx-background-color: #666666; -fx-alignment: baseline-center; -fx-font-size: 15; -fx-text-fill: #CCCCCC;");
        topLayout.setRowIndex(labelResult, 1);
        topLayout.setColumnIndex(labelResult, 1);

        Separator separator = new Separator();
        separator.setPrefWidth(2000);
        separator.setPrefHeight(10);
        separator.setStyle("-fx-background-color: #666666;");
        topLayout.setRowIndex(separator, 2);
        topLayout.setColumnIndex(separator, 1);

        topLayout.getChildren().addAll(labelResult, separator);

        mainLayout.setTop(topLayout);

        centerLayout.setColumnIndex(button0 = new Button("0"), 1);
        centerLayout.setRowIndex(button0, 5);
        button0.setPrefWidth(100);
        button0.setPrefHeight(50);
        centerLayout.setColumnSpan(button0, 2);
        button0.setOnAction((event) -> {
            if (pressed != null) {
                labelResult.setText(pressed = pressed + 0);
            } else {
                labelResult.setText("0");
                pressed = "0";
            }
        });

        button0.setStyle("-fx-color: #CCCCCC;");

        centerLayout.setColumnIndex(button1 = new Button("1"), 1);
        centerLayout.setRowIndex(button1, 4);
        button1.setPrefWidth(50);
        button1.setPrefHeight(50);
        button1.setOnAction((event) -> {
            if (pressed != null) {
                labelResult.setText(pressed = pressed + 1);
            } else {
                labelResult.setText("1");
                pressed = "1";
            }
        });
        button1.setStyle("-fx-color: #CCCCCC;");

        centerLayout.setColumnIndex(button2 = new Button("2"), 2);
        centerLayout.setRowIndex(button2, 4);
        button2.setPrefWidth(50);
        button2.setPrefHeight(50);
        button2.setOnAction((event) -> {
            if (pressed != null) {
                labelResult.setText(pressed = pressed + 2);
            } else {
                labelResult.setText("2");
                pressed = "2";
            }
        });
        button2.setStyle("-fx-color: #CCCCCC;");

        centerLayout.setColumnIndex(button3 = new Button("3"), 3);
        centerLayout.setRowIndex(button3, 4);
        button3.setPrefWidth(50);
        button3.setPrefHeight(50);
        button3.setOnAction((event) -> {
            if (pressed != null) {
                labelResult.setText(pressed = pressed + 3);
            } else {
                labelResult.setText("3");
                pressed = "3";
            }
        });
        button3.setStyle("-fx-color: #CCCCCC;");

        centerLayout.setColumnIndex(button4 = new Button("4"), 1);
        centerLayout.setRowIndex(button4, 3);
        button4.setPrefWidth(50);
        button4.setPrefHeight(50);
        button4.setOnAction((event) -> {
            if (pressed != null) {
                labelResult.setText(pressed = pressed + 4);
            } else {
                labelResult.setText("4");
                pressed = "4";
            }
        });
        button4.setStyle("-fx-color: #CCCCCC;");

        centerLayout.setColumnIndex(button5 = new Button("5"), 2);
        centerLayout.setRowIndex(button5, 3);
        button5.setPrefWidth(50);
        button5.setPrefHeight(50);
        button5.setOnAction((event) -> {
            if (pressed != null) {
                labelResult.setText(pressed = pressed + 5);
            } else {
                labelResult.setText("5");
                pressed = "5";
            }
        });
        button5.setStyle("-fx-color: #CCCCCC;");

        centerLayout.setColumnIndex(button6 = new Button("6"), 3);
        centerLayout.setRowIndex(button6, 3);
        button6.setPrefWidth(50);
        button6.setPrefHeight(50);
        button6.setOnAction((event) -> {
            if (pressed != null) {
                labelResult.setText(pressed = pressed + 6);
            } else {
                labelResult.setText("6");
                pressed = "6";
            }
        });
        button6.setStyle("-fx-color: #CCCCCC;");

        centerLayout.setColumnIndex(button7 = new Button("7"), 1);
        centerLayout.setRowIndex(button7, 2);
        button7.setPrefWidth(50);
        button7.setPrefHeight(50);
        button7.setOnAction((event) -> {
            if (pressed != null) {
                labelResult.setText(pressed = pressed + 7);
            } else {
                labelResult.setText("7");
                pressed = "7";
            }
        });
        button7.setStyle("-fx-color: #CCCCCC;");

        centerLayout.setColumnIndex(button8 = new Button("8"), 2);
        centerLayout.setRowIndex(button8, 2);
        button8.setPrefWidth(50);
        button8.setPrefHeight(50);
        button8.setOnAction((event) -> {
            if (pressed != null) {
                labelResult.setText(pressed = pressed + 8);
            } else {
                labelResult.setText("8");
                pressed = "8";
            }
        });
        button8.setStyle("-fx-color: #CCCCCC;");

        centerLayout.setColumnIndex(button9 = new Button("9"), 3);
        centerLayout.setRowIndex(button9, 2);
        button9.setPrefWidth(50);
        button9.setPrefHeight(50);
        button9.setOnAction((event) -> {
            if (pressed != null) {
                labelResult.setText(pressed = pressed + 9);
            } else {
                labelResult.setText("9");
                pressed = "9";
            }
        });
        button9.setStyle("-fx-color: #CCCCCC;");

        centerLayout.setColumnIndex(buttonEquals = new Button("="), 4);
        centerLayout.setRowIndex(buttonEquals, 5);
        buttonEquals.setPrefWidth(50);
        buttonEquals.setPrefHeight(50);
        buttonEquals.setOnAction((event1) -> {
            if (plus) {
                dResult = Double.parseDouble(result);
                dPressed = Double.parseDouble(pressed);
                endResult = dResult + dPressed;
                finalEnd = String.valueOf(endResult);
                labelResult.setText(finalEnd);
            }
            if (minus) {
                dResult = Double.parseDouble(result);
                dPressed = Double.parseDouble(pressed);
                endResult = dResult - dPressed;
                finalEnd = String.valueOf(endResult);
                labelResult.setText(finalEnd);
            }
            if (multiply) {
                dResult = Double.parseDouble(result);
                dPressed = Double.parseDouble(pressed);
                endResult = dResult * dPressed;
                finalEnd = String.valueOf(endResult);
                labelResult.setText(finalEnd);
            }
            if (divide) {
                dResult = Double.parseDouble(result);
                dPressed = Double.parseDouble(pressed);
                endResult = dResult / dPressed;
                finalEnd = String.valueOf(endResult);
                labelResult.setText(finalEnd);
            }
        });
        buttonEquals.setStyle("-fx-color: #E97C28;");

        centerLayout.setColumnIndex(buttonPlus = new Button("+"), 4);
        centerLayout.setRowIndex(buttonPlus, 4);
        buttonPlus.setPrefWidth(50);
        buttonPlus.setPrefHeight(50);
        buttonPlus.setOnAction((event1) -> {
            result = pressed;
            pressed = null;
            labelResult.setText("+");
            plus = true;
        });
        buttonPlus.setStyle("-fx-color: #E97C28;");

        centerLayout.setColumnIndex(buttonMinus = new Button("-"), 4);
        centerLayout.setRowIndex(buttonMinus, 3);
        buttonMinus.setPrefWidth(50);
        buttonMinus.setPrefHeight(50);
        buttonMinus.setOnAction((event1) -> {
            result = pressed;
            pressed = null;
            labelResult.setText("-");
            minus = true;
        });
        buttonMinus.setStyle("-fx-color: #E97C28;");

        centerLayout.setColumnIndex(buttonMultiply = new Button("X"), 4);
        centerLayout.setRowIndex(buttonMultiply, 2);
        buttonMultiply.setPrefWidth(50);
        buttonMultiply.setPrefHeight(50);
        buttonMultiply.setOnAction((event1) -> {
            result = pressed;
            pressed = null;
            labelResult.setText("X");
            multiply = true;
        });
        buttonMultiply.setStyle("-fx-color: #E97C28;");

        centerLayout.setColumnIndex(buttonDivide = new Button("÷"), 4);
        centerLayout.setRowIndex(buttonDivide, 1);
        buttonDivide.setPrefWidth(50);
        buttonDivide.setPrefHeight(50);
        buttonDivide.setOnAction((event1) -> {
            result = pressed;
            pressed = null;
            labelResult.setText("÷");
            divide = true;
        });
        buttonDivide.setStyle("-fx-color: #E97C28;");

        centerLayout.setColumnIndex(buttonPercent = new Button("%"), 3);
        centerLayout.setRowIndex(buttonPercent, 1);
        buttonPercent.setPrefWidth(50);
        buttonPercent.setPrefHeight(50);
        buttonPercent.setOnAction((event1) -> {
            dPressed = Double.parseDouble(pressed);
            endResult = dPressed / 100;
            finalEnd = String.valueOf(endResult);
            labelResult.setText(finalEnd);
        });
        buttonPercent.setStyle("-fx-color: #E97C28;");

        centerLayout.setColumnIndex(buttonPlusMinus = new Button("+/-"), 2);
        centerLayout.setRowIndex(buttonPlusMinus, 1);
        buttonPlusMinus.setPrefWidth(50);
        buttonPlusMinus.setPrefHeight(50);
        buttonPlusMinus.setOnAction((event1) -> {
            if (pressed != null) {
                pressed = "-" + pressed;
                labelResult.setText(pressed);
            }
        });
        buttonPlusMinus.setStyle("-fx-color: #E97C28;");

        centerLayout.setColumnIndex(buttonComma = new Button(","), 3);
        centerLayout.setRowIndex(buttonComma, 5);
        buttonComma.setPrefWidth(50);
        buttonComma.setPrefHeight(50);
        buttonComma.setOnAction((event) -> {
            if (pressed != null) {
                labelResult.setText(pressed = pressed + ".");
            }
        });

        buttonComma.setStyle("-fx-color: #CCCCCC;");

        centerLayout.setColumnIndex(buttonClear = new Button("AC"), 1);
        centerLayout.setRowIndex(buttonClear, 1);
        buttonClear.setPrefWidth(50);
        buttonClear.setPrefHeight(50);
        buttonClear.setOnAction((event) -> {
            labelResult.setText("Result");
            pressed = null;
        });
        buttonClear.setStyle("-fx-color: #E97C28;");

        centerLayout.getChildren().addAll(button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
                buttonEquals, buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonPercent, buttonPlusMinus, buttonClear, buttonComma);
        mainLayout.setCenter(centerLayout);

        Scene scene = new Scene(mainLayout, 200, 310);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }
}





