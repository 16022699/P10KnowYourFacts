package demoswiper.android.myapplicationdev.com.p10_knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag1 extends Fragment {
    View v1;
    Button btnChangeColour1;


    public frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      v1 = inflater.inflate(R.layout.fragment_frag1, container, false);
        Button btnChangeColour1 = (Button)v1.findViewById(R.id.btnChange);

        btnChangeColour1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                v1.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(257), r.nextInt(258)));
            }
        });



                return v1;

        }
    }


