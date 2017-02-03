package com.origins.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amila-Kumara on 03/02/2017.
 */
public class PieChartData {
    private static final List<KeyValue> pieDataList;

    static {
        pieDataList = new ArrayList<>();
        pieDataList.add(new KeyValue("Russia", "17098242"));
        pieDataList.add(new KeyValue("Canada", "9984670"));
        pieDataList.add(new KeyValue("USA", "9826675"));
        pieDataList.add(new KeyValue("China", "9596961"));
        pieDataList.add(new KeyValue("Brazil", "8514877"));
        pieDataList.add(new KeyValue("Australia", "7741220"));
        pieDataList.add(new KeyValue("India", "3287263"));
    }

    public static List<KeyValue> getPieDataList() {
        return pieDataList;
    }

}
