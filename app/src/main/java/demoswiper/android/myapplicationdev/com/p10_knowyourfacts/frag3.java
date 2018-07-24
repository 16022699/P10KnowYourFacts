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
public class frag3 extends Fragment {
    View v3;
    Button btnChangeColour3;



    public frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v3 = inflater.inflate(R.layout.fragment_frag3, container, false);
        Button btnChangeColour3 = (Button)v3.findViewById(R.id.btnChange);

        btnChangeColour3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                v3.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(257), r.nextInt(258)));
            }
        });

        return v3;

    }

}
