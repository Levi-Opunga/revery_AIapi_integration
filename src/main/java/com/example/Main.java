//package com.example;
//
//import com.example.encryption.Encryption;
//import com.example.env.Constants;
//import com.example.models.Garment;
//import com.example.models.Response;
//import com.example.retrofit.ReveryApi;
//import com.example.retrofit.ReveryClient;
//import retrofit2.Call;
//import retrofit2.Callback;
//
//import java.io.IOException;
//import java.util.List;
//
//public class Main {
//
//    static Response responses;
//    static List<Garment> garments;
//
//    public static void main(String[] args) {
//        ReveryApi api = ReveryClient.getClient();
//        long time = System.currentTimeMillis() / 1000;
//        var timestring = String.valueOf(time);
//        String derivedKey = Encryption.pbkdf2(Constants.SECRET_KEY, timestring, 128, 32);
//        for (int i = 0; i <= 0; i++) {
//
//            Call<Response> call = api.getAllGarments(derivedKey, timestring);
//            call.enqueue(new Callback<Response>() {
//                @Override
//                public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
//                    if (response.isSuccessful()) {
//                        System.out.println("success");
//                        responses = response.body();
//                        garments = responses.getGarments();
//                        garments.forEach(System.out::println);
////                    Constants.RESTORE = garments;
//////                    Constants.GARMENTS = garments;
////                    mainContext = getApplicationContext();
////                    FragmentManager fragmentManager = getSupportFragmentManager();
////                    ItemPagerAdapter itemPagerAdapter = new ItemPagerAdapter(fragmentManager, getLifecycle());
////                    viewPager2.setAdapter(itemPagerAdapter);
////                    progressBar.setVisibility(View.GONE);
////                    texview.setVisibility(View.GONE);
////                    Log.d("Success", "Suuuuuccccceeessssss in main");
//
//                    } else {
//                        try {
//                            System.out.println(response.errorBody().string());
//                        } catch (IOException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                }
//
//                @Override
//                public void onFailure(Call<Response> call, Throwable t) {
//                    System.out.println("failed to call");
//                }
//            });
//        }
//
//    }
//}