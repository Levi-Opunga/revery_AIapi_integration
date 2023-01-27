package com.example;

import com.example.encryption.Encryption;
import com.example.env.Constants;
import com.example.models.Example;
import com.example.models.Garment;
import com.example.models.Response;
import com.example.models.female.FemaleShoe;
import com.example.models.mods.Models;
import com.example.models.serverRequest.Garments;
import com.example.models.serverRequest.ReqBody;
import com.example.models.serverRes.TryOn;
import com.example.models.upload.Delete;
import com.example.models.upload.Upload;
import com.example.retrofit.ReveryApi;
import com.example.retrofit.ReveryClient;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Call;
import retrofit2.Callback;
import com.example.models.ShoePathsDict;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.example.env.Constants.SECRET_KEY;

@SpringBootApplication
public class ExampleApplication {
    static Encryption encryption;
    static Gson gson = new Gson();
    static Response responses;
    static List<Garment> garments;

    static TryOn tryOn;
    static Example ShoeResponses;
    static FemaleShoe fResponse;
    static long time;
    static String gender = Constants.GENDER;
    static List<String> shoePaths = new ArrayList<>();
    static ShoePathsDict allShoes;
    static com.example.models.female.ShoePathsDict allShoesFemale;

    static List<String> list = new ArrayList<>();
    static List<String> strings = new ArrayList<>();
    private static Logger log = Logger.getLogger(String.valueOf(ExampleApplication.class));


    public ExampleApplication(Encryption encryption) {
        this.encryption = encryption;
    }

    public static void main(String[] args) throws InterruptedException {
        var context = SpringApplication.run(ExampleApplication.class, args);
        String item = new String();
        for (int i = 0; i < 10; i++) {
            item = uploadImageUrl();
            Thread.sleep(4000);
        }
        System.out.println(gson.toJson(list));
        list.forEach(System.out::println);

        Thread.sleep(10000);
        if (!list.isEmpty())
        for (int i = 0; i < list.size(); i++) {
            delete(list.get(i));
            Thread.sleep(6000);
        }
        //        allGarmentsCall();
//        requestTryOn();
//        modelsCall();
//
    }

