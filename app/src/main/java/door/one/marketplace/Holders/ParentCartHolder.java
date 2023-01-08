package door.one.marketplace.Holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import door.one.marketplace.ItemClickListener.ItemClickListener;
import door.one.marketplace.R;


public class ParentCartHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    ///Last change 08.01.2023///
    public RecyclerView nestedrecer;
    public RoundedImageView roundedImagemaglogoparent;
    public AppCompatButton buylist;
    public TextView textitogParent;
    public ImageView imagedeletemag;
    RecyclerView.LayoutManager layoutManager;
    public ItemClickListener itemClickListener;

    public ParentCartHolder(View itemView) {
        super(itemView);
        nestedrecer=itemView.findViewById(R.id.nestedrecer);
        roundedImagemaglogoparent=itemView.findViewById(R.id.roundedImagemaglogoparent);
        textitogParent=itemView.findViewById(R.id.textitogParent);
        layoutManager = new LinearLayoutManager(itemView.getContext());
        nestedrecer.setHasFixedSize(true);
        nestedrecer.setLayoutManager(layoutManager);


        buylist=itemView.findViewById(R.id.buylist);
    }
    public void setItemClickListner(ItemClickListener listner){this.itemClickListener=listner;}

    @Override
    public void onClick(View view){

        itemClickListener.onClick(view,getAdapterPosition(),false);

    }
}
