package com.example.cs125finalproject;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Markers {

    /*
     LatLng ACES_AESB = new LatLng(40.103612, -88.226026);
     MarkerOptions ACESMarker = new MarkerOptions().position(ACES_AESB).title("ACES AESB");
     mMap.addMarker(new MarkerOptions().position(ACES_AESB).title("ACES AESB"));
     mMap.moveCamera(CameraUpdateFactory.newLatLng(ACES_AESB));
     */

    /**
     * Store all the printers' locations(LatLng) and Marker Options.
     * Example1: EH = the LatLng variable (location) of Engineering Hall; EHMarker = the Marker Option variable of Engineering Hall.
     * Example2: IlliniUnion = the LatLng variable (location) of Illini Union; IlliniUnionMarker = the Marker Option variable of Illini Union.
     * Finished by Bojiang Li on 11/27/2019.
     *
     */
    public void MarkerOptions() {

            LatLng ACES_Library = new LatLng(40.103039, -88.225101);
            MarkerOptions ACES_LibraryMarker = new MarkerOptions().position(ACES_Library).title("ACES Library");

            LatLng ED = new LatLng(40.102113, -88.229611);
            MarkerOptions EDMarker = new MarkerOptions().position(ED).title("Education Building");

            LatLng ECEB = new LatLng(40.115144, -88.228017);
            MarkerOptions ECEBMarker = new MarkerOptions().position(ECEB).title("Electrical and Computer Engineering Building");

            LatLng EH = new LatLng(40.111036, -88.226990);
            MarkerOptions EHMarker = new MarkerOptions().position(EH).title("Engineering Hall");

            LatLng Everitt_Laboratory = new LatLng(40.111165, -88.228348);
            MarkerOptions Everitt_LaboratoryMarker = new MarkerOptions().position(Everitt_Laboratory).title("Everitt Laboratory");

            LatLng Loomis = new LatLng(40.111223, -88.223324);
            MarkerOptions LoomisMarker = new MarkerOptions().position(Loomis).title("Loomis Laboratory Of Physics");

            LatLng Siebel = new LatLng(40.114041, -88.224894);
            MarkerOptions SiebelMarker = new MarkerOptions().position(Siebel).title("Thomas M. Siebel Center for Computer Science");

            LatLng DCL = new LatLng(40.113410, -88.226610);
            MarkerOptions DCLMarker = new MarkerOptions().position(DCL).title("Digital Computer Laboratory");

            LatLng Grainger = new LatLng(40.112746, -88.226864);
            MarkerOptions GrainerMarker = new MarkerOptions().position(Grainger).title("Grainger Engineering Library");

            LatLng MEL = new LatLng(40.112004, -88.226157);
            MarkerOptions MELMarker = new MarkerOptions().position(MEL).title("Mechanical Engineering Laboratory");

            LatLng Talbot = new LatLng(40.112041, -88.228316);
            MarkerOptions TalbotMarker = new MarkerOptions().position(Talbot).title("Talbot Laboratory");

            LatLng bnaacc = new LatLng(40.106446, -88.224761);
            MarkerOptions bnaaccMarker = new MarkerOptions().position(bnaacc).title("Bruce D. Nesbitt African American Cultural Center");

            LatLng EB = new LatLng(40.107831, -88.228184);
            MarkerOptions EBMarker = new MarkerOptions().position(EB).title("English Building");

            LatLng LER = new LatLng(40.105870, -88.231575);
            MarkerOptions LERMarker = new MarkerOptions().position(LER).title("School of Labor & Employment Relations");

            LatLng IlliniHall = new LatLng(40.109768, -88.229276);
            MarkerOptions IlliniHallMarker = new MarkerOptions().position(IlliniHall).title("Illini Hall");

            LatLng NevadaLab = new LatLng(40.105668, -88.224465);
            MarkerOptions NevadaLabMarker = new MarkerOptions().position(NevadaLab).title("Nevada Building Computer Lab");

            LatLng OregonLab = new LatLng(40.106999, -88.219508);
            MarkerOptions OregonLabMarker = new MarkerOptions().position(OregonLab).title("Oregon Building Computer Lab");

            LatLng UniversityHighSchool = new LatLng(40.113393, -88.225205);
            MarkerOptions UniversityHighSchoolMarker = new MarkerOptions().position(UniversityHighSchool).title("University Laboratory High School");

            LatLng IlliniUnion = new LatLng(40.109464, -88.227180);
            MarkerOptions IlliniUnionMarker = new MarkerOptions().position(IlliniUnion).title("Illini Union");

            LatLng WohlersHall = new LatLng(40.103889, -88.229857);
            MarkerOptions WohlersHallMarker = new MarkerOptions().position(WohlersHall).title("Wohlers Hall");

            LatLng AllenHall = new LatLng(40.104378, -88.220873);
            MarkerOptions AllenHallMarker = new MarkerOptions().position(AllenHall).title("Allen Hall and Unit One LLC");

            LatLng BuseyEvansHall = new LatLng(40.105854, -88.222920);
            MarkerOptions BuseyEvansHallMarker = new MarkerOptions().position(BuseyEvansHall).title("Busey Evans Hall");

            LatLng BousfieldHall = new LatLng(40.102003, -88.237866);
            MarkerOptions BousfieldHallMarker = new MarkerOptions().position(BousfieldHall).title("Bousfield Hall");

            LatLng ClarkHall = new LatLng(40.103847, -88.233927);
            MarkerOptions ClarkHallMarker = new MarkerOptions().position(ClarkHall).title("Clark Hall");

            LatLng DanielsHall = new LatLng(40.111014, -88.221669);
            MarkerOptions DanielsHallMarker = new MarkerOptions().position(DanielsHall).title("Daniels Hall");

            LatLng FAR = new LatLng(40.099434, -88.221124);
            MarkerOptions FARMarker = new MarkerOptions().position(FAR).title("Florida Avenue Residence Hall");

            LatLng GoodwinGreen = new LatLng(40.110004, -88.223632);
            MarkerOptions GoodwinGreenMarker = new MarkerOptions().position(GoodwinGreen).title("Goodwin-Green University Apartment");

            LatLng HopkinsHall = new LatLng(40.111014, -88.221669);
            MarkerOptions HopkinsHallMarker = new MarkerOptions().position(HopkinsHall).title("Hopkins Hall");

            LatLng LAR = new LatLng(40.104330, -88.220336);
            MarkerOptions LARMarker = new MarkerOptions().position(LAR).title("Lincoln Avenue Residence (LAR)");

            LatLng NugentHall = new LatLng(40.104174, -88.237242);
            MarkerOptions NugentHallMarker = new MarkerOptions().position(NugentHall).title("Nugent Hall");

            LatLng OrchardDowns = new LatLng(40.092415, -88.211066);
            MarkerOptions OrchardDownsMarkers = new MarkerOptions().position(OrchardDowns).title("Orchard Downs Apartment");

            LatLng PAR = new LatLng(40.099958, -88.220789);
            MarkerOptions PARMarker = new MarkerOptions().position(PAR).title("Pennsylvania Avenue Residence");

            LatLng ScottHall = new LatLng(40.102245, -88.236704);
            MarkerOptions ScottHallMarker = new MarkerOptions().position(ScottHall).title("Scott Hall");

            LatLng Ike = new LatLng(40.104175, -88.235481);
            MarkerOptions IkeMarker = new MarkerOptions().position(Ike).title("Ikenberry Student Dining and Residential Programs Building");

            LatLng ShermanHall = new LatLng(40.107274, -88.232328);
            MarkerOptions ShermanHallMarker = new MarkerOptions().position(ShermanHall).title("Sherman Hall");

            LatLng SnyderHall = new LatLng(40.102328, -88.235094);
            MarkerOptions SnyderHallMarker = new MarkerOptions().position(SnyderHall).title("Snyder Hall");

            LatLng TreleaseHall = new LatLng(40.099119, -88.220352);
            MarkerOptions TreleaseHallMarker = new MarkerOptions().position(TreleaseHall).title("Trelease Hall(FAR)");

            LatLng TaftVanDorenHall = new LatLng(40.102002, -88.233655);
            MarkerOptions TaftVanDorenHallMarker = new MarkerOptions().position(TaftVanDorenHall).title("Taft-Van Doren Residence Halls");

            LatLng WassajaHall = new LatLng(40.103946, -88.238104);
            MarkerOptions WassajaHallMarker = new MarkerOptions().position(WassajaHall).title("Wassaja Hall");

            LatLng WardallHall = new LatLng(40.109676, -88.221744);
            MarkerOptions WardallHallMarker = new MarkerOptions().position(WardallHall).title("Wardall Hall(ISR)");

            LatLng WestonHall = new LatLng(40.103307, -88.235408);
            MarkerOptions WestonHallMarker = new MarkerOptions().position(WestonHall).title("Weston Hall(Ike)");

            LatLng Ischool = new LatLng(40.107768, -88.231478);
            MarkerOptions IschoolMarker = new MarkerOptions().position(Ischool).title("ischool(Library and Information Science Building)");

            LatLng VetMedPrinter = new LatLng(40.092901, -88.220400);
            MarkerOptions VetMedPrinterMarker = new MarkerOptions().position(VetMedPrinter).title("Vet-Med(Basic Science Building)");

            LatLng NCEB = new LatLng(40.114272, -88.226003);
            MarkerOptions NCEBMarker = new MarkerOptions().position(NCEB).title("Nathan Newmark Civil Engineering Laboratory Yeh Center");
        }


}