    private static void  modelsCall(){
        time = System.currentTimeMillis()/1000;
        String derivedKey = Encryption.pbkdf2(SECRET_KEY, String.valueOf(time), 128, 32);
        Call<Models> facesCall = ReveryClient.getClient().getMaleModels(derivedKey,String.valueOf(time));
        facesCall.enqueue(new Callback<Models>() {
            @Override
            public void onResponse(Call<Models> call, retrofit2.Response<Models> response) {
                if (response.isSuccessful()) {
                    Models face = response.body();
                    assert face != null;
                    List<String> faceIds = face.getModelFiles();
                    var urls = faceIds.stream().map((id) -> "https://media.revery.ai/generated_model_image/"+id+".png").collect(Collectors.toList());
                    urls.forEach(System.out::println);
                }else {
                    try{
                        System.out.println(response.errorBody().string());
                    }catch(Exception e){

                    }
                }}

            @Override
            public void onFailure(Call<Models> call, Throwable t) {

            }
        });
    }
    private static void allGarmentsCall() {
        ReveryApi api = ReveryClient.getClient();
        long time = System.currentTimeMillis() / 1000;
        var timestring = String.valueOf(time);
        String derivedKey = encryption.pbkdf2(SECRET_KEY, timestring, 128, 32);
        for (int i = 0; i <= 0; i++) {

            Call<Response> call = api.getAllGarments(derivedKey, timestring);
            call.enqueue(new Callback<Response>() {
                @Override
                public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                    if (response.isSuccessful()) {
                        System.out.println("success");
                        responses = response.body();
                        garments = responses.getGarments();
                        garments.forEach(System.out::println);

//                    Constants.RESTORE = garments;
////                    Constants.GARMENTS = garments;
//                    mainContext = getApplicationContext();
//                    FragmentManager fragmentManager = getSupportFragmentManager();
//                    ItemPagerAdapter itemPagerAdapter = new ItemPagerAdapter(fragmentManager, getLifecycle());
//                    viewPager2.setAdapter(itemPagerAdapter);
//                    progressBar.setVisibility(View.GONE);
//                    texview.setVisibility(View.GONE);
//                    Log.d("Success", "Suuuuuccccceeessssss in main");

                    } else {
                        try {
                            System.out.println(response.errorBody().string());
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

                @Override
                public void onFailure(Call<Response> call, Throwable t) {
                    System.out.println("failed to call");
                }
            });
        }
    }

    public static void shoesCall(String gender) {
        for (int i = 0; i <= 0; i++) {
            time = System.currentTimeMillis() / 1000;

            String derivedKey = Encryption.pbkdf2(SECRET_KEY, String.valueOf(time), 128, 32);
            ReveryApi reveryApi = ReveryClient.getClient();

            if (gender.equals("male")) {
                //  MALE
                Call<Example> call = reveryApi.getShoes(gender, derivedKey, String.valueOf(time));
                call.enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, retrofit2.Response<Example> response) {
                        if (response.isSuccessful()) {
                            ShoeResponses = response.body();
                            allShoes = ShoeResponses.getShoePathsDict();
                            shoePaths.clear();
                            Collections.addAll(shoePaths, allShoes.getModel13208347(), allShoes.getModel12241518(),
                                    allShoes.getModel12982074(), allShoes.getModel14059215(), allShoes.getModel14118877(),
                                    allShoes.getModel13903163(), allShoes.getModel15138790(), allShoes.getModel13208328(),
                                    allShoes.getModel13319225(), allShoes.getModel12900360(), allShoes.getModel13590102(),
                                    allShoes.getModel13920494(), allShoes.getModel13590127(), allShoes.getModel13786388(),
                                    allShoes.getModel13654244(), allShoes.getModel15147224(), allShoes.getModel14038438(),
                                    allShoes.getModel13919837(), allShoes.getModel15006661(), allShoes.getModel15024291(),
                                    allShoes.getModel15189033(), allShoes.getModel14038461(), allShoes.getModel13743996(),
                                    allShoes.getModel13944054(), allShoes.getModel13738916(), allShoes.getModel13654211(),
                                    allShoes.getModel13903123(), allShoes.getModel13862238(), allShoes.getModel13952035(),
                                    allShoes.getModel14127779(), allShoes.getModel15016762(), allShoes.getModel14786919());


                            strings = ShoeResponses.getShoeModelIds();

                            strings.stream().forEach(System.out::println);
                            System.out.println("paths");
                            shoePaths.stream().forEach(System.out::println);
                        }


                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {

                    }
                });


            }


            if (gender.equals("none")) {
                strings.clear();
                Call<FemaleShoe> call2 = reveryApi.getFemaleShoes("female", derivedKey, String.valueOf(time));
                call2.enqueue(new Callback<FemaleShoe>() {
                    @Override
                    public void onResponse(Call<FemaleShoe> call2, retrofit2.Response<FemaleShoe> response) {
                        if (response.isSuccessful()) {
                            fResponse = response.body();
                            allShoesFemale = fResponse.getShoePathsDict();

                            shoePaths.clear();
                            Collections.addAll(shoePaths, allShoesFemale.getModel13300343(),
                                    allShoesFemale.getModel13417676(), allShoesFemale.getModel13483572(), allShoesFemale.getModel12466865(), allShoesFemale.getModel12949144(), allShoesFemale.getModel13440398(), allShoesFemale.getModel14196619(), allShoesFemale.getModel13160864(), allShoesFemale.getModel14235837(),
                                    allShoesFemale.getModel13136326(), allShoesFemale.getModel14421519(), allShoesFemale.getModel13346777(), allShoesFemale.getModel14881242(),
                                    allShoesFemale.getModel14108606(), allShoesFemale.getModel12876015(), allShoesFemale.getModel13229201(), allShoesFemale.getModel14143445(), allShoesFemale.getModel12742869(), allShoesFemale.getModel13015229(), allShoesFemale.getModel13647165(), allShoesFemale.getModel13086347(), allShoesFemale.getModel13104825(), allShoesFemale.getModel13565475(), allShoesFemale.getModel13447432(),
                                    allShoesFemale.getModel14402253(), allShoesFemale.getModel13459469(), allShoesFemale.getModel15033006(), allShoesFemale.getModel13279604(), allShoesFemale.getModel13131087(), allShoesFemale.getModel13440366(), allShoesFemale.getModel14285769(), allShoesFemale.getModel13591062(), allShoesFemale.getModel13241867(), allShoesFemale.getModel13139372(), allShoesFemale.getModel13012154(), allShoesFemale.getModel13109470(), allShoesFemale.getModel13201269(), allShoesFemale.getModel12778777(), allShoesFemale.getModel13466933());

                            Call<Example> call = reveryApi.getShoes("male", derivedKey, String.valueOf(time));
                            call.enqueue(new Callback<Example>() {
                                @Override
                                public void onResponse(Call<Example> call, retrofit2.Response<Example> response) {
                                    if (response.isSuccessful()) {
                                        ShoeResponses = response.body();
                                        allShoes = ShoeResponses.getShoePathsDict();
                                        Collections.addAll(shoePaths, allShoes.getModel13208347(), allShoes.getModel12241518(),
                                                allShoes.getModel12982074(), allShoes.getModel14059215(), allShoes.getModel14118877(),
                                                allShoes.getModel13903163(), allShoes.getModel15138790(), allShoes.getModel13208328(),
                                                allShoes.getModel13319225(), allShoes.getModel12900360(), allShoes.getModel13590102(),
                                                allShoes.getModel13920494(), allShoes.getModel13590127(), allShoes.getModel13786388(),
                                                allShoes.getModel13654244(), allShoes.getModel15147224(), allShoes.getModel14038438(),
                                                allShoes.getModel13919837(), allShoes.getModel15006661(), allShoes.getModel15024291(),
                                                allShoes.getModel15189033(), allShoes.getModel14038461(), allShoes.getModel13743996(),
                                                allShoes.getModel13944054(), allShoes.getModel13738916(), allShoes.getModel13654211(),
                                                allShoes.getModel13903123(), allShoes.getModel13862238(), allShoes.getModel13952035(),
                                                allShoes.getModel14127779(), allShoes.getModel15016762(), allShoes.getModel14786919());
//

                                        strings = fResponse.getShoeModelIds();
                                        strings.addAll(ShoeResponses.getShoeModelIds());

//
                                    }


                                }

                                @Override
                                public void onFailure(Call<Example> call, Throwable t) {

                                }
                            });
                        }

                    }

                    @Override
                    public void onFailure(Call<FemaleShoe> call, Throwable t) {

                    }


                });


            }

            if (gender.equals("female")) {

                Call<FemaleShoe> call = reveryApi.getFemaleShoes(gender, derivedKey, String.valueOf(time));
                call.enqueue(new Callback<FemaleShoe>() {
                    @Override
                    public void onResponse(Call<FemaleShoe> call, retrofit2.Response<FemaleShoe> response) {
                        if (response.isSuccessful()) {
                            fResponse = response.body();
                            shoePaths.clear();
                            strings.clear();
                            allShoesFemale = fResponse.getShoePathsDict();
                            Collections.addAll(shoePaths, allShoesFemale.getModel13300343(),
                                    allShoesFemale.getModel13417676(), allShoesFemale.getModel13483572(), allShoesFemale.getModel12466865(), allShoesFemale.getModel12949144(), allShoesFemale.getModel13440398(), allShoesFemale.getModel14196619(), allShoesFemale.getModel13160864(), allShoesFemale.getModel14235837(),
                                    allShoesFemale.getModel13136326(), allShoesFemale.getModel14421519(), allShoesFemale.getModel13346777(), allShoesFemale.getModel14881242(),
                                    allShoesFemale.getModel14108606(), allShoesFemale.getModel12876015(), allShoesFemale.getModel13229201(), allShoesFemale.getModel14143445(), allShoesFemale.getModel12742869(), allShoesFemale.getModel13015229(), allShoesFemale.getModel13647165(), allShoesFemale.getModel13086347(), allShoesFemale.getModel13104825(), allShoesFemale.getModel13565475(), allShoesFemale.getModel13447432(),
                                    allShoesFemale.getModel14402253(), allShoesFemale.getModel13459469(), allShoesFemale.getModel15033006(), allShoesFemale.getModel13279604(), allShoesFemale.getModel13131087(), allShoesFemale.getModel13440366(), allShoesFemale.getModel14285769(), allShoesFemale.getModel13591062(), allShoesFemale.getModel13241867(), allShoesFemale.getModel13139372(), allShoesFemale.getModel13012154(), allShoesFemale.getModel13109470(), allShoesFemale.getModel13201269(), allShoesFemale.getModel12778777(), allShoesFemale.getModel13466933());

                            strings = fResponse.getShoeModelIds();
//
                        }

                    }

                    @Override
                    public void onFailure(Call<FemaleShoe> call, Throwable t) {

                    }


                });

            }


        }


    }


