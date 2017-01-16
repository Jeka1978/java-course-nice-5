package factory;

import javax.swing.*;

/**
 * Created by Evegeny on 16/01/2017.
 */
public class PopupSpeaker implements Speaker {
    @Override
    public void sayMessage(String message) {
        JOptionPane.showMessageDialog(null,message);
    }
}
