/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historylog;


/**
 *
 * @author عسثق
 */
public class ConsoleLogger implements Logger{

    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
    
}
