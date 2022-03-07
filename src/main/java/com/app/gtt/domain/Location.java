package com.app.gtt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    String zipCode;
    String city;
    String state;
    String country;
    String longitude;
    String latitude;
}
