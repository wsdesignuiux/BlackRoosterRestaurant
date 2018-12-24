package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import fragement.Detaile;
import fragement.Menu;
import fragement.Reviews;


public class Tab_adapter extends FragmentStatePagerAdapter {
    int mnooftabs;

    public Tab_adapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.mnooftabs = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Detaile tab1 = new Detaile();
                return tab1;
            case 1:
                Menu tab2 = new Menu();
                return tab2;
            case 2:
                Reviews tab3 = new Reviews();
                return tab3;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return mnooftabs;
    }
}