    public static void requestTryOn() {
        time = System.currentTimeMillis() / 1000;

        String derivedKey = Encryption.pbkdf2(SECRET_KEY, String.valueOf(time), 128, 32);

        ReqBody req = new ReqBody(new Garments("2b4a9f71ddcd7a7a3b2d61fcb151b211_Vj5g38GBZyLn", "2b4a9f71ddcd7a7a3b2d61fcb151b211_RYm5YWUhAH3o"), "1426558765", "neiman_studio");
        System.out.println(gson.toJson(req));
        Call<TryOn> tryOnCall = ReveryClient.getClient().getTryon(derivedKey, String.valueOf(time),req);
        tryOnCall.enqueue(new Callback<TryOn>() {
            @Override
            public void onResponse(Call<TryOn> call, retrofit2.Response<TryOn> response) {
                if (response.isSuccessful()) {
                    tryOn = response.body();
                    System.out.println(tryOn.getModelMetadata().getUrl());
                } else {
                    try {
                        System.out.println(response.errorBody().string());

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            @Override
            public void onFailure(Call<TryOn> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }


    private static String uploadImageUrl(){
        time = System.currentTimeMillis()/1000;
        String derivedKey = Encryption.pbkdf2(SECRET_KEY, String.valueOf(time), 128, 32);
        final String[] addded = {new String()};
    Call<com.example.models.upload.Response> upload = ReveryClient.getClient().uploadImageUrl(derivedKey,String.valueOf(time),new Upload("tops","male","Gildan","https://cdn11.bigcommerce.com/s-405b0/images/stencil/590x590/products/71/18017/gildan-5000-tee-t-shirt.ca-antique-jade-dome__19096.1637746764.jpg?c=2"));
    upload.enqueue(new Callback<com.example.models.upload.Response>() {
        @Override
        public void onResponse(Call<com.example.models.upload.Response> call, retrofit2.Response<com.example.models.upload.Response> response) {
            if (response.isSuccessful()) {
                com.example.models.upload.Response response1 = response.body();
                assert response1 != null;
                list.add(response1.getGarmentId());
                log.warning("Uploaded ::::"+gson.toJson(response1));

                log.info("Waiting ...");
                log.info("Waiting ....");
                log.info("Waiting .....");
                log.info("Waiting .......");
                log.info("Waiting .........");
                //                List<String> faceIds = face.getModelFiles();
//                var urls = faceIds.stream().map((id) -> "https://media.revery.ai/generated_model_image/"+id+".png").collect(Collectors.toList());
//                urls.forEach(System.out::println);
            }else {
                try{
                    System.out.println(response.errorBody().string());
                }catch(Exception e){

                }
            }}

        @Override
        public void onFailure(Call<com.example.models.upload.Response> call, Throwable t) {

        }
    });
        return addded[0];
    }
    private static void delete(String item){
        time = System.currentTimeMillis()/1000;
        String derivedKey = Encryption.pbkdf2(SECRET_KEY, String.valueOf(time), 128, 32);
        Call<com.example.models.upload.Response> upload = ReveryClient.getClient().delete_garment(derivedKey,String.valueOf(time),new Delete(item));
        upload.enqueue(new Callback<com.example.models.upload.Response>() {
            @Override
            public void onResponse(Call<com.example.models.upload.Response> call, retrofit2.Response<com.example.models.upload.Response> response) {
                if (response.isSuccessful()) {
                    com.example.models.upload.Response response1 = response.body();
                    assert response1 != null;
                    log.warning("deleted ::::"+gson.toJson(response1));

                    //                List<String> faceIds = face.getModelFiles();
//                var urls = faceIds.stream().map((id) -> "https://media.revery.ai/generated_model_image/"+id+".png").collect(Collectors.toList());
//                urls.forEach(System.out::println);
                }else {
                    try{
                        System.out.println(response.errorBody().string());
                    }catch(Exception e){

                    }
                }}

            @Override
            public void onFailure(Call<com.example.models.upload.Response> call, Throwable t) {

            }
        });
    }

}
