package com.app.gtt.service;

import com.app.gtt.collections.HotelCollection;
import com.app.gtt.domain.*;
import com.app.gtt.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.*;

@RestController
@RequestMapping("/gtt/api")
public class HotelController {
    @Autowired
    HotelRepository hotelRepository;

    @GetMapping("/createHotel")
    public ResponseEntity<HotelCollection> createHotel() {

        HotelCollection hotelCollection = new HotelCollection();
        hotelCollection.setId("1");
        hotelCollection.setHotelName("The Leela Hotel");
        hotelCollection.setGroupName("Leela Hotels");
        hotelCollection.setCategories(new ArrayList<>(Arrays.asList("Luxury", "Business Hotel")));
        hotelCollection.setImages(new ArrayList<>(Arrays.asList(new Image("https://gtt.cdn/image1", "Banner Image 1"),
                new Image("https://gtt.cdn/image2", "Banner Image 2"))));
        hotelCollection.setLocation(new Location("110043","Delhi","Delhi","India","4023","34235"));

        Map<String,List<String>> feature = new HashMap<>();
        feature.put("coupleFriendly", new ArrayList<>(Arrays.asList("Security Guard & 24*7 Camera Surveillance At Public Areas/floor with one-week backup",
                "In-room Telephone assistance",
                "Room to be allocated near elevator/emergency exit (subject to availability")));
        hotelCollection.setFeatures(feature);

        Voucher voucher = new Voucher();
        voucher.setVoucherId("voucher001");
        voucher.setVoucherName("holi-voucher");
        hotelCollection.setVoucher(new ArrayList<>(Arrays.asList(voucher)));

        Promo promo = new Promo();
        promo.setPromoId("promo001");
        promo.setPromoName("15% off Promo");

        Price price = new Price(new BigDecimal(5000.00), new BigDecimal(4000.00), new BigDecimal(1000.00));
        hotelCollection.setPrice(price);

        Feedback feedback = new Feedback("4.89",10);
        hotelCollection.setFeedback(feedback);
        hotelCollection.setStarRating(5);

        Map<String,String> liveStats = new HashMap<>();
        liveStats.put("currentlyViewing","2");
        liveStats.put("lastBooked","9 hours ago");
        hotelCollection.setLiveStats(liveStats);

        hotelRepository.save(hotelCollection);
        return new ResponseEntity(HttpStatus.OK);
    }
}
