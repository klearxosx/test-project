package gr.aueb.cf.helloApp;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class AddApp {

    public static void main(String[] args) {
        System.out.println(add(3, 5));
    }

    public static  int add(int a, int b) {
        return a + b;
    }
}
