module com.example.tipcalciulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tipcalciulator to javafx.fxml;
    exports com.example.tipcalciulator;
}