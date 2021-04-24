/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job;

/**
 *
 * @author dell
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bài 1");
        Bai1 b1 = new Bai1(3);
        System.out.print("Input:  [");
        b1.inputDefault();
        System.out.print("]");
        b1.b1();
        System.out.println("");
        System.out.print("Output: [");
        b1.output();
        System.out.print("]");

        System.out.println("");
        System.out.println("===========================");
        System.out.println("Bài 2");
        Bai2 b2 = new Bai2(8);
        System.out.print("Input:  [");
        b2.inputDefault();
        System.out.print("]");
        b2.b2();
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Bài 3");
        Bai3 b3 = new Bai3(11);
        System.out.print("Input:  [");
        b3.inputDefault();
        System.out.print("]");
        b3.b3();
        System.out.println("");
        b3.output();
    }

}
