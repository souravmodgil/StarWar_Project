package com.starwar.view.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.starwar.R;
import com.starwar.databinding.ItemStarWarCharcaterBinding;
import com.starwar.model.StarWarCharacter;
import com.starwar.viewModel.ItemCharacterViewModel;

import java.util.Collections;
import java.util.List;

public class CharacaterAdapter extends RecyclerView.Adapter<CharacaterAdapter.CharacaterAdapterViewHolder> {

    private List<StarWarCharacter> starWarCharacterLists;

    public CharacaterAdapter() {this.starWarCharacterLists = Collections.emptyList();}

    @Override
    public CharacaterAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ItemStarWarCharcaterBinding itemUserBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_star_war_charcater ,parent, false);
        return new CharacaterAdapterViewHolder(itemUserBinding);
    }

    @Override
    public void onBindViewHolder(CharacaterAdapterViewHolder holder, int position) {
        holder.bindUser(starWarCharacterLists.get(position));

    }

    @Override
    public int getItemCount() {
        return  starWarCharacterLists.size();
    }

    public void setStarWarCharacterLists(List<StarWarCharacter> starWarCharacterLists) {
        this.starWarCharacterLists = starWarCharacterLists;
        notifyDataSetChanged();
    }

    public static class CharacaterAdapterViewHolder extends RecyclerView.ViewHolder {

        ItemStarWarCharcaterBinding mItemStarWarCharacterBinding;

        public CharacaterAdapterViewHolder(ItemStarWarCharcaterBinding mItemStarWarCharacterBinding) {
            super(mItemStarWarCharacterBinding.itemCharacter);
            this.mItemStarWarCharacterBinding = mItemStarWarCharacterBinding;
        }

        void bindUser(StarWarCharacter starWarCharacterList){
            if(mItemStarWarCharacterBinding.getCharacterViewModel() == null){
                mItemStarWarCharacterBinding.setCharacterViewModel(new ItemCharacterViewModel(starWarCharacterList, itemView.getContext()));
            }else {
                mItemStarWarCharacterBinding.getCharacterViewModel().setUser(starWarCharacterList);
            }
        }
    }
}

