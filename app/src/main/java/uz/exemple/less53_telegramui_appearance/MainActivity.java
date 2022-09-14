package uz.exemple.less53_telegramui_appearance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import uz.exemple.less53_telegramui_appearance.adapter.MainAdapter;
import uz.exemple.less53_telegramui_appearance.model.ItemModel;
import uz.exemple.less53_telegramui_appearance.model.MainModel;
import uz.exemple.less53_telegramui_appearance.model.ThemeCardModel;

public class MainActivity extends AppCompatActivity {
    private ArrayList<MainModel> mList;
    private ArrayList<ItemModel> list;
    private ArrayList<ItemModel> list2;
    private ArrayList<ItemModel> list3;
    private ArrayList<ItemModel> list4;
    private ArrayList<ItemModel> list5;
    private RecyclerView recyclerView;
    private MainAdapter adapter;
    ArrayList<ThemeCardModel> cardList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }
    void initViews(){
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<ThemeCardModel> cardList = new ArrayList<>();
        cardList.add(new ThemeCardModel(R.drawable.card1));
        cardList.add(new ThemeCardModel(R.drawable.card2));
        cardList.add(new ThemeCardModel(R.drawable.card3));
        cardList.add(new ThemeCardModel(R.drawable.card1));
        cardList.add(new ThemeCardModel(R.drawable.card2));
        cardList.add(new ThemeCardModel(R.drawable.card3));
        cardList.add(new ThemeCardModel(R.drawable.card1));
        cardList.add(new ThemeCardModel(R.drawable.card2));
        cardList.add(new ThemeCardModel(R.drawable.card3));

        list = new ArrayList<ItemModel>();
        list.add(new ItemModel("Chat Themes",null,null,cardList,false,false));
        list.add(new ItemModel("Chat Background",null,null,null,false,false));

        list2 = new ArrayList<ItemModel>();
        list2.add(new ItemModel("Night Mode",null,null,null,true,false));
        list2.add(new ItemModel("Auto Night Mode",null,"System",null,false,false));

        list3 = new ArrayList<ItemModel>();
        list3.add(new ItemModel("In-App Browser","Open extremal links within the app",null,null,true,true));
        list3.add(new ItemModel("Direct Share","Show recent chats in Android share menu" ,null,null,true,false));
        list3.add(new ItemModel("Enable Animations",null,null,null,true,true));

        list4 = new ArrayList<ItemModel>();
        list4.add(new ItemModel("Large Emoji",null,null,null,true,true));
        list4.add(new ItemModel("Raise To Speak",null,null,null,true,false));
        list4.add(new ItemModel("Send With Enter",null,null,null,true,false));
        list4.add(new ItemModel("Save To Gallery",null,null,null,true,false));
        list4.add(new ItemModel("Distance Units",null,"Automatic",null,false,false));




        mList = new ArrayList<MainModel>();
        mList.add(new MainModel(list));
        mList.add(new MainModel(list2));
        mList.add(new MainModel(list3));
        mList.add(new MainModel(list4));

        adapter = new MainAdapter(mList);
        recyclerView.setAdapter(adapter);
    }
}