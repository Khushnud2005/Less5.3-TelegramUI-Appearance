package uz.exemple.less53_telegramui_appearance.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.exemple.less53_telegramui_appearance.R;
import uz.exemple.less53_telegramui_appearance.model.MainModel;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private List<MainModel> mList;
    //private List <ItemModel> itemlList;
    //private List<String> list = new ArrayList<>();


    public MainAdapter(List<MainModel> mList) {
        this.mList = mList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       MainModel item = mList.get(position);


       holder.item_rv.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext()));

       ItemAdapter itemadapter= new ItemAdapter(item.getItemList());
       holder.item_rv.setAdapter(itemadapter);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView item_rv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_rv = itemView.findViewById(R.id.item_RV);

        }
    }
}
