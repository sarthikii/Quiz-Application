module com.example.quiz_application {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.quiz_application to javafx.fxml;
    exports com.example.quiz_application;
}