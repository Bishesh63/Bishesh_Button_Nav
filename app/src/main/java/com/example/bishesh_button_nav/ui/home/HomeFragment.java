package com.example.bishesh_button_nav.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bishesh_button_nav.R;

import java.util.ArrayList;
import java.util.List;

import adapter.ESoftwaricaAdapter;
import model.ESoftwarica;

public class HomeFragment extends Fragment {

    static List<ESoftwarica> eSoftwaricaslist = new ArrayList<>();
    private RecyclerView recyclerview;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerview = root.findViewById(R.id.recycleview);


        ESoftwarica eSoftwarica1 = new ESoftwarica("Bishesh Man Singh", "Balkot", 24, "Male");
        eSoftwaricaslist = eSoftwarica1.getStudentList();

        if (eSoftwaricaslist.isEmpty()) {
            eSoftwaricaslist.add(new ESoftwarica("Bishesh Man Singh", "Balkot", 24, "Male"));
            eSoftwarica1.setStudentList(eSoftwaricaslist);
        }
        ESoftwaricaAdapter eSoftwaricaAdapter = new ESoftwaricaAdapter(getActivity(), eSoftwaricaslist);
        recyclerview.setAdapter(eSoftwaricaAdapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;
    }
}
