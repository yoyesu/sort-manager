package com.sparta.ms.sort_manager.model.algorithms;

import com.sparta.ms.sort_manager.logging.CustomLoggingConfig;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryTreeSort extends Sorter {
    private static final Logger logger = Logger.getLogger("binaryTree-logger");
    private final String name = "Binary tree";
    private Node rootNode;
    private int globalIndex = 0;


    static{

        CustomLoggingConfig.configBinaryTreeLogger(logger);
    }

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

    public BinaryTreeSort (){}
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
                node = node.getLeftChild();
            } else if(element > node.getValue()){
                node = node.getRightChild();
            }
        }
        return null;
    }

    private BinaryTreeSort createTree(int[] unsortedArray){
        BinaryTreeSort tree = new BinaryTreeSort(unsortedArray[0]);
        for(int i = 1; i < unsortedArray.length; i++) {
            logger.log(Level.FINE, "inside first loop. Value added to Tree = " + unsortedArray[i]);
            tree.addElementToTree(unsortedArray[i]);
        }

        return tree;

    }
    @Override
    public int[] sortArray(int[] unsortedArray) {
        int[] newArray = new int[unsortedArray.length];
        logger.log(Level.INFO, "the sortarray method has run");
        if(unsortedArray.length <= 1){
            return unsortedArray;
        }

        Node currentNode = createTree(unsortedArray).rootNode;
        globalIndex = 0;

        inOrderTraverseTree(currentNode, newArray);
        globalIndex = 0;
        return newArray;
    }

    private void inOrderTraverseTree(Node currentNode, int[] array){
        if(globalIndex > array.length -1){
            return;
        }


        if(currentNode != null){
            if(!currentNode.isLeftChildEmpty()){
                inOrderTraverseTree(currentNode.getLeftChild(), array);

            }

            logger.log(Level.FINE, "Inserting value " + currentNode.getValue() + " at index " + globalIndex);
            array[globalIndex++] = currentNode.getValue();

            if(!currentNode.isRightChildEmpty()){
                inOrderTraverseTree(currentNode.getRightChild(),array);

            }
        }


    }


    }
