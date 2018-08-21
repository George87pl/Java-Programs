package com.company;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            //The list was empty
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compereTo(newItem));
            if (comparison < 0) {
                //newItem is greater, move to right if possible
                if (currentItem.moveToNextItem() != null) {
                    currentItem = currentItem.moveToNextItem();
                } else {
                    //there is no next, so insert at end of list
                    currentItem.setNextItem(newItem);
                    newItem.setPrevItem(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                //newItem is less, insert before
                if (currentItem.moveToPrevItem() != null) {
                    currentItem.moveToPrevItem().setNextItem(newItem);
                    newItem.setPrevItem(currentItem.moveToPrevItem());
                    currentItem.setPrevItem(newItem);
                } else {
                    //the node with a previous is the root
                    newItem.setNextItem(this.root);
                    this.root.setPrevItem(newItem);
                    this.root=newItem;
                }
            } else {
                //equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
