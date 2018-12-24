package fragement;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.vaibhav.restaurantuicomidakit.R;


public class BottomSheetFragmentmap extends Fragment {
    public BottomSheetFragmentmap() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.item2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        FrameLayout bottomSheet = (FrameLayout) getActivity().findViewById(R.id.bottomSheet1);
        BottomSheetBehavior sheetBehavior = BottomSheetBehavior.from(bottomSheet);
        sheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                if (BottomSheetBehavior.STATE_COLLAPSED == newState) {
                    Log.d("BOTTOMSHEET", "collapsed");
                } else {
                    Log.d("BOTTOMSHEET", String.valueOf(newState));
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });

        sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
    }
}