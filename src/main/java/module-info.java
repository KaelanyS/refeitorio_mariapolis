module br.upe.centromariapolis {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.upe.centromariapolis to javafx.fxml;
    exports br.upe.centromariapolis;
    exports br.upe.centromariapolis.util;
    opens br.upe.centromariapolis.util to javafx.fxml;
}