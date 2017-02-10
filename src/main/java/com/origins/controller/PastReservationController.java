package com.origins.controller;

import com.origins.dao.SearchData;
import com.origins.domain.tables.Reservations;
import com.origins.domain.tables.Resources;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * Created by Amila-Kumara on 03/02/2017.
 */
@Controller
public class PastReservationController {

    @Autowired
    private DSLContext dsl;

    @RequestMapping("/passedReservations")
    public String init(final ModelMap modelMap) {
        modelMap.addAttribute("searchData", new SearchData());
        return "passedReservations";
    }

    @RequestMapping(value = "/passedReservations",params = {"search"})
    public String searchData(final ModelMap modelMap,final SearchData searchData) {

        List<String> years = Arrays.asList("02-01", "02-01", "02-03", "01-04", "01-05", "01-06", "01-07");

        Result<Record> fetch = dsl.select().from(Reservations.RESERVATIONS).innerJoin(Resources.RESOURCES).on(Reservations.RESERVATIONS.RESOURCE_ID.equal(Resources.RESOURCES.ID)).fetch();

        System.out.println(fetch);
        final List<Map> mapList=new ArrayList<>();

        //|id|resource_id|user_id|name|address|nic_number|conact_number|email_address|start|end|created_at|updated_at|id|category_id|name|location|description|created_at|updated_at|
        //|0 |1          |2      |3   |4      |5         |6            |7            |8    |9  |10        |11        |12|13         |14  |15      |16         |17        |18        |
        fetch.stream().forEach(i->{
            System.out.println(i);
            System.out.println(i.getValue(1));
            System.out.println(i.getValue(3));
        });

        Map<String,Object> map1=new HashMap<>();
        Map<String,Object> map2=new HashMap<>();
        Map<String,Object> map3=new HashMap<>();
        Map<String,Object> map4=new HashMap<>();
        Map<String,Object> map5=new HashMap<>();
        Map<String,Object> map6=new HashMap<>();
        Map<String,Object> map7=new HashMap<>();
        Map<String,Object> map8=new HashMap<>();
        map1.put("name","Quis");
        map1.put("data",Arrays.asList(0, 0, 0, 1, 2, 8, 0));

        map2.put("name","Ducimus");
        map2.put("data",Arrays.asList(0, 0, 0, 2, 2, 7, 0));

        map3.put("name","Aliquid");
        map3.put("data",Arrays.asList(0, 0, 0, 3, 1, 6, 0));

        map4.put("name","Doloribus");
        map4.put("data",Arrays.asList(0, 0, 0, 4, 1, 5, 0));

        map5.put("name","Laborum");
        map5.put("data",Arrays.asList(0, 0, 0, 5, 1, 4, 0));

        map6.put("name","Aut");
        map6.put("data",Arrays.asList(0, 0, 0, 6, 1, 3, 0));

        map7.put("name","Cum");
        map7.put("data",Arrays.asList(0, 0, 0, 7, 1, 2, 0));

        map8.put("name","Reprehenderit");
        map8.put("data",Arrays.asList(0, 0, 0, 8, 1, 1, 0));

        if (searchData.getResource().equalsIgnoreCase("Quis")){
            mapList.add(map1);
        }else if (searchData.getResource().equalsIgnoreCase("Ducimus")){
            mapList.add(map2);
        }else if (searchData.getResource().equalsIgnoreCase("Aliquid")){
            mapList.add(map3);
        }else if (searchData.getResource().equalsIgnoreCase("Doloribus")){
            mapList.add(map4);
        }else if (searchData.getResource().equalsIgnoreCase("Laborum")){
            mapList.add(map5);
        }else if (searchData.getResource().equalsIgnoreCase("Aut")){
            mapList.add(map6);
        }else if (searchData.getResource().equalsIgnoreCase("Cum")){
            mapList.add(map7);
        }else if (searchData.getResource().equalsIgnoreCase("Reprehenderit")){
            mapList.add(map8);
        }else{
            mapList.add(map1);
            mapList.add(map2);
            mapList.add(map3);
            mapList.add(map4);
            mapList.add(map5);
            mapList.add(map6);
            mapList.add(map7);
            mapList.add(map8);
        }
        modelMap.addAttribute("searchData", new SearchData());
        modelMap.addAttribute("yearsData", years);
        modelMap.addAttribute("data", mapList);
        return "passedReservations";
    }

}