package com.agoda.clone.agoda.mapper;

import com.agoda.clone.agoda.dto.BreakfastDto;
import com.agoda.clone.agoda.dto.PropertyDetailsDto;
import com.agoda.clone.agoda.dto.PropertyRequest;
import com.agoda.clone.agoda.dto.PropertyResponse;
import com.agoda.clone.agoda.dto.RestaurantDto;
import com.agoda.clone.agoda.dto.ReviewDto;
import com.agoda.clone.agoda.dto.RoomResponse;
import com.agoda.clone.agoda.model.Breakfast;
import com.agoda.clone.agoda.model.Offer;
import com.agoda.clone.agoda.model.Policy;
import com.agoda.clone.agoda.model.Property;
import com.agoda.clone.agoda.model.PropertyDetail;
import com.agoda.clone.agoda.model.Restaurant;
import com.agoda.clone.agoda.model.Room;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface PropertyMapper {
    
    @Mapping(target = "ID", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "type", source = "type")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "shortDescription", source = "shortDescription")
    @Mapping(target = "lat", source = "lat")
    @Mapping(target = "lng", source = "lng")
    @Mapping(target = "area", source = "area")
    @Mapping(target = "checkInStart", source = "checkInStart")
    @Mapping(target = "checkInEnd", source = "checkInEnd")
    @Mapping(target = "checkOut", source = "checkOut")
    @Mapping(target = "announcements", source = "announcements")
    @Mapping(target = "star", source = "star")
    @Mapping(target = "address", source = "address")
    @Mapping(target = "buildingFloorUnit", source = "buildingFloorUnit")
    @Mapping(target = "country", source = "country")
    @Mapping(target = "state", source = "state")
    @Mapping(target = "city", source = "city")
    @Mapping(target = "zip", source = "zip")
    @Mapping(target = "createdby", source = "createdby")
    @Mapping(target = "createdat" , expression  = "java(java.time.Instant.now())")
    @Mapping(target = "modifiedby", source = "modifiedby")
    @Mapping(target = "modifiedat" , expression  = "java(java.time.Instant.now())")
    @Mapping(target = "deletedby", constant = "")
    @Mapping(target = "deletedat", expression = "java(java.time.Instant.ofEpochSecond(0))")
    Property map(PropertyRequest propertyRequest);

    @Mapping(target = "smoking", source = "propertyRequest.smoking")
    @Mapping(target = "lounges", source = "propertyRequest.lounges")
    @Mapping(target = "floors", source = "propertyRequest.floors")
    @Mapping(target = "restaurants", source = "propertyRequest.restaurants")
    @Mapping(target = "rooms", source = "propertyRequest.rooms")
    @Mapping(target = "voltage", source = "propertyRequest.voltage")
    @Mapping(target = "open", source = "propertyRequest.open")
    @Mapping(target = "renovation", source = "propertyRequest.renovation")
    @Mapping(target = "createdby", source = "propertyRequest.createdby")
    @Mapping(target = "createdat" , expression  = "java(java.time.Instant.now())")
    @Mapping(target = "modifiedby", source = "propertyRequest.modifiedby")
    @Mapping(target = "modifiedat" , expression  = "java(java.time.Instant.now())")
    @Mapping(target = "deletedby", constant = "")
    @Mapping(target = "deletedat", expression = "java(java.time.Instant.ofEpochSecond(0))")
    PropertyDetail mapPropertyDetail(PropertyRequest propertyRequest);

    @Mapping(target = "infant", source = "infant")
    @Mapping(target = "infantextra", source = "infantextra")
    @Mapping(target = "children", source = "children")
    @Mapping(target = "childrenextra", source = "childrenextra")
    @Mapping(target = "other", source = "other")
    @Mapping(target = "createdby", source = "createdby")
    @Mapping(target = "createdat" , expression  = "java(java.time.Instant.now())")
    @Mapping(target = "modifiedby", source = "modifiedby")
    @Mapping(target = "modifiedat" , expression  = "java(java.time.Instant.now())")
    @Mapping(target = "deletedby", constant = "")
    @Mapping(target = "deletedat", expression = "java(java.time.Instant.ofEpochSecond(0))")
    Policy mapPolicy(PropertyRequest propertyRequest);

    @Mapping(target = "name", source = "breakfastDto.name")
    @Mapping(target = "createdby" , source = "breakfastDto.createdby")
    @Mapping(target = "createdat" , expression  = "java(java.time.Instant.now())")
    @Mapping(target = "modifiedby" , source = "breakfastDto.modifiedby")
    @Mapping(target = "modifiedat" , expression  = "java(java.time.Instant.now())")
    @Mapping(target = "deletedby", constant = "")
    @Mapping(target = "deletedat", expression = "java(java.time.Instant.ofEpochSecond(0))")
    Breakfast mapToBreakfast(BreakfastDto breakfastDto);

    @Mapping(target = "name", source = "restaurantDto.name")
    @Mapping(target = "cuisine" , source = "restaurantDto.cuisine")
    @Mapping(target = "menu" , source = "restaurantDto.menu")
    @Mapping(target = "createdby" , source = "restaurantDto.createdby")
    @Mapping(target = "createdat" , expression  = "java(java.time.Instant.now())")
    @Mapping(target = "modifiedby" , source = "restaurantDto.modifiedby")
    @Mapping(target = "modifiedat" , expression  = "java(java.time.Instant.now())")
    @Mapping(target = "deletedby", constant = "")
    @Mapping(target = "deletedat", expression = "java(java.time.Instant.ofEpochSecond(0))")
    Restaurant mapToRestaurant(RestaurantDto restaurantDto);
    
    @Mapping(target = "id", source = "property.ID")
    @Mapping(target = "name", source = "property.name")
    @Mapping(target = "type", source = "property.type")
    @Mapping(target = "description", source = "property.description")
    @Mapping(target = "shortDescription", source = "property.shortDescription")
    @Mapping(target = "lat", source = "property.lat")
    @Mapping(target = "lng", source = "property.lng")
    @Mapping(target = "area", source = "property.area")
    @Mapping(target = "checkInStart", source = "property.checkInStart")
    @Mapping(target = "checkInEnd", source = "property.checkInEnd")
    @Mapping(target = "checkOut", source = "property.checkOut")
    @Mapping(target = "announcements", source = "property.announcements")
    @Mapping(target = "star", source = "property.star")
    @Mapping(target = "address", source = "property.address")
    @Mapping(target = "buildingFloorUnit", source = "property.buildingFloorUnit")
    @Mapping(target = "country", source = "property.country")
    @Mapping(target = "state", source = "property.state")
    @Mapping(target = "city", source = "property.city")
    @Mapping(target = "zip", source = "property.zip")
    @Mapping(target = "propertyDetail", source = "property.propertyDetail")
    @Mapping(target = "restaurant", source = "property.restaurant")
    @Mapping(target = "breakfast", source = "property.breakfast")
    @Mapping(target = "room", source = "property.room")
    @Mapping(target = "offer", source = "Offer")
    @Mapping(target = "totalReview", source = "totalReview")
    @Mapping(target = "reviews", source = "reviews")
    PropertyResponse mapToResponse(Property property, long totalReview, List<Offer> Offer, List<ReviewDto> reviews);

    List<Restaurant> mapToRestaurants(List<RestaurantDto> restaurantDto);

    List<Breakfast> mapToBreakfasts(List<BreakfastDto> breakfastDto);

    @Mapping(target = "id", source="ID")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "property", source = "room.property")
    RoomResponse mapToRoomResponse(Room room);

    @Mapping(target = "id", source = "property.ID")
    @Mapping(target = "name", source = "property.name")
    @Mapping(target = "type", source = "property.type")
    @Mapping(target = "description", source = "property.description")
    @Mapping(target = "shortDescription", source = "property.shortDescription")
    @Mapping(target = "lat", source = "property.lat")
    @Mapping(target = "lng", source = "property.lng")
    @Mapping(target = "area", source = "property.area")
    @Mapping(target = "checkInStart", source = "property.checkInStart")
    @Mapping(target = "checkInEnd", source = "property.checkInEnd")
    @Mapping(target = "checkOut", source = "property.checkOut")
    @Mapping(target = "announcements", source = "property.announcements")
    @Mapping(target = "star", source = "property.star")
    @Mapping(target = "address", source = "property.address")
    @Mapping(target = "buildingFloorUnit", source = "property.buildingFloorUnit")
    @Mapping(target = "country", source = "property.country")
    @Mapping(target = "state", source = "property.state")
    @Mapping(target = "city", source = "property.city")
    @Mapping(target = "zip", source = "property.zip")
    @Mapping(target = "propertyDetail", source = "property.propertyDetail")
    @Mapping(target = "restaurant", source = "property.restaurant")
    @Mapping(target = "breakfast", source = "property.breakfast")
    @Mapping(target = "room", source = "property.room")
    @Mapping(target = "totalReview", source = "totalReview")
    @Mapping(target = "reviews", source = "reviews")
    PropertyDetailsDto mapTpPropertyDetailsDto(Property property, long totalReview, List<ReviewDto> reviews);
}
