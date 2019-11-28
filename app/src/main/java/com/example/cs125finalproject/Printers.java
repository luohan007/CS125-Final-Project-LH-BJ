package com.example.cs125finalproject;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

//Jenny 1127 start:
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.GoogleMap;
import java.util.Map;
import java.util.HashMap;
import com.google.android.gms.maps.model.LatLngBounds;
//Jenny 1127 end.

public class Printers {

    /**
     * Store all the printers' locations(LatLng) and Marker Options.
     * Example1: EH = the LatLng variable (location) of Engineering Hall; EHMarker = the Marker Option variable of Engineering Hall.
     * Example2: IlliniUnion = the LatLng variable (location) of Illini Union; IlliniUnionMarker = the Marker Option variable of Illini Union.
     * Finished by Bojiang Li on 11/27/2019.
     *
     */

    static final Map<String, LatLng> printerLocationMap = new HashMap<>();

    static final LatLngBounds campusUIUC = new LatLngBounds(new LatLng(38.00, -80), new LatLng(42, -85));

    static final float defaultMarkerColor = BitmapDescriptorFactory.HUE_BLUE;

    static final float clickedMarkerColor = BitmapDescriptorFactory.HUE_RED;


    public static void addPrintersToList() {
        printerLocationMap.put("ACES Library", new LatLng(40.103039, -88.225101));
        printerLocationMap.put("Education Building", new LatLng(40.102113, -88.229611));
        printerLocationMap.put("Electrical and Computer Engineering Building", new LatLng(40.115144, -88.228017));
        printerLocationMap.put("Engineering Hall", new LatLng(40.111036, -88.226990));
        printerLocationMap.put("Everitt Laboratory", new LatLng(40.111165, -88.228348));
        printerLocationMap.put("Loomis Laboratory Of Physics", new LatLng(40.111223, -88.223324));
        printerLocationMap.put("Thomas M. Siebel Center for Computer Science", new LatLng(40.114041, -88.224894));
        printerLocationMap.put("Digital Computer Laboratory", new LatLng(40.113410, -88.226610));
        printerLocationMap.put("Grainger Engineering Library", new LatLng(40.112746, -88.226864));
        printerLocationMap.put("Mechanical Engineering Laboratory", new LatLng(40.112004, -88.226157));
        printerLocationMap.put("Talbot Laboratory", new LatLng(40.112041, -88.228316));
        printerLocationMap.put("Bruce D. Nesbitt African American Cultural Center",new LatLng(40.106446, -88.224761));
        printerLocationMap.put("English Building",new LatLng(40.107831, -88.228184));
        printerLocationMap.put("School of Labor & Employment Relations", new LatLng(40.105870, -88.231575));
        printerLocationMap.put("Illini Hall",new LatLng(40.109768, -88.229276));
        printerLocationMap.put("Nevada Building Computer Lab", new LatLng(40.105668, -88.224465));
        printerLocationMap.put("Oregon Building Computer Lab", new LatLng(40.106999, -88.219508));
        printerLocationMap.put("University Laboratory High School", new LatLng(40.113393, -88.225205));
        printerLocationMap.put("Illini Union", new LatLng(40.109464, -88.227180));
        printerLocationMap.put("Wohlers Hall", new LatLng(40.103889, -88.229857));
        printerLocationMap.put("Allen Hall and Unit One LLC", new LatLng(40.104378, -88.220873));
        printerLocationMap.put("Busey Evans Hall", new LatLng(40.105854, -88.222920));
        printerLocationMap.put("Bousfield Hall", new LatLng(40.102003, -88.237866));
        printerLocationMap.put("Clark Hall", new LatLng(40.103847, -88.233927));
        printerLocationMap.put("Daniels Hall", new LatLng(40.111014, -88.221669));
        printerLocationMap.put("Florida Avenue Residence Hall", new LatLng(40.099434, -88.221124));
        printerLocationMap.put("Goodwin-Green University Apartment", new LatLng(40.110004, -88.223632));
        printerLocationMap.put("Hopkins Hall", new LatLng(40.111014, -88.221669));
        printerLocationMap.put("Lincoln Avenue Residence (LAR)", new LatLng(40.104330, -88.220336));
        printerLocationMap.put("Nugent Hall", new LatLng(40.104174, -88.237242));
        printerLocationMap.put("Orchard Downs Apartment", new LatLng(40.092415, -88.211066));
        printerLocationMap.put("Pennsylvania Avenue Residence", new LatLng(40.099958, -88.220789));
        printerLocationMap.put("Scott Hall", new LatLng(40.102245, -88.236704));
        printerLocationMap.put("Ikenberry Student Dining and Residential Programs Building", new LatLng(40.104175, -88.235481));
        printerLocationMap.put("Sherman Hall", new LatLng(40.107274, -88.232328));
        printerLocationMap.put("Snyder Hall", new LatLng(40.102328, -88.235094));
        printerLocationMap.put("Trelease Hall(FAR)", new LatLng(40.099119, -88.220352));
        printerLocationMap.put("Taft-Van Doren Residence Halls", new LatLng(40.102002, -88.233655));
        printerLocationMap.put("Wassaja Hall", new LatLng(40.103946, -88.238104));
        printerLocationMap.put("Wardall Hall(ISR)", new LatLng(40.109676, -88.221744));
        printerLocationMap.put("Weston Hall(Ike)", new LatLng(40.103307, -88.235408));
        printerLocationMap.put("ischool(Library and Information Science Building)", new LatLng(40.107768, -88.231478));
        printerLocationMap.put("Vet-Med(Basic Science Building)", new LatLng(40.092901, -88.220400));
        printerLocationMap.put("Nathan Newmark Civil Engineering Laboratory Yeh Center", new LatLng(40.114272, -88.226003));
    }

}
