package uz.exemple.less53_telegramui_appearance.model;

import java.util.ArrayList;

public class MainModel<T> {
    private ArrayList<T> itemList;
    private String itemText;

    public MainModel(ArrayList<T> itemList) {
        this.itemList = itemList;
    }

    public ArrayList<T> getItemList() {
        return itemList;
    }


}
