package com.sparta.ms.sort_manager.model.algorithms;

public class BinaryTreeSort extends Sorter {

    private final String name = "Binary tree";
    private final Node rootNode;

    ///////////// NESTED CLASS START//////////
    public class Node {
        private final int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }

        public Node getLeftChild(){
            return leftChild;
        }

        public void setLeftChild(Node leftChild){
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public boolean isLeftChildEmpty(){
            return leftChild == null;

        }

        public boolean isRightChildEmpty(){
            return rightChild == null;

        }
    }

    ///////////// END OF NODE CLASS/////////////

//    public BinaryTreeSort(){
//
//    }
    public BinaryTreeSort(int element){
        this.rootNode = new Node(element);
    }
    @Override
    public String getSorterName() {
        return name;
    }

    public void addElementToTree(int element){
        addNodeToTree(rootNode, element);
    }

    private void addNodeToTree(Node node, int element){
        if (element < node.getValue()){
            if(node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element >= node.getValue()){
            if(node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    public boolean findElement(int element){
        Node node = findNode(element);
        return node != null;
    }

    private Node findNode(int element){
        Node node = rootNode;
        while(node != null){
            if(element == node.getValue()){
                return node;
            }

            if (element < node.getValue()){
                return node = node.getLeftChild();
            } else if(element > node.getValue()){
                return node = node.getRightChild();
            }
        }
        return null;
    }
    @Override
    public int[] sortArray(int[] unsortedArray) {
        new BinaryTreeSort(unsortedArray[0]);
        int[] sortedArray = new int[unsortedArray.length];
        int arrayIndex = 0;
        for(int value:unsortedArray){
            addElementToTree(value);
        }

        for(int element:unsortedArray) {

            sortedArray[arrayIndex] = findNode(element).getValue();
            arrayIndex++;

        }
        return sortedArray;
    }
}
