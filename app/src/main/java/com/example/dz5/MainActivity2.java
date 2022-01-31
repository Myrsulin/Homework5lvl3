package com.example.dz5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private Adapter adapter;
    private ArrayList<Model> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        arrayList = new ArrayList<>();
        int id = getIntent().getIntExtra("key", 1);
        if (id == 1) {
            arrayList.add(new Model(R.drawable.ic_kg_3x, "Kyrgyzstan"));
            arrayList.add(new Model(R.drawable.ic_kz_3x, "Казахстан"));
            arrayList.add(new Model(R.drawable.ic_pl_3x, "Польша"));
            arrayList.add(new Model(R.drawable.ic_tr_3x, "Турция"));
            arrayList.add(new Model(R.drawable.ic_uz_3x, "Узбекистан"));

        } else if (id == 2){
            arrayList.add(new Model(R.drawable.ic_mm_3x, "Гана"));
            arrayList.add(new Model(R.drawable.ic_na_3x, "Намибия"));
            arrayList.add(new Model(R.drawable.ic_ug_3x, "Уганда"));
            arrayList.add(new Model(R.drawable.ic_tz_3x, "Танзания"));
            arrayList.add(new Model(R.drawable.ic_ssl_3x, "Сьерра-Леоне"));


        } else if (id ==3){
            arrayList.add(new Model(R.drawable.ic_ai_3x, "Багамы"));
            arrayList.add(new Model(R.drawable.ic_bb_3x, "Барбадос"));
            arrayList.add(new Model(R.drawable.ic_li_3x, "Гаити"));
            arrayList.add(new Model(R.drawable.ic_gd_3x, "Гренада"));
            arrayList.add(new Model(R.drawable.ic_dm_3x, "Доминика"));

        }else if (id == 4){
            arrayList.add(new Model(R.drawable.ic_uy_3x, "Уругвай"));
            arrayList.add(new Model(R.drawable.ic_ar_3x, "Аргентина"));
            arrayList.add(new Model(R.drawable.ic_gi_3x, "Гвиана"));
            arrayList.add(new Model(R.drawable.ic_sr_3x, "Суринам"));
            arrayList.add(new Model(R.drawable.ic_gy_3x, "Гайана"));

        }else if(id == 5) {
            arrayList.add(new Model(R.drawable.ic_to_3x, "Тонга"));
            arrayList.add(new Model(R.drawable.ic_gb_3x, "Тувалу"));
            arrayList.add(new Model(R.drawable.ic_jo_3x, "Вануату"));
            arrayList.add(new Model(R.drawable.ic_ie_3x, "Ерландия"));
            arrayList.add(new Model(R.drawable.ic_ni_3x, "Науру"));

        }

        RecyclerView recyclerView = findViewById(R.id.recyclerView2);
        adapter = new Adapter();
        adapter.setArrayList(arrayList);
        recyclerView.setAdapter(adapter);

    }
}