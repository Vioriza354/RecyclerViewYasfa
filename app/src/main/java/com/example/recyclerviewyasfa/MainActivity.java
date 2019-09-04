package com.example.recyclerviewyasfa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private AdapterRecycler adapter;
    private ArrayList<Mail> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recycler = (RecyclerView) findViewById(R.id.recyclerView);

        adapter = new AdapterRecycler(dataList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recycler.setLayoutManager(layoutManager);

        recycler.setAdapter(adapter);

    }

    void addData(){
        dataList = new ArrayList<>();
        dataList.add(new Mail("Yasfa","Tugas Recycler View","Yo ini tugas Recycler view tea..","Today,15:36"));
        dataList.add(new Mail("Angga Shining","Bagi Link","Yo bagi link eta tea lah","Today,14:14"));
        dataList.add(new Mail("Iman Nurohman","Nitip Link","Ja,urang nitip Link nya. Kade ulah dibuka","Today,13:13"));
        dataList.add(new Mail("Grab","Your Grab E-Receipt","Semoga perjalanan anda tadi menyenangkan..","Today,06:34"));
        dataList.add(new Mail("Emir Othman","Desain E-Parking PKK","Vio, aku minta Design UI E - Parking yang PKK","Today,17:00"));
        dataList.add(new Mail("Rizki Azis","Benerkeun Design","Yo, ieu abdi tos ngadamel desain PKK, tapi cik..","Today,16:46"));
        dataList.add(new Mail("GitHub","[GitHub] Please change your Password","Hey Vio! You recently accesed GitHub using..","Today,16:00"));
        dataList.add(new Mail("Narenda Wicaksono","Tidak dapat membaca","Jika kamu tidak dapat membaca maka silahkan..","Today,13:00"));
        dataList.add(new Mail("Anonymous","Hello there Fellas","Hello there, would you like to hear a story?","Today,03:10"));
        dataList.add(new Mail("Rin Rin","Tugas PWPB","Tugas PWPB Recycler View & Card View","Today,08:00"));
        dataList.add(new Mail("Dicoding Team","Deadline untuk kelas belajar","Deadline untuk kelas belajar Android Pemula..","Today,12:00"));
    }

}
