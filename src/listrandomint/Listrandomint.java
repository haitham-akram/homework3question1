/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listrandomint;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Haitham
 */
public class Listrandomint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> listnum = new LinkedList<Integer>();
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            int ran = (int) (100.0 * Math.random());
            listnum.add(ran);
            sum += ran;
        }
        Collections.sort(listnum);
        Iterator<Integer> it = listnum.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            System.out.println("Num "+i + " |Value :" + it.next());
        }
        System.out.println("The Sum of the list is : " + sum);

    }

}
