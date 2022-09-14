package uz.exemple.less53_telegramui_appearance.model;

import java.util.ArrayList;

public class FirstModel {
    private ArrayList<ThemeCardModel> cardList;
    private String title;

    public FirstModel(ArrayList<ThemeCardModel> cardList, String title) {
        this.cardList = cardList;
        this.title = title;
    }

    public ArrayList<ThemeCardModel> getCardList() {
        return cardList;
    }

    public String getTitle() {
        return title;
    }
}
