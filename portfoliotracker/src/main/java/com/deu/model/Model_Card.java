package com.deu.model;

import interfaces.CardInterface;
import javax.swing.Icon;

public class Model_Card implements CardInterface{

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    
    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public Model_Card(Icon icon, String title, String values, String shortName,String change) {
        this.icon = icon;
        this.title = title;
        this.values = values;
        this.shortName = shortName;
        this.change = change;
    }

    public Model_Card() {
    }

    private Icon icon;
    private String title;
    private String values;
    private String shortName;
    private String change;
}