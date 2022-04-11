package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.projetws.R;

import beans.Etudiant;

public class EtudiantAdapter extends RecyclerView.Adapter<EtudiantAdapter.myviewholder>   {

    Etudiant []data;
    Context context;

    public EtudiantAdapter(Etudiant[] data, Context context)
    {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.activity_item_list,parent,false);

        return  new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position)
    {
        Etudiant datum=data[position];
        holder.tv.setText(datum.getNom()+" "+datum.getPrenom());
        Glide.with(holder.img.getContext()).load("http://10.0.2.2/WebAndroid_App/images/"+datum.getImage()).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView tv;

        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.imageholder);
            tv=(TextView)itemView.findViewById(R.id.theader);


        }
    }

}
