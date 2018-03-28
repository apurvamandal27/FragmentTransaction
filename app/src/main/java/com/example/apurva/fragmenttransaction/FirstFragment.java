package com.example.apurva.fragmenttransaction;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    Button submit;
    EditText name,phone;
    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_first, container, false);

        submit=v.findViewById(R.id.btn_submit);
        name=v.findViewById(R.id.name);
        phone=v.findViewById(R.id.phone);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String n= name.getText().toString();
               String p= phone.getText().toString();

               Bundle bundle=new Bundle();
               bundle.putString("name_key",n);
               bundle.putString("phone_key",p);

               SecondFragment secondFragment=new SecondFragment();

               secondFragment.setArguments(bundle);

                //to show second fragment
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();

                ft.replace(R.id.main_page,secondFragment);
                ft.commit();


            }
        });

        return v;
    }

}
