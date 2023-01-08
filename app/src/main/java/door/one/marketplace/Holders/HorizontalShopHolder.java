package door.one.marketplace.Holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import door.one.marketplace.ItemClickListener.ItemClickListener;
import door.one.marketplace.R;


public class HorizontalShopHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    ///Last change 08.01.2023///
    public TextView glavmagname,textstarg;
    public RoundedImageView imageGlavMag;
    public ItemClickListener itemClickListener;
public ImageView rateyellow1g,rateyellow2g,rateyellow3g,rateyellow4g,rateyellow5g;
    public HorizontalShopHolder(View itemView){
        super(itemView);
        glavmagname=itemView.findViewById(R.id.glavmagname);
        imageGlavMag=itemView.findViewById(R.id.imageGlavMag);
        rateyellow1g=itemView.findViewById(R.id.rateyellow1g);
        rateyellow2g=itemView.findViewById(R.id.rateyellow2g);
        textstarg=itemView.findViewById(R.id.textstarg);
        rateyellow3g=itemView.findViewById(R.id.rateyellow3g);
        rateyellow4g=itemView.findViewById(R.id.rateyellow4g);
        rateyellow5g=itemView.findViewById(R.id.rateyellow5g);
    }
    public void setItemClickListner(ItemClickListener listner){this.itemClickListener=listner;}

    @Override
    public void onClick(View view){
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }
}
