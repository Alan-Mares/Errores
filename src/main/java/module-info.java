module application.analizador {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.analizador to javafx.fxml;
    exports application.analizador;
}