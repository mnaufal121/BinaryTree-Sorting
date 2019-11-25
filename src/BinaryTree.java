/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class BinaryTree {

    private Node root;
    private char data;

    public void NewData(char data) {
        root = NewData(root, new Node(data));
    }

    private Node NewData(Node root, Node addNew) {
        if (root == null) {
            root = addNew;
            return root;
        }
        if (addNew.data < root.data) {
            root.left = NewData(root.left, addNew);
        } else {
            root.right = NewData(root.right, addNew);
        }
        return root;
    }

    private void in(Node node) {
        if (node != null) {
            in(node.left);
            System.out.print(node.data + " ");
            in(node.right);
        }
    }
    
    private void inAsci(Node node){
        if (node != null) {
            inAsci(node.left);
            System.out.print((int)node.data + " ");
            inAsci(node.right);
        }
    }

    private void pre(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            pre(node.left);
            pre(node.right);
        }
    }
    
    private void preAsci(Node node) {
        if (node != null) {
            System.out.print((int)node.data + " ");
            preAsci(node.left);
            preAsci(node.right);
        }
    }

    private void post(Node node) {
        if (node != null) {
            post(node.left);
            post(node.right);
            System.out.print(node.data + " ");
        }
    }
    
    private void postAsci(Node node) {
        if (node != null) {
            postAsci(node.left);
            postAsci(node.right);
            System.out.print((int)node.data + " ");
        }
    }

    public void printpre() {
        System.out.println("Pre Order");
        pre(root);
        System.out.println();
        System.out.println("Pre Order format ASCI");
        preAsci(root);
        System.out.println();
    }

    public void printpost() {
        System.out.println("Post Order");
        post(root);
        System.out.println();
        System.out.println("Post Order format ASCI");
        postAsci(root);
        System.out.println();
    }

    public void printin() {
        System.out.println("In Order");
        in(root);
        System.out.println();
        System.out.println("In Order format ASCI");
        inAsci(root);
        System.out.println();
    }
}
