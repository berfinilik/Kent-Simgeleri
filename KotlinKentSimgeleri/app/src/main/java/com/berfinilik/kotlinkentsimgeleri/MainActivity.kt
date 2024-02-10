package com.berfinilik.kotlinkentsimgeleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.berfinilik.kotlinkentsimgeleri.databinding.ActivityDetailsBinding
import com.berfinilik.kotlinkentsimgeleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var landmarkList:ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        landmarkList=ArrayList<Landmark>()


        //Data

        val pisa=Landmark("Pisa","Italy",R.drawable.pisa)
        val colosseum=Landmark("Colosseum","Italy",R.drawable.colosseum)
        val eiffel=Landmark("Eiffel","France",R.drawable.eyfel)
        val londonBridge=Landmark("London Bridge","UK",R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)


        binding.RecyclerView.layoutManager=LinearLayoutManager(this)
        val landmarkAdapter=LandmarkAdapter(landmarkList)
        binding.RecyclerView.adapter=landmarkAdapter

        /*LISTWIEW

        //Adapter:Layout & Data
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name })
        binding.listView.adapter=adapter
        binding.listView.onItemClickListener= AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent=Intent(MainActivity@this,DetailsActivity::class.java)
            intent.putExtra("landmarkName",landmarkList.get(position).name)
            intent.putExtra("landmarkCountry",landmarkList.get(position).country)
            startActivity(intent)
        }

         */

        //RECYCLERVİEWLA YAPMAK


    }
}