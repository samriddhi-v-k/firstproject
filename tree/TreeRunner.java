package com.xworkz.tree;

import com.xworkz.tree.mangoTree.MangoTree;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.branches();
        tree.roots();

        MangoTree mangoTree = new MangoTree();
        mangoTree.branches();
        mangoTree.roots();

        Tree tree1 = new MangoTree();
        MangoTree mangoTree1 = (MangoTree)tree1;
        System.out.println(mangoTree1);
    }
}
