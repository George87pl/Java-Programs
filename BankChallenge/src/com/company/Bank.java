package com.company;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branches> branchesArrayList = new ArrayList<Branches>();

    public void addNewBranch(){
        branchesArrayList.add(new Branches());
    }

    public ArrayList<Branches> getBranchesArrayList() {
        return branchesArrayList;
    }
}
