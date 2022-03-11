package com.company.Event;

public class Event1 {

        public int eventId;
        public  String eventName;
        public  String eventType;
        public String eventStartDate;
        public String eventEndDate;
        public String eventSponser;

        public Event1(int eventId, String eventName, String eventType, String eventStartDate, String eventEndDate, String eventSponser) {
            this.eventId = eventId;
            this.eventName = eventName;
            this.eventType = eventType;
            this.eventStartDate = eventStartDate;
            this.eventEndDate = eventEndDate;
            this.eventSponser = eventSponser;
        }


        @Override
        public String toString() {
            return "Event1{" +
                    "eventId=" + eventId +
                    ", eventName='" + eventName + '\'' +
                    ", eventType='" + eventType + '\'' +
                    ", eventStartDate='" + eventStartDate + '\'' +
                    ", eventEndDate='" + eventEndDate + '\'' +
                    ", eventSponser='" + eventSponser + '\'' +
                    '}';
        }
}



