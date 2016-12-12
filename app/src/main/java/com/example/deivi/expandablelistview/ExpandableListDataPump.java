package com.example.deivi.expandablelistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> PDAM = new ArrayList<String>();
        PDAM.add("Iñigo");
        PDAM.add("Esteban");
        PDAM.add("Jose");
        PDAM.add("Francisco");

        List<String> SDAM = new ArrayList<String>();
        SDAM.add("David");
        SDAM.add("Andres");
        SDAM.add("Armando");
        SDAM.add("Valentin");
        SDAM.add("Adolfo");

        expandableListDetail.put("1º DAM", PDAM);
        expandableListDetail.put("2º DAM", SDAM);
        return expandableListDetail;
    }
}