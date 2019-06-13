package com.grupo8.perfumariapdv.main;

import com.grupo8.perfumariapdv.fonts.FontManager;
import com.grupo8.perfumariapdv.view.MenuView;
import java.awt.Font;
import javax.swing.UIManager;

/*
*@author – RamsesSouza
*/
public class Main 
{
    public static void main (String[] args)
    {
        FontManager fontManager = new FontManager();
            Font futuraPT16 = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.PLAIN, 16);
            Font futuraPT14 = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.PLAIN, 14);
            Font futuraPT14Bold = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.BOLD, 14);
            Font futuraPT13 = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.PLAIN, 13);
            
            UIManager.put("dateChooserCombo", futuraPT13);
            UIManager.put("Button.font", futuraPT16);
//            UIManager.put("ToggleButton.font", ubuntuFonteBold);
            UIManager.put("RadioButton.font", futuraPT13);
            UIManager.put("CheckBox.font", futuraPT13);
//            UIManager.put("ColorChooser.font", ubuntuFonteBold);
            UIManager.put("ComboBox.font", futuraPT13);
            UIManager.put("Label.font", futuraPT14);
//            UIManager.put("List.font", ubuntuFonteBold);
//            UIManager.put("MenuBar.font", ubuntuFonteBold);
//            UIManager.put("MenuItem.font", ubuntuFonteBold);
//            UIManager.put("RadioButtonMenuItem.font", ubuntuFonteBold);
//            UIManager.put("CheckBoxMenuItem.font", ubuntuFonteBold);
//            UIManager.put("Menu.font", ubuntuFonteBold);
//            UIManager.put("PopupMenu.font", ubuntuFonteBold);
//            UIManager.put("OptionPane.font", ubuntuFonteBold);
            UIManager.put("Panel.font", futuraPT16);
//            UIManager.put("ProgressBar.font", ubuntuFonteBold);
//            UIManager.put("ScrollPane.font", ubuntuFonteBold);
//            UIManager.put("Viewport.font", ubuntuFonteBold);
//            UIManager.put("TabbedPane.font", ubuntuFonteBold);
            UIManager.put("Table.font", futuraPT13);
            UIManager.put("TableHeader.font", futuraPT14Bold);
            UIManager.put("TextField.font", futuraPT13);
            UIManager.put("FormattedTextField.font", futuraPT13);
//            UIManager.put("PasswordField.font", ubuntuFonteBold);
            UIManager.put("TextArea.font", futuraPT13);
//            UIManager.put("TextPane.font", ubuntuFonteBold);
//            UIManager.put("EditorPane.font", ubuntuFonteBold);
//            UIManager.put("TitledBorder.font", ubuntuFonteBold);
//            UIManager.put("ToolBar.font", ubuntuFonteBold);
//            UIManager.put("ToolTip.font", ubuntuFonteBold);
//            UIManager.put("Tree.font", ubuntuFonteBold);
            
            new MenuView().setVisible(true);
    }
}
