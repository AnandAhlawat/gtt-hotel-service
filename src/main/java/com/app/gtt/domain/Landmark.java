package com.app.gtt.domain;

import lombok.Data;

import java.util.Map;

@Data
public class Landmark {
    Map<String,LandmarkLocation> landmarkLocationMap;
}
