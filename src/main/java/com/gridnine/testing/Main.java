package com.gridnine.testing;

import java.util.List;

public class Main {
      public static void main(String[] args) {

            List <Flight> flights =  FlightBuilder.createFlights();
            FlightFilterImpl flightFilter = new FlightFilterImpl();

            System.out.println("All flights:");
            flightFilter.allFlightSegments(flights);
            System.out.println("-----------------------------------");

            System.out.println("Flights with departure before the current time:");
            flightFilter.departureToTheCurrentPointInTime(flights);

            System.out.println("Flights segments, with arrival date earlier than departure date:");
            flightFilter.thereAreSegmentsWithTheArrivalDateEarlierThanTheDepartureDate(flights);

            System.out.println("A flights spent more than two hours on the ground:");
            flightFilter.theTotalTimeSpentOnTheGroundExceedsTwoHours(flights);
      }
}
