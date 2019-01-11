package com.yukselaggoz.whatsappuidesign.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.yukselaggoz.whatsappuidesign.Fragment.FragmentAramalar;
import com.yukselaggoz.whatsappuidesign.Fragment.FragmentDurum;
import com.yukselaggoz.whatsappuidesign.Fragment.FragmentSohbetler;

public class FragmentSayfalamaAdaptoru extends FragmentStatePagerAdapter {

    int tabSayisi;

    public FragmentSayfalamaAdaptoru(FragmentManager fm, int tabSayisi) {
        super(fm);
        this.tabSayisi = tabSayisi;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentSohbetler fs = new FragmentSohbetler();
                return fs;
            case 1:
                FragmentDurum fd = new FragmentDurum();
                return fd;
            case 2:
                FragmentAramalar fa = new FragmentAramalar();
                return fa;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabSayisi;
    }
}
