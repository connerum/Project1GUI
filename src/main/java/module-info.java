module edu.bsu.cs222.project1gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.smart;
    requires json.path;


    opens edu.bsu.cs222.project1gui to javafx.fxml;
    exports edu.bsu.cs222.project1gui;
}