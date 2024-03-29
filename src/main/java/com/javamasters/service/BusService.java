package com.javamasters.service;

import com.javamasters.request.BusRequestDto;
import com.javamasters.response.BusResponseDto;


public interface BusService {

    BusResponseDto getBus(String id);

    BusResponseDto addBus(BusRequestDto busRequestDto);

    BusResponseDto updateBus(String id, BusRequestDto busRequestDto);

    BusResponseDto deleteBus(String id);

}
