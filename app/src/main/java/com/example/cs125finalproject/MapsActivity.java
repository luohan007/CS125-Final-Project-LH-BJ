package com.example.cs125finalproject;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

//Jenny 1127 22:10 start:
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
//Jenny 1127 22:10 end.

//Jenny 1128 start:
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//Jenny 1128 end.

//1130 21:00 start:
import android.util.Pair;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
//1130 21:00 end.

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap map;

    //Jenny 1127 22:10 start:
    /** Create a MarkerOptions object to specify where we want the marker. */
    private MarkerOptions options;

    /** Add it to the map - Google Maps gives us the created Marker. */
    private Marker marker;

    /** The list of Markers that mark the printers. */
    private List<Marker> markers = new ArrayList();
    //Jenny 1127 22:10 end.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        //Jenny 1127 22:00 start:
        placeMarker();
        //Jenny 1127 22:00 end.

        //Jenny 1127 16:00 start:
        // Add a marker to each of the printers on UIUC campus.
        // "ACES AESB"
        LatLng ACES_AESB = new LatLng(40.103612, -88.226026);
        map.moveCamera(CameraUpdateFactory.newLatLng(ACES_AESB));
        //Jenny 1127 16:00 end.


    }

    //Jenny 1127 22:00 start:
    public void placeMarker() { // Suppose position is a LatLng variable

        //Information about the list of printers is added to be stored in "printerLocationMap"
        Printers.addPrintersToList();

        for (Map.Entry<String, Pair<LatLng, String>> entry : Printers.printerLocationMap.entrySet()) {
            //iterate through each printer:

            String printerLocationName = entry.getKey(); //name of the building where the printer is
            LatLng printerLocation = entry.getValue().first; //location of the printer
            String printerInfo = entry.getValue().second;

            //Add a marker to the location of each printer, with title being the building name.
            options = new MarkerOptions().position(printerLocation)
                    .title(printerLocationName).snippet(printerInfo);
            marker = map.addMarker(options);

            //Set the default color of the marker to be blue.
            BitmapDescriptor defaultColor = BitmapDescriptorFactory.defaultMarker(Printers.defaultMarkerColor);
            marker.setIcon(defaultColor);

            //Add each marker to "markers", the list of markers.
            markers.add(marker);
        }
    }

    //Jenny 1127 22:00 end.


}
