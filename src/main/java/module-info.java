module com.example.bodyonfront {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bodyonfront to javafx.fxml;
    exports com.example.bodyonfront;
}