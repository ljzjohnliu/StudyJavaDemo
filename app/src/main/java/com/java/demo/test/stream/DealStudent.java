package com.java.demo.test.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DealStudent {

    private static final String FILE_PATH = "/home/ljz/ljz/work/StudyJavaDemo/app/src/main/assets/students.txt";

    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    public static void writeFile() {
        List<StudentBean> students = new ArrayList<>();
        StudentBean studentA = new StudentBean("xxx", 20201, 100);
        StudentBean studentB = new StudentBean("ljz", 20202, 99);
        students.add(studentA);
        students.add(studentB);
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            os.writeObject(students);
            os.close();
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static void readFile() {
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(FILE_PATH));
            ArrayList<StudentBean> list = new ArrayList<StudentBean>();
            list = (ArrayList<StudentBean>) is.readObject();
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
