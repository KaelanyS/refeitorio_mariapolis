module br.upe.centromariapolis {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires transitive javafx.base;
    requires java.persistence;

    opens br.upe.centromariapolis to javafx.fxml;
    exports br.upe.centromariapolis.entities;
    exports br.upe.centromariapolis;
    exports br.upe.centromariapolis.util;
    opens br.upe.centromariapolis.util to javafx.fxml;
    opens br.upe.centromariapolis.entities to javafx.base;
}