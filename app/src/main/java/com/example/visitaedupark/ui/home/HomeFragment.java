package com.example.visitaedupark.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.visitaedupark.DataList;
import com.example.visitaedupark.MyListAdapter;
import com.example.visitaedupark.R;

public class HomeFragment extends Fragment {

    private HomeViewModel mViewModel;

    public static com.example.visitaedupark.ui.home.HomeFragment newInstance() {
        return new com.example.visitaedupark.ui.home.HomeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView=view.findViewById(R.id.recyclerView);
        MyListAdapter adapter=new MyListAdapter(setdataList());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        // TODO: Use the ViewModel
    }
    public DataList[] setdataList(){
        DataList[] myListData=new DataList[]{
                new DataList(R.drawable.ske,getString(R.string.ske),getString(R.string.monjalidet),getString(R.string.skedesc),"-7.767243, 110.354301"),
                new DataList(R.drawable.monjali,getString(R.string.monjali),getString(R.string.monjalidet),getString(R.string.monjalidesc),"-7.750292, 110.368673"),
                new DataList(R.drawable.gembiraloka,getString(R.string.glzoo),getString(R.string.kbnbinatang),getString(R.string.gzdesc),"-7.803907, 110.397957"),
                new DataList(R.drawable.jogjabay,getString(R.string.jbay),getString(R.string.jbdet),getString(R.string.jogjabaydesc),"-7.748150, 110.418810"),
                new DataList(R.drawable.merapipark,getString(R.string.merapipark),"Lahan edukasi di Indonesia",getString(R.string.mrpdesc),"-7.620692, 110.421681"),
                new DataList(R.drawable.tamanpintar,getString(R.string.tmpintar),"Pusat pendidikan di Yogyakarta",getString(R.string.tpdesc),"-7.800686, 110.367694"),
                new DataList(R.drawable.tebingbreksi,getString(R.string.tbbreksi),"Tujuan wisata edukasi di Indonesia",getString(R.string.tbdesc),"-7.781435, 110.504502"),
        };
        return myListData;
    }

}