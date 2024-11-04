package com.example;

import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Diretório: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}