package com.prep.DesignPatterns.factory.components.Button;

public class WindowsButton implements Button {
    @Override
    public void createButton() {
        System.out.println("Windows Button");
    }
}
