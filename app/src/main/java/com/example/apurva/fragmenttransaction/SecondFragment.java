package com.example.apurva.fragmenttransaction;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    TextView details;
    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_second, container, false);

        details=v.findViewById(R.id.details);

        Bundle b=getArguments();
        String name=b.getString("name_key");
        String phone=b.getString("phone_key");

        details.setText("Name: "+name+"\nPhone"+phone);
        return v;
    }

}
