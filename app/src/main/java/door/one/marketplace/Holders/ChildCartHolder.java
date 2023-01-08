package door.one.marketplace.Holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import door.one.marketplace.ItemClickListener.ItemClickListener;
import door.one.marketplace.R;


public class ChildCartHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    ///Last change 08.01.2023///
    public TextView textnamechild,textpricechildtovar,tovarminuschildto,tovarpluschildto,tovarcartchild;
    public RoundedImageView imagetovarchild;
    public ItemClickListener itemClickListener;
    public ChildCartHolder(@NonNull View itemView) {
        super(itemView);
        textnamechild=itemView.findViewById(R.id.textnamechild);
        textpricechildtovar=itemView.findViewById(R.id.textpricechildtovar);
        tovarminuschildto=itemView.findViewById(R.id.tovarminuschildto);
        tovarpluschildto=itemView.findViewById(R.id.tovarpluschildto);
        tovarcartchild=itemView.findViewById(R.id.tovarcartchild);
        imagetovarchild=itemView.findViewById(R.id.imagetovarchild);
    }
    public void setItemClickListner(ItemClickListener listner){this.itemClickListener=listner;}

    @Override
    public void onClick(View view) {

        itemClickListener.onClick(view, getAdapterPosition(), false);

    }
}
