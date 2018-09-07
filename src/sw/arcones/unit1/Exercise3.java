package sw.arcones.unit1;

import javax.swing.*;

public class Exercise3 {
    public static void main(String[] args) {
        Runnable helloWorld = () -> System.out.println("Hello world");
        helloWorld.run();


        JButton button = new JButton();
        button.addActionListener(event -> System.out.println(event.getActionCommand()));
    }

}
