package com.github.delta.hlf.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元模式
 *
 * @author 黄麟峰
 */
public class FlyWeightTest {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1, 2, TreeFactory.getTree("abc", "abc"));
        TreeNode treeNode2 = new TreeNode(1, 2, TreeFactory.getTree("abc", "abc"));

        TreeNode treeNode3 = new TreeNode(1, 2, TreeFactory.getTree("xxx", "yyy"));
        TreeNode treeNode4 = new TreeNode(1, 2, TreeFactory.getTree("xxx", "yyy"));
    }
}


class TreeNode {

    private int x;
    private int y;
    private Tree tree;

    public TreeNode(int x, int y, Tree tree) {
        this.x = x;
        this.y = y;
        this.tree = tree;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }
}

class TreeFactory {

    private static Map<String, Tree> map = new ConcurrentHashMap<>();

    public static Tree getTree(String name, String data) {
        if (map.containsKey(name)) {
            return map.get(name);
        }
        Tree tree = new Tree(name, data);
        map.put(name, tree);
        return tree;
    }
}

class Tree {

    private final String name;
    private final String data;

    public Tree(String name, String data) {
        System.out.println("创建了Tree." + name);
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }
}
