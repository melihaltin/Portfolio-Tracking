/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import javax.swing.Icon;

/**
 *
 * @author melihaltin
 */
public interface CardInterface {
    Icon getIcon();
    void setIcon(Icon icon);
    
    String getTitle();
    void setTitle(String title);
    
    String getValues();
    void setValues(String values);
    
    String getShortName();
    void setShortName(String shortName);
    
    String getChange();
    void setChange(String change);
}
