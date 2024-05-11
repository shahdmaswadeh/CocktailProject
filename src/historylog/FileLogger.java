/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historylog;
import java.io.*;
import java.util.logging.Level;

/**
 *
 * @author عسثق
 */
public class FileLogger implements Logger{
    private String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
    }
   
    

    @Override
    public void log(String msg) {
        
        FileWriter fw;
        try {
            fw = new FileWriter(filePath,true);
            fw.write(msg);
        fw.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FileLogger.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
