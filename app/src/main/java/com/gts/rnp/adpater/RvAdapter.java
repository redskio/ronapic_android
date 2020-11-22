package com.gts.rnp.adpater;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.gts.rnp.DetailActivity;
import com.gts.rnp.GuideActivity;
import com.gts.rnp.R;

import java.util.ArrayList;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.CustomViewHolder> {

        private Context context;
        private ArrayList<TravelSet> travelSets;
        public RvAdapter(Context context, ArrayList<TravelSet> travelSets) {
            this.context = context;
            this.travelSets = travelSets;
        }

        @Override
        public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            CustomViewHolder viewHolder = new CustomViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(CustomViewHolder holder, final int position) {
            Log.v("holder",Integer.toString(position));
            final TravelSet travelSet = travelSets.get(position);
            holder.cardImg.setImageResource(travelSet.getImage());

            holder.content.setText(travelSet.getText());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, GuideActivity.class);
                    intent.putExtra("title",travelSet.getText());
                    intent.putExtra("index",position);
                    context.startActivity(intent);

                }
            });
        //    holder.title.setText(item + "");
        //    holder.content.setText(item + "content");
        }

        @Override
        public int getItemCount() {
            return 5;
        }

        public class CustomViewHolder extends RecyclerView.ViewHolder {
            ImageView cardImg;
            TextView content;
            public CustomViewHolder(final View itemView) {
                super(itemView);
                cardImg = itemView.findViewById(R.id.cardImageView);
                content = itemView.findViewById(R.id.contentText);

            }
        }

    }

