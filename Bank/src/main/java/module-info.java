module marcos.com.bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    requires org.kordamp.bootstrapfx.core;

    opens marcos.com.bank to javafx.fxml;
    exports marcos.com.bank;
    exports marcos.com.bank.Controllers;
    exports marcos.com.bank.Controllers.Admin;
    exports marcos.com.bank.Controllers.Client;
    exports marcos.com.bank.Models;
    exports marcos.com.bank.Views;


}