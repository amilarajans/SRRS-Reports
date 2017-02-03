package com.origins.dao;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Amila-Kumara on 03/02/2017.
 */
@Component
public class PieChartDaoImpl implements PieChartDao{
    @Override
    public List<KeyValue> getPieChartData() {
        return PieChartData.getPieDataList();
    }
}
