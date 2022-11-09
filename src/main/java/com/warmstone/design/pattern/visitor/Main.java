package com.warmstone.design.pattern.visitor;

import java.util.List;

/**
 * @author pengshun
 * @date 2022-11-09 21:43
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Entry root = new Directory("root");
        Entry home = new Directory("home");
        Entry usr = new Directory("usr");
        Entry steve = new Directory("steve");

        Entry helloFile = new File("hello.txt", 120);
        Entry javaFile = new File("java.sh", 20);
        Entry helloHTML = new File("hello.html", 135);
        Entry springHTML = new File("spring.html", 300);

        root.add(home).add(usr);

        home.add(steve);

        steve.add(helloFile);
        usr.add(javaFile);

        steve.add(helloHTML);
        root.add(springHTML);

        root.accept(new ListVisitor());

        System.out.println("======================");

        FileFoundVisitor fileFoundVisitor = new FileFoundVisitor();
        root.accept(fileFoundVisitor);

        List<Entry> foundFile = fileFoundVisitor.getFoundFile();

        foundFile.forEach(System.out::println);

        System.out.println("======================");

        SizeVisitor sizeVisitor = new SizeVisitor();
        root.accept(sizeVisitor);

        SizeVisitor sizeVisitor1 = new SizeVisitor();
        steve.accept(sizeVisitor1);

        System.out.println(sizeVisitor.getSize());
        System.out.println(sizeVisitor1.getSize());

        System.out.println("======================");

        ElementArrayList elementArrayList = new ElementArrayList();
        elementArrayList.add(root);

        elementArrayList.accept(new ListVisitor());
    }
}
