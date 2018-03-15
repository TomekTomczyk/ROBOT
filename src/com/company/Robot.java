package com.company;

public class Robot {

    private int position;
    private boolean holdsBlock;
    private int previousBlock;

    public Robot() {
        this.position = 0;
        this.holdsBlock = false;
    }

    public int pickUpBlock() {

        int block;

        if (holdsBlock) {
            block = previousBlock;
            position = 0;
        }
        else {
            block = 1;
            previousBlock = block;
            holdsBlock = true;
        }
        return block;
    }

    public void moveBlock(BoxManager boxManager) {

        if (position > boxManager.getNumberOfBoxes()) position = boxManager.getNumberOfBoxes()-1;

        else position += 1;

    }

    public void lowerBlock(int block, BoxManager boxManager) {

        if (holdsBlock) {
            boxManager.addBlock(position, block);
            holdsBlock = false;
            position = 0;
        }
        else return;
    }

}