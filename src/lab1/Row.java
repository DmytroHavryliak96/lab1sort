
package lab1;

import java.util.LinkedList;


public class Row {
    private int key;
    private int frequency;
    private int integral_frequency;
    private double chastist;
    private double integral_chastist;

    public Row() {
        this.key = 0;
        this.frequency = 0;
        this.integral_frequency = 0;
        this.chastist = 0;
        this.integral_chastist = 0;
    }

    
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getIntegral_frequency() {
        return integral_frequency;
    }

    public void setIntegral_frequency(int integral_frequency) {
        this.integral_frequency = integral_frequency;
    }

    public double getChastist() {
        return chastist;
    }

    public void setChastist(double chastist) {
        this.chastist = chastist;
    }

    public double getIntegral_chastist() {
        return integral_chastist;
    }

    public void setIntegral_chastist(double integral_chastist) {
        this.integral_chastist = integral_chastist;
    }

    @Override
    public String toString() {
        return "Row{" + "key=" + key + ", frequency=" + frequency + ", integral_frequency=" + integral_frequency + ", chastist=" + chastist + ", integral_chastist=" + integral_chastist + '}' + "\n";
    }
    
    

    
}
