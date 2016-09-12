
package lab1;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Lab1 {
//public static Hashmap map1 = new Hashmap();
   
    public static void main(String[] args) {
        final int number = 8;
        //Hashmap map2 = new Hashmap();
        int array[] = new int [number+10];
        for(int i=0; i<array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(1, 6);
            System.out.print(array[i] + " ");
        }
        
        Combsort sort1 = new Combsort();
        sort1.gapsort(array);
        
        System.out.println();
        
        for(int i : array){
            System.out.print(i + " ");
        }
        
         System.out.println();
        
        int array2[] = new int [number+10];
        for(int i = 0; i<array2.length; i++){
            array2[i] = ThreadLocalRandom.current().nextInt(1, 6);
             System.out.print(array2[i] + " ");
        }
        
        System.out.println();
        
        QuickSort sort2 = new QuickSort();
        sort2.sort(array2);
        
        for(int i : array2){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        Table t1 = new Table();
        t1.calculate(array);
       
        
    }
    
    
    
}
