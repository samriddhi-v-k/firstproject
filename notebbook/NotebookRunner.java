package com.xworkz.notebbook;

import com.xworkz.notebbook.classmate.Classmate;

public class NotebookRunner {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.drawing();
        notebook.journalling();
        notebook.toWriteNotes();

        Classmate classmate = new Classmate();
        classmate.drawing();
        classmate.journalling();
        classmate.toWriteNotes();

        Notebook notebook1 = new Classmate();
        Classmate classmate1 = (Classmate) notebook1;
        System.out.println(classmate1);
    }
}
