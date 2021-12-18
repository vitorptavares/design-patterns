package com.vitor.design.singleton;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MathUtils m1 = MathUtils.getMethUtils();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\vitor\\Documents\\singleton\\MathUtils.txt")));
        oos.writeObject(m1);

        MathUtils m2 = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\vitor\\Documents\\singleton\\MathUtils.txt")));
        m2 = (MathUtils) ois.readObject();
        System.out.println(m1==m2);

    }
}
