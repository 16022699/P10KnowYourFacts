package demoswiper.android.myapplicationdev.com.p10_knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;




public class frag2 extends Fragment {

    View v2;
    Button btnChangeColour2;


    public frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v2 = inflater.inflate(R.layout.fragment_frag2, container, false);
        Button btnChangeColour2 = (Button)v2.findViewById(R.id.btnChange);

        btnChangeColour2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                v2.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(257), r.nextInt(258)));
            }
        });



        return v2;

    }

}
