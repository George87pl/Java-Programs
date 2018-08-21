package com.company;

public abstract class ListItem {

    protected ListItem prev = null;
    protected ListItem next = null;

    protected Object value;

    protected ListItem(Object value) {
        this.value = value;
    }

    public abstract ListItem moveToNextItem();
    public abstract ListItem moveToPrevItem();
    public abstract ListItem setNextItem(ListItem next);
    public abstract ListItem setPrevItem(ListItem prev);

    abstract int compereTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}




