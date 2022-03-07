package com.app.gtt.collections;

import com.app.gtt.domain.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@Document(collection = "hotel_collection")
public class HotelCollection {
    @Id
    String id;

    String groupName;
    String hotelName;
    Location location;
    List<Image> images;
    List<String> categories;
    Map<String,List<String>> features;
    List<Voucher> voucher;
    List<Promo> promos;
    Price price;
    Integer starRating;
    Map<String,String>  liveStats;
    List<Landmark> landmarks;
    Feedback feedback;

}
