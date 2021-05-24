package com.standard.mapsexammple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.dynamic.SupportFragmentWrapper
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var map:GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createMapFragment()
    }


    private fun createMapFragment(){
        val mapFragment:SupportMapFragment = supportFragmentManager.findFragmentById(R.id.fragmentMap) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap:GoogleMap) {
        map = googleMap
        createMap()
    }

    private fun createMap(){
        val coordinate = LatLng(14.709818, -91.320641)
        val marker:MarkerOptions = MarkerOptions().position(coordinate).title("My position")
        map.addMarker(marker)
       
    }

}