module HelloFX {
requires javafx.graphics;
requires javafx.controls;
requires java.desktop;
requires javafx.swing;
requires javafx.media;
requires javafx.web;
requires javafx.fxml;
requires jdk.jsobject;

opens org.altervista.numerone.javafx to javafx.graphics, javafx.base;

}