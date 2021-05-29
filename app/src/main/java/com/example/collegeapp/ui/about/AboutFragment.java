package com.example.collegeapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.collegeapp.R;

import java.util.ArrayList;
import java.util.List;


public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp, "Information Technology", "The motto of our department is to provide quality technical education to students, which will lead them sustain peaks in the field of technology. Department of Information Technology has labs equipped with high configuration machines and latest software’s required for teaching/learning process and research."));
        list.add(new BranchModel(R.drawable.ic_mech,"Mechanical Engineering", "Mechanical Engineering envisages the development, design, manufacturing and maintenance of machinery. The present age demands Mechanical Engineering specialists who have the capacity of adaptability and creativity in the new technical areas."));

        adapter = new BranchAdapter(getContext(), list);

        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/vit-community-app.appspot.com/o/gallery%2F%5BB%40dbff2bfjpg?alt=media&token=c1ce2fef-9ba9-4ebe-b0b1-f68ca333f822").into(imageView);


        return view;


    }
}