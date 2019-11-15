package com.sanjeeb.esoftwarica_sanjeeb.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sanjeeb.esoftwarica_sanjeeb.R;
import com.sanjeeb.esoftwarica_sanjeeb.adapter.StudentListApt;
import com.sanjeeb.esoftwarica_sanjeeb.model.DataSet;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    public RecyclerView recyclerView;
    View view;
    List<DataSet> studentList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.RcView);
        DataSet sd= new DataSet("Sanjeeb", "Pharping", "21", "male");

        studentList=sd.getSlist();


        if(studentList.isEmpty()){
    studentList.add(sd);

    studentList.add( new DataSet("supriya", "gathaghar", "20", "female"));


    sd.setSlist(studentList);

       }


        StudentListApt studentListApt = new StudentListApt(getActivity(), studentList);
        recyclerView.setAdapter(studentListApt);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }



}