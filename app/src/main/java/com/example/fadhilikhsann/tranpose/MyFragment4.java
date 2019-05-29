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

public class MyFragment4 extends Fragment {
    EditText id11;
    EditText id12;
    EditText id13;
    EditText id14;
    EditText id21;
    EditText id22;
    EditText id23;
    EditText id24;
    EditText id31;
    EditText id32;
    EditText id33;
    EditText id34;
    EditText id41;
    EditText id42;
    EditText id43;
    EditText id44;
    Button submit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Layout tampilan untuk fragment ini
        return inflater.inflate(R.layout.activity_4x4, parent, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        final int[][] val= new int[4][4];
        final int[][] simpan = new int[4][4];
        id11=((EditText) view.findViewById(R.id.id11));
        id12=((EditText) view.findViewById(R.id.id12));
        id13=((EditText) view.findViewById(R.id.id13));
        id14=((EditText) view.findViewById(R.id.id14));
        id21=((EditText) view.findViewById(R.id.id21));
        id22=((EditText) view.findViewById(R.id.id22));
        id23=((EditText) view.findViewById(R.id.id23));
        id24=((EditText) view.findViewById(R.id.id24));
        id31=((EditText) view.findViewById(R.id.id31));
        id32=((EditText) view.findViewById(R.id.id32));
        id33=((EditText) view.findViewById(R.id.id33));
        id34=((EditText) view.findViewById(R.id.id34));
        id41=((EditText) view.findViewById(R.id.id41));
        id42=((EditText) view.findViewById(R.id.id42));
        id43=((EditText) view.findViewById(R.id.id43));
        id44=((EditText) view.findViewById(R.id.id44));
        submit=((Button) view.findViewById(R.id.submit));
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id11.getText().toString().matches("") || id12.getText().toString().matches("") || id13.getText().toString().matches("") ||id14.getText().toString().matches("") ||
                        id21.getText().toString().matches("") || id22.getText().toString().matches("") || id23.getText().toString().matches("") || id24.getText().toString().matches("") ||
                        id31.getText().toString().matches("") || id32.getText().toString().matches("") || id33.getText().toString().matches("") || id34.getText().toString().matches("") ||
                        id41.getText().toString().matches("") || id42.getText().toString().matches("") || id43.getText().toString().matches("") || id44.getText().toString().matches(""))
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setMessage("Masih ada input yang kosong. Monggo diisi dulu.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
                    builder.setCancelable(true);

                }
                else{
                    val[0][0]=Integer.parseInt(id11.getText().toString());
                    val[0][1]=Integer.parseInt(id12.getText().toString());
                    val[0][2]=Integer.parseInt(id13.getText().toString());
                    val[0][3]=Integer.parseInt(id14.getText().toString());
                    val[1][0]=Integer.parseInt(id21.getText().toString());
                    val[1][1]=Integer.parseInt(id22.getText().toString());
                    val[1][2]=Integer.parseInt(id23.getText().toString());
                    val[1][3]=Integer.parseInt(id24.getText().toString());
                    val[2][0]=Integer.parseInt(id31.getText().toString());
                    val[2][1]=Integer.parseInt(id32.getText().toString());
                    val[2][2]=Integer.parseInt(id33.getText().toString());
                    val[2][3]=Integer.parseInt(id34.getText().toString());
                    val[3][0]=Integer.parseInt(id41.getText().toString());
                    val[3][1]=Integer.parseInt(id42.getText().toString());
                    val[3][2]=Integer.parseInt(id43.getText().toString());
                    val[3][3]=Integer.parseInt(id44.getText().toString());

                    for(int a=0;a<=3;a++){
                        for(int b=a;b<=3;b++){
                            simpan[a][b]=val[a][b];
                            val[a][b]=val[b][a];
                            val[b][a]=simpan[a][b];
                        }
                    }
                    id11.setText(Integer.toString(val[0][0]));
                    id12.setText(Integer.toString(val[0][1]));
                    id13.setText(Integer.toString(val[0][2]));
                    id14.setText(Integer.toString(val[0][3]));
                    id21.setText(Integer.toString(val[1][0]));
                    id22.setText(Integer.toString(val[1][1]));
                    id23.setText(Integer.toString(val[1][2]));
                    id24.setText(Integer.toString(val[1][3]));
                    id31.setText(Integer.toString(val[2][0]));
                    id32.setText(Integer.toString(val[2][1]));
                    id33.setText(Integer.toString(val[2][2]));
                    id34.setText(Integer.toString(val[2][3]));
                    id41.setText(Integer.toString(val[3][0]));
                    id42.setText(Integer.toString(val[3][1]));
                    id43.setText(Integer.toString(val[3][2]));
                    id44.setText(Integer.toString(val[3][3]));
                }

            }
        });
    }


}


