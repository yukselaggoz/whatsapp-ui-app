package com.yukselaggoz.whatsappuidesign.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.yukselaggoz.whatsappuidesign.Adapter.ListViewSohbetlerAdapter;
import com.yukselaggoz.whatsappuidesign.Model.Sohbetler;
import com.yukselaggoz.whatsappuidesign.R;

import java.util.ArrayList;

public class FragmentSohbetler extends Fragment {
    ArrayList<Sohbetler> sohbetler = new ArrayList<>();

    public void init() {
        sohbetler.add(new Sohbetler(0, "Yüksel Ağgöz", "Açıklama", "Dün", "https://scontent-frx5-1.cdninstagram.com/vp/5b9f78235c9da007f9a9d32279e1624b/5B4259AD/t51.2885-19/s320x320/28765410_169314927204728_5611473852824551424_n.jpg"));
        sohbetler.add(new Sohbetler(1, "Ali Ihsan Nehir", "Açıklama", "12:30", "https://scontent-frx5-1.cdninstagram.com/vp/ab425ce03a163da2b178da74f811119e/5B33C025/t51.2885-19/s320x320/28158485_167802307334498_557500262692945920_n.jpg"));
        sohbetler.add(new Sohbetler(3, "Arif Yıldırımçakar", "Açıklama", "İki gün önce", "https://scontent-frx5-1.cdninstagram.com/vp/c349cc227808c52139dceb2002182758/5B731479/t51.2885-19/s320x320/18444228_658292447695789_6193210706163138560_a.jpg"));
        sohbetler.add(new Sohbetler(2, "Taner Teker", "Açıklama", "Bir hafta önce", "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-1/p320x320/29468110_137808680385055_5994780408179326976_n.jpg?_nc_cat=0&oh=570f6ecfd28e96cac02e54d779f31580&oe=5B2D67EC"));
        sohbetler.add(new Sohbetler(4, "Naim Aslan", "Açıklama", "16.49", "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-1/c1.0.320.320/p320x320/19990152_10213514494927559_3222528328273873116_n.jpg?oh=312a646687eab8588941aab45ff13490&oe=5B44E47A"));
        sohbetler.add(new Sohbetler(0, "Yüksel Ağgöz", "Açıklama", "Dün", "https://scontent-frx5-1.cdninstagram.com/vp/5b9f78235c9da007f9a9d32279e1624b/5B4259AD/t51.2885-19/s320x320/28765410_169314927204728_5611473852824551424_n.jpg"));
        sohbetler.add(new Sohbetler(1, "Ali Ihsan Nehir", "Açıklama", "12:30", "https://scontent-frx5-1.cdninstagram.com/vp/ab425ce03a163da2b178da74f811119e/5B33C025/t51.2885-19/s320x320/28158485_167802307334498_557500262692945920_n.jpg"));
        sohbetler.add(new Sohbetler(3, "Arif Yıldırımçakar", "Açıklama", "İki gün önce", "https://scontent-frx5-1.cdninstagram.com/vp/c349cc227808c52139dceb2002182758/5B731479/t51.2885-19/s320x320/18444228_658292447695789_6193210706163138560_a.jpg"));
        sohbetler.add(new Sohbetler(2, "Taner Teker", "Açıklama", "Bir hafta önce", "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-1/p320x320/29468110_137808680385055_5994780408179326976_n.jpg?_nc_cat=0&oh=570f6ecfd28e96cac02e54d779f31580&oe=5B2D67EC"));
        sohbetler.add(new Sohbetler(4, "Naim Aslan", "Açıklama", "16.49", "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-1/c1.0.320.320/p320x320/19990152_10213514494927559_3222528328273873116_n.jpg?oh=312a646687eab8588941aab45ff13490&oe=5B44E47A"));
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_sohbetler, container, false);
        ListView lvSohbetler = view.findViewById(R.id.lv_sohbetler);
        init();
        ListViewSohbetlerAdapter adapter = new ListViewSohbetlerAdapter(getContext(), sohbetler);
        lvSohbetler.setAdapter(adapter);

        return view;
    }
}
