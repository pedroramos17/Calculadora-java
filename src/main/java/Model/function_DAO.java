/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pedro
 */
    
public class function_DAO {
    public static String x;
    public static double val1,val2,res;
    public static void soma(){
    x = View.Calc_GUI.val1.getText();
    val1 = Integer.parseInt(x);
    x = View.Calc_GUI.val2.getText();
    val2 = Integer.parseInt(x);
    
    res = val1+val2;
    
    View.Calc_GUI.res.setText(String.valueOf(res));
    }
    public static void sub(){
    x = View.Calc_GUI.val1.getText();
    val1 = Integer.parseInt(x);
    x = View.Calc_GUI.val2.getText();
    val2 = Integer.parseInt(x);
    
    res = val1-val2;
    
    View.Calc_GUI.res.setText(String.valueOf(res));
    }
    public static void mult(){
    x = View.Calc_GUI.val1.getText();
    val1 = Integer.parseInt(x);
    x = View.Calc_GUI.val2.getText();
    val2 = Integer.parseInt(x);
    
    res = val1*val2;
    
    View.Calc_GUI.res.setText(String.valueOf(res));
    }
    public static void div(){
    x = View.Calc_GUI.val1.getText();
    val1 = Integer.parseInt(x);
    x = View.Calc_GUI.val2.getText();
    val2 = Integer.parseInt(x);
    
    res = val1/val2;
    
    View.Calc_GUI.res.setText(String.valueOf(res));
    }
    public static void clear(){
    View.Calc_GUI.val1.setText("");
    View.Calc_GUI.val2.setText("");
    View.Calc_GUI.res.setText("");

    }
}
