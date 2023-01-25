package com.example.BiletOtomasyonu.filter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RouteFilter {
    private String from;
    private String to;

//    List<Route> routes = new ArrayList<>();
//    List<Route> fromList = (List<Route>) routes.stream().filter(route -> route.getFrom()== this.from)
//            .collect(Collectors.toList());
//    List<Route> toList = (List<Route>) routes.stream().filter(route -> route.getTo()== this.to)
//            .collect(Collectors.toList());

}
