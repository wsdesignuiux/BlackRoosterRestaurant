package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import fragement.Viewpager1;
import fragement.Viewpager2;

public class ViewpagerAdapter extends FragmentStatePagerAdapter {
    public ViewpagerAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                Viewpager1 tab1 = new Viewpager1();
                return tab1;
            case 1:
                Viewpager2 tab2 = new Viewpager2();
                return  tab2;
                default:
                    return null;

        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
