package com.badi.common.utils;

import android.content.Context;
import com.badi.R;
import com.badi.data.entity.SimpleCity;

import java.util.ArrayList;
import java.util.List;

/**
 * Util for creating the predefined list of cities.
 */
public class CityHomeUtil {

    public static List<SimpleCity> createPredefinedCitiesOfSpain(Context context){
        List<SimpleCity> citiesOfSpain = new ArrayList<>();

        citiesOfSpain.add(new SimpleCity(context.getResources().getString(R.string.address_barcelona),
                context.getResources().getString(R.string.place_id_barcelona),
                context.getResources().getDrawable(R.drawable.img_search_barcelona_small)));
        citiesOfSpain.add(new SimpleCity(context.getResources().getString(R.string.address_madrid),
                context.getResources().getString(R.string.place_id_madrid),
                context.getResources().getDrawable(R.drawable.img_search_madrid_small),
                context.getResources().getDrawable(R.drawable.img_search_madrid_large)));
        citiesOfSpain.add(new SimpleCity(context.getResources().getString(R.string.address_valencia),
                context.getResources().getString(R.string.place_id_valencia),
                context.getResources().getDrawable(R.drawable.img_search_valencia_small),
                context.getResources().getDrawable(R.drawable.img_search_valencia_large)));
        citiesOfSpain.add(new SimpleCity(context.getResources().getString(R.string.address_sevilla),
                context.getResources().getString(R.string.place_id_sevilla),
                context.getResources().getDrawable(R.drawable.img_search_seville_small),
                context.getResources().getDrawable(R.drawable.img_search_seville_small)));
        citiesOfSpain.add(new SimpleCity(context.getResources().getString(R.string.address_granada),
                context.getResources().getString(R.string.place_id_granada),
                context.getResources().getDrawable(R.drawable.img_search_granada_small)));
        citiesOfSpain.add(new SimpleCity(context.getResources().getString(R.string.address_malaga),
                context.getResources().getString(R.string.place_id_malaga),
                context.getResources().getDrawable(R.drawable.img_search_malaga_small)));
        citiesOfSpain.add(new SimpleCity(context.getResources().getString(R.string.address_bilbo),
                context.getResources().getString(R.string.place_id_bilbo),
                context.getResources().getDrawable(R.drawable.img_search_bilbao_small)));
        citiesOfSpain.add(new SimpleCity(context.getResources().getString(R.string.address_alacant),
                context.getResources().getString(R.string.place_id_alacant),
                context.getResources().getDrawable(R.drawable.img_search_alicante_small)));
        citiesOfSpain.add(new SimpleCity(context.getResources().getString(R.string.address_salamanca),
                context.getResources().getString(R.string.place_id_salamanca),
                context.getResources().getDrawable(R.drawable.img_search_salamanca_small)));

        return citiesOfSpain;
    }

    public static List<SimpleCity> createPredefinedCitiesOfItaly(Context context) {
        List<SimpleCity> citiesOfItaly = new ArrayList<>();

        citiesOfItaly.add(new SimpleCity(context.getResources().getString(R.string.address_roma),
                context.getResources().getString(R.string.place_id_roma),
                context.getResources().getDrawable(R.drawable.img_search_rome_small)));
        citiesOfItaly.add(new SimpleCity(context.getResources().getString(R.string.address_milano),
                context.getResources().getString(R.string.place_id_milano),
                context.getResources().getDrawable(R.drawable.img_search_milan_small)));
        citiesOfItaly.add(new SimpleCity(context.getResources().getString(R.string.address_bologna),
                context.getResources().getString(R.string.place_id_bologna),
                context.getResources().getDrawable(R.drawable.img_search_bologna_small)));
        citiesOfItaly.add(new SimpleCity(context.getResources().getString(R.string.address_firenze),
                context.getResources().getString(R.string.place_id_bologna),
                context.getResources().getDrawable(R.drawable.img_search_florence_small)));
        citiesOfItaly.add(new SimpleCity(context.getResources().getString(R.string.address_pisa),
                context.getResources().getString(R.string.place_id_pisa),
                context.getResources().getDrawable(R.drawable.img_search_pisa_small)));

        return citiesOfItaly;
    }

    public static List<SimpleCity> createPredefinedSuggestedCities(Context context) {
        List<SimpleCity> suggestedCities = new ArrayList<>();

        suggestedCities.add(new SimpleCity(context.getResources().getString(R.string.address_bologna),
                context.getResources().getString(R.string.place_id_bologna),
                context.getResources().getDrawable(R.drawable.img_search_bologna_small)));
        suggestedCities.add(new SimpleCity(context.getResources().getString(R.string.address_barcelona),
                context.getResources().getString(R.string.place_id_barcelona),
                context.getResources().getDrawable(R.drawable.img_search_barcelona_large)));

        return suggestedCities;
    }
}
