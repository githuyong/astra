module io.astra {
    requires javafx.controls;
    requires javafx.fxml;

    opens io.astra to javafx.fxml;
    exports io.astra;
}