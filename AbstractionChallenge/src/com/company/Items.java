package com.company;


public class Items extends ListItem {

    public Items(Object value) {
        super(value);
    }

    @Override
    public ListItem moveToNextItem() {
        return this.next;
    }

    @Override
    public ListItem moveToPrevItem() {
        return this.prev;
    }

    @Override
    public ListItem setNextItem(ListItem next) {
        this.next = next;
        return this.next;
    }

    @Override
    public ListItem setPrevItem(ListItem prev) {
        this.prev = prev;
        return this.prev;
    }

    @Override
    int compereTo(ListItem item) {
        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
