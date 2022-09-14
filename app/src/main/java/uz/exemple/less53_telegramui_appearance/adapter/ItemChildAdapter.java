package uz.exemple.less53_telegramui_appearance.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uz.exemple.less53_telegramui_appearance.R;
import uz.exemple.less53_telegramui_appearance.model.ThemeCardModel;

public class ItemChildAdapter extends RecyclerView.Adapter<ItemChildAdapter.ViewHolder> {

    private ArrayList<ThemeCardModel> cardList;

    public ItemChildAdapter(ArrayList<ThemeCardModel> cardList) {
        this.cardList = cardList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ThemeCardModel card = cardList.get(position);
        holder.cardImage.setImageResource(card.getThemeCards());
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView cardImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardImage = itemView.findViewById(R.id.iv_card_item);
        }
    }
}
