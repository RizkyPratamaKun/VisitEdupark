package com.example.visitaedupark;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private DataList[] listdata;

    public MyListAdapter(DataList[] listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public MyListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View listitem=layoutInflater.inflate(R.layout.item_list, parent, false);
        ViewHolder viewHolder=new ViewHolder(listitem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyListAdapter.ViewHolder holder, int position) {
        final DataList dataList=listdata[position];
        final int image = dataList.getImageid();
        final String title=dataList.getTitle();
        final String detail=dataList.getdetail();
        final String deskripsi=dataList.getDeskripsi();
        final String longlat=dataList.getLonglat();

        holder.imageView.setImageResource(image);
        holder.textTitle.setText(title);
        holder.textdetail.setText(detail);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),image+"\n"+title+"\n"+detail+"\n"+deskripsi+"\n"+longlat, Toast.LENGTH_SHORT);
                Intent intent=new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra("image",image);
                intent.putExtra("title",title);
                intent.putExtra("detail",detail);
                intent.putExtra("deskripsi",deskripsi);
                intent.putExtra("longlat",longlat);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textTitle,textdetail;
        public CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.cardView=itemView.findViewById(R.id.cardView);

            this.imageView=itemView.findViewById(R.id.list_img);
            this.textTitle=itemView.findViewById(R.id.list_title);
            this.textdetail=itemView.findViewById(R.id.list_detail);
        }
    }
}
