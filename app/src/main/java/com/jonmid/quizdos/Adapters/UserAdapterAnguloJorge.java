package com.jonmid.quizdos.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jonmid.quizdos.IndexActivity;
import com.jonmid.quizdos.Models.UserModelAnguloJorge;
import com.jonmid.quizdos.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 10/10/2017.
 */

public class UserAdapterAnguloJorge extends RecyclerView.Adapter<UserAdapterAnguloJorge.ViewHolder> {
    List<UserModelAnguloJorge> userModelAnguloJorgeArrayList = new ArrayList<>();
    Context context;

    // Constructor de la clase
    public UserAdapterAnguloJorge(List<UserModelAnguloJorge> userModelAnguloJorgeList, Context context) {
        this.userModelAnguloJorgeArrayList = userModelAnguloJorgeList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Encargado de trabajar con el item.xml y sus componentes
        /*
        String i[]= new String[9];
        i[0]="https://i.pinimg.com/736x/e4/b9/63/e4b96313f833ef661f82e73f485109a1--iron-man-fondo-iron-man-wallpaper.jpg";
        i[1]="https://i.pinimg.com/736x/e4/b9/63/e4b96313f833ef661f82e73f485109a1--iron-man-fondo-iron-man-wallpaper.jpg";
        String j =i[(int)(Math.random()*9)];*/
        String a;
        holder.textViewname.setText(userModelAnguloJorgeArrayList.get(position).getName());
        holder.textViewusername.setText(userModelAnguloJorgeArrayList.get(position).getUsername());
        holder.textViewemail.setText(userModelAnguloJorgeArrayList.get(position).getEmail());
        holder.textViewphone.setText(userModelAnguloJorgeArrayList.get(position).getPhone());
        holder.textVienamecompany.setText(userModelAnguloJorgeArrayList.get(position).getNamecompany());
        holder.textViewaddress.setText(userModelAnguloJorgeArrayList.get(position).getAddress());

        //a= urlDetailsList.get(position).getUrl1();
        //Picasso.with(context).load(j).into(holder.imageViewcard);


    }

    @Override
    public int getItemCount() {
        return userModelAnguloJorgeArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewname;
        TextView textViewusername;
        TextView textViewemail;
        TextView textViewphone;
        TextView textVienamecompany;
        TextView textViewaddress;

        public ViewHolder(View item) {
            super(item);
            item.setOnClickListener(this);
            textViewname = (TextView) item.findViewById(R.id.id_tv_userinput_name);
            textViewusername = (TextView) item.findViewById(R.id.id_tv_userinput_username);
            textViewemail = (TextView) item.findViewById(R.id.id_tv_userinput_email);
            textViewphone = (TextView) item.findViewById(R.id.id_tv_userinput_phone);
            textVienamecompany= (TextView) item.findViewById(R.id.id_tv_userinput_namecompany);
            textViewaddress = (TextView) item.findViewById(R.id.id_tv_userinput_address);
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
