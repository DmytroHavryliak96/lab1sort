
package lab1;

import java.util.LinkedList;


public class Table {
    
    public LinkedList<Row> table = new LinkedList();
    
    public void calculate(int arr[]){
        for(int i=1; i<6; i++){
            int n = 0;
            for (int j = 0; j < arr.length; j++){
                if(i == arr[j]) n++;
            }
        if(n == 0) continue;
        table.add(createRow(i, n));
        }
        integralFrequency();
        chastist();
        integralChastist();
        for(Row r : table){
            System.out.println(r);
            }
    }
    
    public Row createRow(int number, int amount){
        Row row = new Row();
        row.setKey(number);
        row.setFrequency(amount);
        return row;
    }
    
    public void integralFrequency(){
        for(int i=0; i<table.size(); i++){
            int n = 0;
            for(int j=0; j<=i; j++){
                n += table.get(j).getFrequency();
            }
            table.get(i).setIntegral_frequency(n);
        }
    }
    
    public void chastist(){
        double summary = 0;
        for(int i = 0; i<table.size(); i++){
            summary += table.get(i).getFrequency();
        }
        for(int i = 0; i<table.size(); i++){
             table.get(i).setChastist(table.get(i).getFrequency()/summary); 
        }
    }
    
    public void integralChastist(){
        for(int i = 0; i<table.size(); i++){
            double n = 0;
            for(int j = 0; j<=i; j++){
                n+= table.get(j).getChastist();
            }
            table.get(i).setIntegral_chastist(n);
        }
    }
}