package Clases;

import Interfaces.frmLoading;
import javax.swing.UIManager;


public class ClassMain {

    
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            frmLoading loading = new frmLoading();
            loading.setSize(300,300);
            loading.setLocationRelativeTo(null);
            loading.setVisible(true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
