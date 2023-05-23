package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Chat;
import GrpcClasses.ChatsGrpc;
import GrpcClasses.Event;
import GrpcClasses.EventsGrpc;
import io.grpc.stub.StreamObserver;

public class EventGrpcIml extends EventsGrpc.EventsImplBase {

    @Override public void findAllEvents(Event.Empty request,
        StreamObserver<Event.EventModel> responseObserver) {
        super.findAllEvents(request, responseObserver);
    }

    @Override public void findById(Event.EventIdRequest request,
        StreamObserver<Event.EventModel> responseObserver) {
        super.findById(request, responseObserver);
    }

    @Override public void saveEvent(Event.EventModel request,
        StreamObserver<Event.EventModel> responseObserver) {
        super.saveEvent(request, responseObserver);
    }

    @Override public void updateEvent(Event.EventModel request,
        StreamObserver<Event.EventModel> responseObserver) {
        super.updateEvent(request, responseObserver);
    }

    @Override public void deleteEvent(Event.EventIdRequest request,
        StreamObserver<Event.Empty> responseObserver) {
        super.deleteEvent(request, responseObserver);
    }
}
