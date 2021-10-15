package com.example.siddur3;

import static java.util.Objects.requireNonNull;

import android.os.Bundle;
import android.text.Html;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView a_m_ashrei, a_m_shmona_esrei_1,a_m_ayt_1,a_m_shmona_esrei_2,a_m_morid_hatal,a_m_mashiv_harauch,
            a_m_shmona_esrei_3,a_m_ayt_2,a_m_shmona_esrei_4,a_m_hakel_hakadosh,a_m_hamelech_hakadosh,
            a_m_shmona_esrei_5,a_m_veten_beracha,a_m_tal_umatar,a_m_shmona_esrei_6,a_m_melech_ohev,
            a_m_hamelech_hamishpat,a_m_shmona_esrei_7,a_m_tisha_baav,a_m_shmona_esrei_8,a_m_fast_day,
            a_m_shmona_esrei_9,a_m_rosh_chodesh,a_m_pesach,a_m_sukkos,a_m_shmona_esrei_10,a_m_chanukah,
            a_m_purim,a_m_shmona_esrei_11,a_m_ayt_3,a_m_shmona_esrei_12,a_m_ayt_4,a_m_shmona_esrei_13,
            a_m_ayt_end,a_m_shmona_esrei_end,a_m_chazarat_hashatz_1,a_m_ch_ayt_1,a_m_chazarat_hashatz_2,
            a_m_ch_morid_hatal,a_m_ch_mashiv_harauch,a_m_chazarat_hashatz_3,a_m_ch_ayt_2,a_m_chazarat_hashatz_4,
            a_m_ch_hakel_hakadosh,a_m_ch_hamelech_hakadosh,a_m_chazarat_hashatz_5,a_m_ch_fast_day,
            a_m_chazarat_hashatz_6,a_m_ch_veten_beracha,a_m_ch_tal_umatar,a_m_chazarat_hashatz_7,a_m_ch_melech_ohev,
            a_m_ch_hamelech_hamishpat,a_m_chazarat_hashatz_8,a_m_ch_tisha_baav,a_m_chazarat_hashatz_9,
            a_m_ch_rosh_chodesh,a_m_ch_pesach,a_m_ch_sukkos,a_m_chazarat_hashatz_10,a_m_ch_chanukah,
            a_m_ch_purim,a_m_chazarat_hashatz_11,a_m_ch_ayt_3,a_m_chazarat_hashatz_12,a_m_ch_ayt_4,
            a_m_chazarat_hashatz_13,a_m_avinu_malkainu_fast_day,a_m_avinu_malkainu_ayt,a_m_tachanun,a_m_alainu;




    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        minchaInit();
        holidays();
    }

        private void holidays() {

            String date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());

            ArrayList<Date> rosh_chodesh = new ArrayList<>();
            rosh_chodesh.add(new Date(2021, 10, 6));
            rosh_chodesh.add(new Date(2021, 10, 7));
            rosh_chodesh.add(new Date(2021, 11, 5));
            rosh_chodesh.add(new Date(2021, 12, 4));
            rosh_chodesh.add(new Date(2021, 12, 5));
            rosh_chodesh.add(new Date(2022, 1, 3));
            rosh_chodesh.add(new Date(2022, 2, 1));
            rosh_chodesh.add(new Date(2022, 2, 2));
            rosh_chodesh.add(new Date(2022, 3, 3));
            rosh_chodesh.add(new Date(2022, 3, 4));
            rosh_chodesh.add(new Date(2022, 4, 2));
            rosh_chodesh.add(new Date(2022, 5, 1));
            rosh_chodesh.add(new Date(2022, 5, 2));
            rosh_chodesh.add(new Date(2022, 5, 31));
            rosh_chodesh.add(new Date(2022, 6, 29));
            rosh_chodesh.add(new Date(2022, 6, 30));
            rosh_chodesh.add(new Date(2022, 7, 29));
            rosh_chodesh.add(new Date(2022, 8, 27));
            rosh_chodesh.add(new Date(2022, 8, 28));
            rosh_chodesh.add(new Date(2022, 9, 26));
            rosh_chodesh.add(new Date(2022, 10, 25));
            rosh_chodesh.add(new Date(2022, 10, 26));
            rosh_chodesh.add(new Date(2022, 11, 24));
            rosh_chodesh.add(new Date(2022, 11, 25));
            rosh_chodesh.add(new Date(2022, 12, 24));
            rosh_chodesh.add(new Date(2022, 12, 25));
            rosh_chodesh.add(new Date(2023, 1, 23));

            ArrayList<Date> purim = new ArrayList<>();

            purim.add(new Date(2021,2,26));
            purim.add(new Date(2021, 2, 26));
            purim.add(new Date(2022, 3, 17));
            purim.add(new Date(2023, 3, 7));
            purim.add(new Date(2021, 9, 19));


            ArrayList<Date> shushan_purim = new ArrayList<>();
            shushan_purim.add(new Date(2021, 2, 27));
            shushan_purim.add(new Date(2022, 3, 18));
            shushan_purim.add(new Date(2023, 3, 8));

            ArrayList<Date> pesach = new ArrayList<>();
            pesach.add(new Date(2021, 3, 28));
            pesach.add(new Date(2021, 3, 29));
            pesach.add(new Date(2021, 3, 30));
            pesach.add(new Date(2021, 3, 31));
            pesach.add(new Date(2021, 4, 1));
            pesach.add(new Date(2021, 4, 2));
            pesach.add(new Date(2021, 4, 3));

            pesach.add(new Date(2022, 4, 16));
            pesach.add(new Date(2022, 4, 17));
            pesach.add(new Date(2022, 4, 18));
            pesach.add(new Date(2022, 4, 19));
            pesach.add(new Date(2022, 4, 20));
            pesach.add(new Date(2022, 4, 21));
            pesach.add(new Date(2022, 4, 22));

            pesach.add(new Date(2023, 4, 6));
            pesach.add(new Date(2023, 4, 7));
            pesach.add(new Date(2023, 4, 8));
            pesach.add(new Date(2023, 4, 9));
            pesach.add(new Date(2023, 4, 10));
            pesach.add(new Date(2023, 4, 11));
            pesach.add(new Date(2023, 4, 12));

            ArrayList<Date> sukkos = new ArrayList<>();
            sukkos.add(new Date(2021, 9, 21));
            sukkos.add(new Date(2021, 9, 22));
            sukkos.add(new Date(2021, 9, 23));
            sukkos.add(new Date(2021, 9, 24));
            sukkos.add(new Date(2021, 9, 25));
            sukkos.add(new Date(2021, 9, 26));
            sukkos.add(new Date(2021, 9, 27));

            sukkos.add(new Date(2022, 9, 10));
            sukkos.add(new Date(2022, 9, 11));
            sukkos.add(new Date(2022, 9, 12));
            sukkos.add(new Date(2022, 9, 13));
            sukkos.add(new Date(2022, 9, 14));
            sukkos.add(new Date(2022, 9, 15));
            sukkos.add(new Date(2022, 9, 16));

            sukkos.add(new Date(2023, 9, 30));
            sukkos.add(new Date(2023, 10, 1));
            sukkos.add(new Date(2023, 10, 2));
            sukkos.add(new Date(2023, 10, 3));
            sukkos.add(new Date(2023, 10, 4));
            sukkos.add(new Date(2023, 10, 5));
            sukkos.add(new Date(2023, 10, 6));

            ArrayList<Date> chanukah = new ArrayList<>();
            chanukah.add(new Date(2021, 11,29));
            chanukah.add(new Date(2021, 11,30));
            chanukah.add(new Date(2021, 11,31));
            chanukah.add(new Date(2021, 12,1));
            chanukah.add(new Date(2021, 12,2));
            chanukah.add(new Date(2021, 12,3));
            chanukah.add(new Date(2021, 12,4));
            chanukah.add(new Date(2021, 12,5));

            chanukah.add(new Date(2022, 12,19));
            chanukah.add(new Date(2022, 12,20));
            chanukah.add(new Date(2022, 12,21));
            chanukah.add(new Date(2022, 12,22));
            chanukah.add(new Date(2022, 12,23));
            chanukah.add(new Date(2022, 12,24));
            chanukah.add(new Date(2022, 12,25));
            chanukah.add(new Date(2022, 12,26));

            chanukah.add(new Date(2023, 12,8));
            chanukah.add(new Date(2023, 12,9));
            chanukah.add(new Date(2023, 12,10));
            chanukah.add(new Date(2023, 12,11));
            chanukah.add(new Date(2023, 12,12));
            chanukah.add(new Date(2023, 12,13));
            chanukah.add(new Date(2023, 12,14));
            chanukah.add(new Date(2023, 12,15));

            ArrayList<Date> tisha_baav = new ArrayList<>();
            tisha_baav.add(new Date(2022, 8, 7));
            tisha_baav.add(new Date(2023, 7, 27));
            tisha_baav.add(new Date(2024, 8, 13));

            ArrayList<Date> tzom_gedalya = new ArrayList<>();
            tzom_gedalya.add(new Date(2022, 9, 28));
            tzom_gedalya.add(new Date(2023, 9, 18));
            tzom_gedalya.add(new Date(2024, 10, 6));

            ArrayList<Date> asara_betevet = new ArrayList<>();
            asara_betevet.add(new Date(2021, 12, 14));
            asara_betevet.add(new Date(2023, 1, 3));
            asara_betevet.add(new Date(2023, 12, 22));

            ArrayList<Date> taanis_ester = new ArrayList<>();
            taanis_ester.add(new Date(2022, 3, 16));
            taanis_ester.add(new Date(2023, 3, 6));
            taanis_ester.add(new Date(2024, 3, 21));

            ArrayList<Date> shivaAsar_betammuz = new ArrayList<>();
            shivaAsar_betammuz.add(new Date(2022, 7, 17));
            shivaAsar_betammuz.add(new Date(2023, 7, 6));
            shivaAsar_betammuz.add(new Date(2024, 6, 23));


            for (int i = 0; i < rosh_chodesh.size(); i++) {
                if (rosh_chodesh.get(i).toString().equals(date)) {
                    a_m_tachanun.setVisibility(View.GONE);
                    a_m_rosh_chodesh.setVisibility(View.VISIBLE);
                    a_m_ch_rosh_chodesh.setVisibility(View.VISIBLE);
                }

            }

            for (int i = 0; i < purim.size(); i++) {
                if (purim.get(i).toString().equals(date)) {
                    a_m_ch_purim.setVisibility(View.VISIBLE);
                    a_m_purim.setVisibility(View.VISIBLE);
                    a_m_tachanun.setVisibility(View.GONE);


                }

            }

            for (int i = 0; i < shushan_purim.size(); i++) {
                if (shushan_purim.get(i).toString().equals(date)) {
                    a_m_tachanun.setVisibility(View.GONE);
                    a_m_ch_purim.setVisibility(View.VISIBLE);
                    a_m_purim.setVisibility(View.VISIBLE);
                }

            }

            for (int i = 0; i < chanukah.size(); i++) {
                if (chanukah.get(i).toString().equals(date)) {
                    a_m_ch_chanukah.setVisibility(View.VISIBLE);
                    a_m_tachanun.setVisibility(View.GONE);

                }

            }

            for (int i = 0; i < pesach.size(); i++) {
                if (pesach.get(i).toString().equals(date)) {
                    a_m_tachanun.setVisibility(View.GONE);
                    a_m_ch_pesach.setVisibility(View.VISIBLE);
                    a_m_pesach.setVisibility(View.VISIBLE);
                }

            }

            for (int i = 0; i < sukkos.size(); i++) {
                if (sukkos.get(i).toString().equals(date)) {
                    a_m_tachanun.setVisibility(View.GONE);
                    a_m_ch_sukkos.setVisibility(View.VISIBLE);
                    a_m_sukkos.setVisibility(View.VISIBLE);
                }

            }
            for (int i = 0; i < tisha_baav.size(); i++) {
                if (tisha_baav.get(i).toString().equals(date)) {
                    a_m_ch_tisha_baav.setVisibility(View.VISIBLE);
                    a_m_tisha_baav.setVisibility(View.VISIBLE);
                    a_m_avinu_malkainu_fast_day.setVisibility(View.VISIBLE);
                }
            }

                for (int i = 0; i < tzom_gedalya.size(); i++) {
                    if (tzom_gedalya.get(i).toString().equals(date)) {
                        a_m_ch_fast_day.setVisibility(View.VISIBLE);
                        a_m_fast_day.setVisibility(View.VISIBLE);
                        a_m_avinu_malkainu_fast_day.setVisibility(View.VISIBLE);
                    }

                }

            for (int i = 0; i < asara_betevet.size(); i++) {
                if (asara_betevet.get(i).toString().equals(date)) {
                    a_m_ch_fast_day.setVisibility(View.VISIBLE);
                    a_m_fast_day.setVisibility(View.VISIBLE);
                    a_m_avinu_malkainu_fast_day.setVisibility(View.VISIBLE);
                }

            }

            for (int i = 0; i < taanis_ester.size(); i++) {
                if (taanis_ester.get(i).toString().equals(date)) {
                    a_m_ch_fast_day.setVisibility(View.VISIBLE);
                    a_m_fast_day.setVisibility(View.VISIBLE);
                    a_m_avinu_malkainu_fast_day.setVisibility(View.VISIBLE);
                }

            }
            for (int i = 0; i < shivaAsar_betammuz.size(); i++) {
                if (shivaAsar_betammuz.get(i).toString().equals(date)) {
                    a_m_ch_fast_day.setVisibility(View.VISIBLE);
                    a_m_fast_day.setVisibility(View.VISIBLE);
                    a_m_avinu_malkainu_fast_day.setVisibility(View.VISIBLE);
                }

            }













        }
     //dates
    private void minchaInit() {
        a_m_ashrei = findViewById(R.id.a_m_ashrei);
        a_m_shmona_esrei_1 = findViewById(R.id.a_m_shmona_esrei_1);
        a_m_ayt_1 = findViewById(R.id.a_m_ayt_1);
        a_m_shmona_esrei_2 = findViewById(R.id.a_m_shmona_esrei_2);
        a_m_morid_hatal = findViewById(R.id.a_m_morid_hatal);
        a_m_mashiv_harauch = findViewById(R.id.a_m_mashiv_harauch);
        a_m_shmona_esrei_3 = findViewById(R.id.a_m_shmona_esrei_3);
        a_m_ayt_2 = findViewById(R.id.a_m_ayt_2);
        a_m_shmona_esrei_4 = findViewById(R.id.a_m_shmona_esrei_4);
        a_m_hakel_hakadosh = findViewById(R.id.a_m_hakel_hakadosh);
        a_m_hamelech_hakadosh = findViewById(R.id.a_m_hamelech_hakadosh);
        a_m_shmona_esrei_5 = findViewById(R.id.a_m_shmona_esrei_5);
        a_m_veten_beracha = findViewById(R.id.a_m_veten_beracha);
        a_m_tal_umatar = findViewById(R.id.a_m_tal_umatar);
        a_m_shmona_esrei_6 = findViewById(R.id.a_m_shmona_esrei_6);
        a_m_melech_ohev = findViewById(R.id.a_m_melech_ohev);
        a_m_hamelech_hamishpat = findViewById(R.id.a_m_hamelech_hamishpat);
        a_m_shmona_esrei_7 = findViewById(R.id.a_m_shmona_esrei_7);
        a_m_tisha_baav = findViewById(R.id.a_m_tisha_baav);
        a_m_shmona_esrei_8 = findViewById(R.id.a_m_shmona_esrei_8);
        a_m_fast_day = findViewById(R.id.a_m_fast_day);
        a_m_shmona_esrei_9 = findViewById(R.id.a_m_shmona_esrei_9);
        a_m_rosh_chodesh = findViewById(R.id.a_m_rosh_chodesh);
        a_m_pesach = findViewById(R.id.a_m_pesach);
        a_m_sukkos = findViewById(R.id.a_m_sukkos);
        a_m_shmona_esrei_10 = findViewById(R.id.a_m_shmona_esrei_10);
        a_m_chanukah = findViewById(R.id.a_m_chanukah);
        a_m_purim = findViewById(R.id.a_m_purim);
        a_m_shmona_esrei_11 = findViewById(R.id.a_m_shmona_esrei_11);
        a_m_ayt_3 = findViewById(R.id.a_m_ayt_3);
        a_m_shmona_esrei_12 = findViewById(R.id.a_m_shmona_esrei_12);
        a_m_ayt_4 = findViewById(R.id.a_m_ayt_4);
        a_m_shmona_esrei_13 = findViewById(R.id.a_m_shmona_esrei_13);
        a_m_ayt_end = findViewById(R.id.a_m_ayt_end);
        a_m_shmona_esrei_end = findViewById(R.id.a_m_shmona_esrei_end);
        a_m_chazarat_hashatz_1 = findViewById(R.id.a_m_chazarat_hashatz_1);
        a_m_ch_ayt_1 = findViewById(R.id.a_m_ch_ayt_1);
        a_m_chazarat_hashatz_2 = findViewById(R.id.a_m_chazarat_hashatz_2);
        a_m_ch_morid_hatal = findViewById(R.id.a_m_ch_morid_hatal);
        a_m_ch_mashiv_harauch = findViewById(R.id.a_m_ch_mashiv_harauch);
        a_m_chazarat_hashatz_3 = findViewById(R.id.a_m_chazarat_hashatz_3);
        a_m_ch_ayt_2 = findViewById(R.id.a_m_ch_ayt_2);
        a_m_chazarat_hashatz_4 = findViewById(R.id.a_m_chazarat_hashatz_4);
        a_m_ch_hakel_hakadosh = findViewById(R.id.a_m_ch_hakel_hakadosh);
        a_m_ch_hamelech_hakadosh = findViewById(R.id.a_m_ch_hamelech_hakadosh);
        a_m_chazarat_hashatz_5 = findViewById(R.id.a_m_chazarat_hashatz_5);
        a_m_ch_fast_day = findViewById(R.id.a_m_ch_fast_day);
        a_m_chazarat_hashatz_6 = findViewById(R.id.a_m_chazarat_hashatz_6);
        a_m_ch_veten_beracha = findViewById(R.id.a_m_ch_veten_beracha);
        a_m_ch_tal_umatar = findViewById(R.id.a_m_ch_tal_umatar);
        a_m_chazarat_hashatz_7 = findViewById(R.id.a_m_chazarat_hashatz_7);
        a_m_ch_melech_ohev = findViewById(R.id.a_m_ch_melech_ohev);
        a_m_ch_hamelech_hamishpat = findViewById(R.id.a_m_ch_hamelech_hamishpat);
        a_m_chazarat_hashatz_8 = findViewById(R.id.a_m_chazarat_hashatz_8);
        a_m_ch_tisha_baav = findViewById(R.id.a_m_ch_tisha_baav);
        a_m_chazarat_hashatz_9 = findViewById(R.id.a_m_chazarat_hashatz_9);
        a_m_ch_rosh_chodesh = findViewById(R.id.a_m_ch_rosh_chodesh);
        a_m_ch_pesach = findViewById(R.id.a_m_ch_pesach);
        a_m_ch_sukkos = findViewById(R.id.a_m_ch_sukkos);
        a_m_chazarat_hashatz_10 = findViewById(R.id.a_m_chazarat_hashatz_10);
        a_m_ch_chanukah = findViewById(R.id.a_m_ch_chanukah);
        a_m_ch_purim = findViewById(R.id.a_m_ch_purim);
        a_m_chazarat_hashatz_11 = findViewById(R.id.a_m_chazarat_hashatz_11);
        a_m_ch_ayt_3 = findViewById(R.id.a_m_ch_ayt_3);
        a_m_chazarat_hashatz_12 = findViewById(R.id.a_m_chazarat_hashatz_12);
        a_m_ch_ayt_4 = findViewById(R.id.a_m_ch_ayt_4);
        a_m_chazarat_hashatz_13 = findViewById(R.id.a_m_chazarat_hashatz_13);
        a_m_avinu_malkainu_fast_day = findViewById(R.id.a_m_avinu_malkainu_fast_day);
        a_m_avinu_malkainu_ayt = findViewById(R.id.a_m_avinu_malkainu_ayt);
        a_m_tachanun = findViewById(R.id.a_m_tachanun);
        a_m_alainu = findViewById(R.id.a_m_alainu);

        DocumentReference docref = db.collection("ashkenaz").document("mincha");
        docref.addSnapshotListener(this, (value, error) -> {
            if (error != null){
                return;
            }
            assert value != null;
            a_m_alainu.setText(Html.fromHtml(requireNonNull(value.getString("alainu")).replaceAll("_b", "<br/>")));
            a_m_ashrei.setText(Html.fromHtml(requireNonNull(requireNonNull(value.getString("ashrei")).replaceAll("_b", "<br/>"))));
            a_m_avinu_malkainu_ayt.setText(Html.fromHtml(requireNonNull(value.getString("avinu_malkainu_ayt")).replaceAll("_b", "<br/>")));
            a_m_avinu_malkainu_fast_day.setText(Html.fromHtml(requireNonNull(value.getString("avinu_malkainu_fast_day")).replaceAll("_b", "<br/>")));
            a_m_ayt_1.setText(Html.fromHtml(requireNonNull(value.getString("ayt_1")).replaceAll("_b", "<br/>")));
            a_m_ayt_2.setText(Html.fromHtml(requireNonNull(value.getString("ayt_2")).replaceAll("_b", "<br/>")));
            a_m_ayt_3.setText(Html.fromHtml(requireNonNull(value.getString("ayt_3")).replaceAll("_b", "<br/>")));
            a_m_ayt_4.setText(Html.fromHtml(requireNonNull(value.getString("ayt_4")).replaceAll("_b", "<br/>")));
            a_m_ayt_end.setText(Html.fromHtml(requireNonNull(value.getString("ayt_end")).replaceAll("_b", "<br/>")));
            a_m_ch_ayt_1.setText(Html.fromHtml(requireNonNull(value.getString("ch_ayt_1")).replaceAll("_b", "<br/>")));
            a_m_ch_ayt_2.setText(Html.fromHtml(requireNonNull(value.getString("ch_ayt_2")).replaceAll("_b", "<br/>")));
            a_m_ch_ayt_3.setText(Html.fromHtml(requireNonNull(value.getString("ch_ayt_3")).replaceAll("_b", "<br/>")));
            a_m_ch_ayt_4.setText(Html.fromHtml(requireNonNull(value.getString("ch_ayt_4")).replaceAll("_b", "<br/>")));
            a_m_ch_chanukah.setText(Html.fromHtml(requireNonNull(value.getString("ch_chanukah")).replaceAll("_b", "<br/>")));
            a_m_ch_fast_day.setText(Html.fromHtml(requireNonNull(value.getString("ch_fast_day")).replaceAll("_b", "<br/>")));
            a_m_ch_hakel_hakadosh.setText(Html.fromHtml(requireNonNull(value.getString("ch_hakel_hakadosh")).replaceAll("_b", "<br/>")));
            a_m_ch_hamelech_hakadosh.setText(Html.fromHtml(requireNonNull(value.getString("ch_hamelech_hakadosh")).replaceAll("_b", "<br/>")));
            a_m_ch_hamelech_hamishpat.setText(Html.fromHtml(requireNonNull(value.getString("ch_hamelech_hamishpat")).replaceAll("_b", "<br/>")));
            a_m_ch_mashiv_harauch.setText(Html.fromHtml(requireNonNull(value.getString("ch_mashiv_harauch")).replaceAll("_b", "<br/>")));
            a_m_ch_melech_ohev.setText(Html.fromHtml(requireNonNull(value.getString("ch_melech_ohev")).replaceAll("_b", "<br/>")));
            a_m_ch_morid_hatal.setText(Html.fromHtml(requireNonNull(value.getString("ch_morid_hatal")).replaceAll("_b", "<br/>")));
            a_m_ch_pesach.setText(Html.fromHtml(requireNonNull(value.getString("ch_pesach")).replaceAll("_b", "<br/>")));
            a_m_ch_purim.setText(Html.fromHtml(requireNonNull(value.getString("ch_purim")).replaceAll("_b", "<br/>")));
            a_m_ch_rosh_chodesh.setText(Html.fromHtml(requireNonNull(value.getString("ch_rosh_chodesh")).replaceAll("_b", "<br/>")));
            a_m_ch_sukkos.setText(Html.fromHtml(requireNonNull(value.getString("ch_sukkos")).replaceAll("_b", "<br/>")));
            a_m_ch_tal_umatar.setText(Html.fromHtml(requireNonNull(value.getString("ch_tal_umatar")).replaceAll("_b", "<br/>")));
            a_m_ch_tisha_baav.setText(Html.fromHtml(requireNonNull(value.getString("ch_tisha_baav")).replaceAll("_b", "<br/>")));
            a_m_ch_veten_beracha.setText(Html.fromHtml(requireNonNull(value.getString("ch_veten_beracha")).replaceAll("_b", "<br/>")));
            a_m_chanukah.setText(Html.fromHtml(requireNonNull(value.getString("chanukah")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_1.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_1")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_2.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_2")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_3.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_3")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_4.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_4")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_5.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_5")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_6.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_6")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_7.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_7")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_8.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_8")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_9.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_9")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_10.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_10")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_11.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_11")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_12.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_12")).replaceAll("_b", "<br/>")));
            a_m_chazarat_hashatz_13.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_13")).replaceAll("_b", "<br/>")));
            a_m_fast_day.setText(Html.fromHtml(requireNonNull(value.getString("fast_day")).replaceAll("_b", "<br/>")));
            a_m_hakel_hakadosh.setText(Html.fromHtml(requireNonNull(value.getString("hakel_hakadosh")).replaceAll("_b", "<br/>")));
            a_m_hamelech_hakadosh.setText(Html.fromHtml(requireNonNull(value.getString("hamelech_hakadosh")).replaceAll("_b", "<br/>")));
            a_m_hamelech_hamishpat.setText(Html.fromHtml(requireNonNull(value.getString("hamelech_hamishpat")).replaceAll("_b", "<br/>")));
            a_m_mashiv_harauch.setText(Html.fromHtml(requireNonNull(value.getString("mashiv_haruach")).replaceAll("_b", "<br/>")));
            a_m_melech_ohev.setText(Html.fromHtml(requireNonNull(value.getString("melech_ohev")).replaceAll("_b", "<br/>")));
            a_m_morid_hatal.setText(Html.fromHtml(requireNonNull(value.getString("morid_hatal")).replaceAll("_b", "<br/>")));
            a_m_pesach.setText(Html.fromHtml(requireNonNull(value.getString("pesach")).replaceAll("_b", "<br/>")));
            a_m_purim.setText(Html.fromHtml(requireNonNull(value.getString("purim")).replaceAll("_b", "<br/>")));
            a_m_rosh_chodesh.setText(Html.fromHtml(requireNonNull(value.getString("rosh_chodesh")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_1.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_1")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_2.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_2")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_3.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_3")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_4.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_4")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_5.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_5")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_6.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_6")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_7.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_7")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_8.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_8")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_9.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_9")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_10.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_10")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_11.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_11")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_12.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_12")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_13.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_13")).replaceAll("_b", "<br/>")));
            a_m_shmona_esrei_end.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_end")).replaceAll("_b", "<br/>")));
            a_m_sukkos.setText(Html.fromHtml(requireNonNull(value.getString("sukkos")).replaceAll("_b", "<br/>")));
            a_m_tachanun.setText(Html.fromHtml(requireNonNull(value.getString("tachanun")).replaceAll("_b", "<br/>")));
            a_m_tal_umatar.setText(Html.fromHtml(requireNonNull(value.getString("tal_umatar")).replaceAll("_b", "<br/>")));
            a_m_tisha_baav.setText(Html.fromHtml(requireNonNull(value.getString("tisha_baav")).replaceAll("_b", "<br/>")));
            a_m_veten_beracha.setText(Html.fromHtml(requireNonNull(value.getString("veten_beracha")).replaceAll("_b", "<br/>")));


        });
    }
}