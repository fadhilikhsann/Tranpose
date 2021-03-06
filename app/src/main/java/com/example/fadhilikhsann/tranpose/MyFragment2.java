package com.example.fadhilikhsann.tranpose;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyFragment2 extends Fragment {
    EditText id11;
    EditText id12;
    EditText id13;
    EditText id21;
    EditText id22;
    EditText id23;
    EditText id31;
    EditText id32;
    EditText id33;
    Button submit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Layout tampilan untuk fragment ini
        return inflater.inflate(R.layout.activity_2x2, parent, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        final int[][] val= new int[2][2];
        final int[][] simpan = new int[2][2];
        id11=((EditText) view.findViewById(R.id.id11));
        id12=((EditText) view.findViewById(R.id.id12));
        id13=((EditText) view.findViewById(R.id.id13));
        id21=((EditText) view.findViewById(R.id.id21));
        id22=((EditText) view.findViewById(R.id.id22));
        id23=((EditText) view.findViewById(R.id.id23));
        id31=((EditText) view.findViewById(R.id.id31));
        id32=((EditText) view.findViewById(R.id.id32));
        id33=((EditText) view.findViewById(R.id.id33));
        submit=((Button) view.findViewById(R.id.submit));
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id11.getText().toString().matches("") || id12.getText().toString().matches("") ||
                   id21.getText().toString().matches("") || id22.getText().toString().matches(""))
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setMessage("Masih ada input yang kosong. Monggo diisi dulu.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
                    builder.setCancelable(true);
                    submit.setText("Gagal");
                }
                else{
                    val[0][0]=Integer.parseInt(id11.getText().toString());
                    val[0][1]=Integer.parseInt(id12.getText().toString());
                    val[1][0]=Integer.parseInt(id21.getText().toString());
                    val[1][1]=Integer.parseInt(id22.getText().toString());

                    for(int a=0;a<=1;a++){
                        for(int b=a;b<=1;b++){

                            simpan[a][b]=val[a][b];
                            val[a][b]=val[b][a];
                            val[b][a]=simpan[a][b];
                        }
                    }
                    id11.setText(Integer.toString(val[0][0]));
                    id12.setText(Integer.toString(val[0][1]));
                    id21.setText(Integer.toString(val[1][0]));
                    id22.setText(Integer.toString(val[1][1]));
                }



            }
        });
    }


}
