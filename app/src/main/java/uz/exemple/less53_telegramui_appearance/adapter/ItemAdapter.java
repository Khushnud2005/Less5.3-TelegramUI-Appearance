package uz.exemple.less53_telegramui_appearance.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.switchmaterial.SwitchMaterial;

import java.util.ArrayList;

import uz.exemple.less53_telegramui_appearance.R;
import uz.exemple.less53_telegramui_appearance.model.ItemModel;
import uz.exemple.less53_telegramui_appearance.model.ThemeCardModel;


public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private ArrayList<ItemModel> itemList;
    private ArrayList<ThemeCardModel> cardList;

    public ItemAdapter(ArrayList<ItemModel> itemList) {
        this.itemList = itemList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_child,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemModel item = itemList.get(position);
        if (item.getCardList() !=null && position<=1){
            holder.switch1.setVisibility(View.GONE);
        }

        holder.tv_childTitle.setText(item.getTitle());

        if (item.getDesc()!=null){
            holder.tv_childDesc.setText(item.getDesc());
            holder.tv_childDesc.setVisibility(View.VISIBLE);
        }
        if (item.getText2()!=null){
            holder.tv_text2.setVisibility(View.VISIBLE);
            holder.tv_text2.setText(item.getText2());
        }
        if (item.isSwitch1()){
            holder.switch1.setVisibility(View.VISIBLE);
            holder.switch1.setChecked(item.isSwitchOnOff());
            holder.iv_childRight.setVisibility(View.GONE);
        }
        if (item.getCardList()!=null ){
            ArrayList<ThemeCardModel> cardList = item.getCardList();
            ItemChildAdapter adapter= new ItemChildAdapter(cardList);
            holder.rv_theme_cards.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext(),LinearLayoutManager.HORIZONTAL,false));

            holder.rv_theme_cards.setAdapter(adapter);
        }
        if (position==itemList.size()-1){
            holder.Ll_line.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView iv_childRight;
        TextView tv_childTitle;
        LinearLayout Ll_line;
        TextView tv_childDesc;
        TextView tv_text2;
        SwitchMaterial switch1;
        RecyclerView rv_theme_cards;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rv_theme_cards = itemView.findViewById(R.id.rv_theme_cards);
            iv_childRight = itemView.findViewById(R.id.iv_childRight);
            tv_childTitle = itemView.findViewById(R.id.tv_childTitle);
            tv_childDesc = itemView.findViewById(R.id.tv_childDesc);
            tv_text2 = itemView.findViewById(R.id.tv_text2);
            Ll_line = itemView.findViewById(R.id.Ll_line);
            switch1 = itemView.findViewById(R.id.switch1);
        }
    }
    ArrayList<ThemeCardModel> getCardList(){

        ArrayList<ThemeCardModel> cardList = new ArrayList<>();



        return cardList;

    }
}
