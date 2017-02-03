package com.origins.controller;

import com.origins.dao.KeyValue;
import com.origins.service.PieChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Amila-Kumara on 03/02/2017.
 */
@Controller
public class PieChartController {

    @Autowired
    private PieChartService pieChartService;

    @RequestMapping("/piechart")
    public String springMVC(ModelMap modelMap) {
        List<KeyValue> pieDataList = pieChartService.getPieChartData();
        modelMap.addAttribute("pieDataList", pieDataList);
        return "spring";
    }

}