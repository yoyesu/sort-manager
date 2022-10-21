package com.sparta.ms.sort_manager.model.algorithms;

import com.sparta.ms.sort_manager.model.exceptions.ChildNotFoundException;

import java.util.logging.Level;

public class BinaryTreeSort extends Sorter {
//    private static final Logger logger = Logger.getLogger("binaryTree-logger");

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
        for(int value:unsortedArray) {
//            logger.log(Level.FINE, "inside first loop. Value added to Tree = " + value);
            tree.addElementToTree(value);
        }

        return tree;

    }
    @Override
    public int[] sortArray(int[] unsortedArray) {
//        CustomLoggingConfig.configBinaryTreeLogger(logger);
//        logger.log(Level.INFO, "the sortarray method has run");

        if(unsortedArray.length <= 1){
            return unsortedArray;
        }

        Node currentNode = createTree(unsortedArray).rootNode;
        System.out.println("rootnode " + currentNode.getValue());

        sort(currentNode, unsortedArray);
        return unsortedArray;
    }
    private int globalIndex = 0;
    public void sort(Node currentNode, int[] array){
        if(globalIndex > array.length -1){
            return;
        }
        if(currentNode != null){
            System.out.println("current node = " + currentNode.getValue());
            sort(currentNode.getLeftChild(), array);
            array[globalIndex++] = currentNode.getValue();
            sort(currentNode.getRightChild(),array);
        }


//            if(!currentNode.isLeftChildEmpty()){
//                currentNode = currentNode.getLeftChild();
//                sort(currentNode, array, index);
//            } else {
//                if(!currentNode.isRightChildEmpty()){
//                    currentNode = currentNode.getRightChild();
//                    sort(currentNode, array, index);
//                }
//            }

//            System.out.println(currentNode.getValue());
//            array[index] = currentNode.getValue();
//            ++index;
//        }
    }


    }
