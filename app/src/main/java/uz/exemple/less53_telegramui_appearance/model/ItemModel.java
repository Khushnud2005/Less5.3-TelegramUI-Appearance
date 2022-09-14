package uz.exemple.less53_telegramui_appearance.model;

import java.util.ArrayList;

public class ItemModel {

    private String title;
    private String desc = null;
    private String text2 = null;
    private ArrayList<ThemeCardModel>cardList=null;
    private boolean switch1 = false;
    private boolean switchOnOff = false;


    public ItemModel( String title, String desc,String text2, ArrayList<ThemeCardModel>cardList,boolean switch1,boolean switchOnOff) {

        this.title = title;
        this.desc = desc;
        this.text2 = text2;
        this.cardList = cardList;
        this.switch1 = switch1;
        this.switchOnOff= switchOnOff;
    }


    public String getDesc() {
        return desc;
    }
    public String text2() {
        return text2;
    }
    public String getTitle() {
        return title;
    }

    public ArrayList<ThemeCardModel> getCardList() {
        return cardList;
    }

    public String getText2() {
        return text2;
    }

    public boolean isSwitch1() {
        return switch1;
    }

    public boolean isSwitchOnOff() {
        return switchOnOff;
    }
}
