package com.jonmid.quizdos.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.quizdos.IndexActivity;
import com.jonmid.quizdos.Models.CommentModelAnguloJorge;
import com.jonmid.quizdos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 10/10/2017.
 */

public class CommentAdapterAnguloJorge  extends RecyclerView.Adapter<CommentAdapterAnguloJorge.ViewHolder> {

    List<CommentModelAnguloJorge> commentModelAnguloJorgeArrayList = new ArrayList<>();
    Context context;

    // Constructor de la clase
    public CommentAdapterAnguloJorge(List<CommentModelAnguloJorge> commentModelAnguloJorgeArrayList, Context context) {
        this.commentModelAnguloJorgeArrayList = commentModelAnguloJorgeArrayList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment_cardview, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    //jamideros@hotmail.com

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Encargado de trabajar con el item.xml y sus componentes
        /*
        String i[]= new String[9];
        i[0]="https://i.pinimg.com/736x/e4/b9/63/e4b96313f833ef661f82e73f485109a1--iron-man-fondo-iron-man-wallpaper.jpg";
        i[1]="https://i.pinimg.com/736x/e4/b9/63/e4b96313f833ef661f82e73f485109a1--iron-man-fondo-iron-man-wallpaper.jpg";
        String j =i[(int)(Math.random()*9)];*/
        String a;

        holder.TextViewemail.setText(commentModelAnguloJorgeArrayList.get(position).getEmail());
        holder.textViewname.setText(commentModelAnguloJorgeArrayList.get(position).getName());
        holder.textViewbody.setText(commentModelAnguloJorgeArrayList.get(position).getBody());

        //a= commentModelAnguloJorgeArrayList.get(position).();
        //Picasso.with(context).load(j).into(holder.imageViewcard);


    }

    @Override
    public int getItemCount() {
        return commentModelAnguloJorgeArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView TextViewemail;
        TextView textViewname;
        TextView textViewbody;
        ImageView img_item_cardview;

        public ViewHolder(View item) {
            super(item);
            item.setOnClickListener(this);
            textViewname = (TextView) item.findViewById(R.id.id_tv_userinput_name);
            TextViewemail = (TextView) item.findViewById(R.id.id_tv_userinput_username);
            textViewbody = (TextView) item.findViewById(R.id.id_tv_userinput_email);
            img_item_cardview = (ImageView) item.findViewById(R.id.id_img_comment_picasso);

        }

        @Override
        public void onClick(View view) {
            Context contextitem = view.getContext();
            Intent inten = new Intent(contextitem,IndexActivity.class);
            contextitem.startActivity(inten);

            //Toast.makeText(context,"click en el item",Toast.LENGTH_SHORT).show();
        }
    }





}
