package edu.malinda.styler;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

/**
 * @Author Malinda Weerasinghe
 * @Date 2016/12/22
 */
public class JStyler {

    String BASE_TEXT = " ";
    Boolean center = false;

    public enum Style {

        SMALL, MEDIUM, LARGE
    }

    public void addBreak() {
        BASE_TEXT += "<br>";
    }

    public void addLink(String url, String text) {
        BASE_TEXT += "<a href=" + url + ">" + text + "</a>";
    }

    public void addHeading(String text, Style style) {
        switch (style) {
            case SMALL:
                BASE_TEXT += "<h4>" + text + "</h4>";
                break;
            case MEDIUM:
                BASE_TEXT += "<h3>" + text + "</h3>";
                break;
            case LARGE:
                BASE_TEXT += "<h2>" + text + "</h2>";
                break;
            default:
                BASE_TEXT += "<h2>" + text + "</h2>";
                break;
        }
    }

    public void setImage(String path) throws IOException {
        File file = new File("/" + path);
        BASE_TEXT += "<img src=\"file:" + file.toString() + "\">";
    }

    public void centerAll() {
        center = true;
    }

    public String getStyledText() {
        if (center) {
            return "<html><center>" + BASE_TEXT + "</center></html>";
        } else {
            return "<html>" + BASE_TEXT + "</html>";
        }
    }

}
