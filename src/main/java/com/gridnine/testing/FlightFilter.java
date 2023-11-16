package com.gridnine.testing;

import java.util.List;

/**
 * Interface for the FlightFilterImpl class
 */
public interface FlightFilter {

      List <Flight> departureToTheCurrentPointInTime (List <Flight> flights); // Вылет до текущего момента времени:

      List<Flight> thereAreSegmentsWithTheArrivalDateEarlierThanTheDepartureDate (List <Flight> flights); // Сегменты с датой прилёта раньше даты вылета

      List<Flight> theTotalTimeSpentOnTheGroundExceedsTwoHours (List <Flight> flights); //Перелеты, где общее время, проведённое на земле, превышает два часа

      void allFlightSegments (List <Flight> flights); // все сегменты полета
}
