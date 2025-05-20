package com.korit.springboot.controller;

// 요청 URL: /api/age 응답 데이터: { name: 김준일, age: 32 }
// 요청 URL: /api/names 응답 데이터: ["김준일", "김준이", "김준삼"]
// 요청 URL: /api/students 응답 데이터: [{name: 김준일, age: 32}, {name: 김준이, age: 33}]
// 요청 URL: /api/students 응답 데이터:
/*
    [
        {
            name: 김준일,
            age: 32,
            hobby: [축구, 농구]
        },
        {
            name: 김준이,
            age: 33,
            hobby: [골프, 낚시]
        }
    ]
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HttpStudyController2 {

    @GetMapping("/api/age")
    public Map<String, Object> age() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "김준일");
        map.put("age", 32);
        map.put("address", "동래구");

        Map<String, Object> map2 = Map.of("name", "김준일", "age", 32);
        map2.put("address", "동래구");

        return map;
    }

    @GetMapping("/api/names")
    public List<String> names() {
        return List.of("김준일", "김준이", "김준삼");
    }

    @GetMapping("/api/names2")
    public String[] names2() {
        String[] names = {"김준일", "김준이", "김준삼"};
        Object obj = new String[] {"김준일", "김준이", "김준삼"};

        return names;
    }

    @GetMapping("/api/students")
    public List<Map<String, Object>> students() {
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "김준일");
        map1.put("age", 32);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "김준이");
        map2.put("age", 33);

        list.add(map1);
        list.add(map2);

        List<Map<String, Object>>list2 = List.of(map1, map2);

        return List.of(
                Map.of("name", "김준일", "age", 32),
                Map.of("name", "김준이", "age", 33)
        );
    }

}
