package com.example.bitsandpizzas;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author yuliiamelnyk on 29/06/2020
 * @project BitsAndPizzas
 */
public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {

    private String[] captions;
    private int[] imageIds;
    private Listener mListener;

    interface Listener {
        void onClick(int position);
    }

    public CaptionedImagesAdapter(String[] captions, int[] imageId) {
        this.captions = captions;
        this.imageIds = imageId;
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public void setListener(Listener listener){
        this.mListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_captioned_image, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final CardView cardView = holder.mCardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.info_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);
        TextView textView = (TextView) cardView.findViewById(R.id.info_text);
        textView.setText(captions[position]);

        cardView.setOnClickListener(v->{
            if (mListener!=null){
                mListener.onClick(position);
            }
        });
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private CardView mCardView;

        public ViewHolder(CardView cv){
            super(cv);
            mCardView = cv;
        }
    }
}
