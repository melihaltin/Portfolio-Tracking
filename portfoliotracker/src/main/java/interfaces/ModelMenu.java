/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import com.deu.model.Model_Menu;
import java.util.function.Consumer;
import javax.swing.Icon;

/**
 *
 * @author melihaltin
 */
public interface ModelMenu {
    
    // Getter and Setter methods for icon
    String getIcon();
    void setIcon(String icon);
    
    // Getter and Setter methods for name
    String getName();
    void setName(String name);
    
    // Getter and Setter methods for type
    Model_Menu.MenuType getType();
    
    void setType(Model_Menu.MenuType type);
    
    // Method to convert icon string to Icon object
    Icon toIcon();
    
    void executeFunction(Consumer<ModelMenu> function);
}