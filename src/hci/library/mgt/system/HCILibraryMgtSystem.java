/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci.library.mgt.system;

/**
 *
 * @author Sanoj Dilshan
 */
public class HCILibraryMgtSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Login load = new Login();
        load.setVisible(true);
        LoadLogin login= new LoadLogin();
        try{
            for (int i = 0; i <=100; i++) {
                Thread.sleep(40);
                load.load.setText(Integer.toString(i)+"%");
                load.pbar.setValue(i);
                if (i==100) {
                    load.setVisible(false);
                    login.setVisible(true);
                }
            }
        }
        catch(Exception e){
        
        }
        
    }
    
}
