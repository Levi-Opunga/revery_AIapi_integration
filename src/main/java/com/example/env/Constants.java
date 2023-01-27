package com.example.env;

import com.example.models.Garment;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static String GENDER= "none";
    public static List<Garment> RESTORE= new ArrayList<Garment>();
    public static List<Garment> RESTORE_SAVED= new ArrayList<Garment>();


    public static List<Garment> GARMENTS= new ArrayList<Garment>();
    public static List<Garment> SAVED_RESTORE= new ArrayList<Garment>();
    public static List<Garment> SAVED_GARMENTS= new ArrayList<Garment>();
    public  final static String BASE_URL = "https://api.revery.ai/console/v1/";
    // RSecretkey=9b3e4b96a21f70016649e2bc85ad92b7;RPublickey=2b4a9f71ddcd7a7a3b2d61fcb151b211
    public  final static String SECRET_KEY="9b3e4b96a21f70016649e2bc85ad92b7";//System.getenv("RSecretkey");
    public final static String PUBLIC_KEY="2b4a9f71ddcd7a7a3b2d61fcb151b211"; //System.getenv("RPublickey");
    public final static String SAVED_CLOTHES="Outfits";



//    public final static String uid=  FirebaseAuth.getInstance().getCurrentUser().getUid();

    public static boolean saved;
}
