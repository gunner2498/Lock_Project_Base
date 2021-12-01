module Gunn {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens gunn.lock_project_base to javafx.fxml;
    exports gunn.lock_project_base;
}