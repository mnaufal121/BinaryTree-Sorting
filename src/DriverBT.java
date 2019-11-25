
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class DriverBT {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata : ");
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            bt.NewData(input.charAt(i));
        }

        bt.printin();
        bt.printpre();
        bt.printpost();
    }
}
