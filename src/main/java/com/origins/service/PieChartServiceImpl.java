package com.origins.service;

import com.origins.dao.KeyValue;
import com.origins.dao.PieChartDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Amila-Kumara on 03/02/2017.
 */
@Service
public class PieChartServiceImpl implements PieChartService {

    @Autowired
    private PieChartDao pieChartDao;

    public void setPieChartDao(PieChartDao pieChartDao) {
        this.pieChartDao = pieChartDao;
    }

    @Override
    public List<KeyValue> getPieChartData() {
        return pieChartDao.getPieChartData();
    }
}
