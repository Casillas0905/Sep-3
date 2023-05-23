package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Message;
import GrpcClasses.MessagesGrpc;
import com.ServerSep3.Server.Service.MessageService;
import com.ServerSep3.Server.Service.UserService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@GRpcService
public class MessageGrpcIml extends MessagesGrpc.MessagesImplBase {

    @Autowired
    MessageService messageService;



    public MessageGrpcIml() {

    }

    @Override public void findById(Message.MessageIdRequested request, StreamObserver<Message.MessageModel> responseObserver) {
        System.out.println("find by id");
        com.ServerSep3.Server.Model.Message messageModel = messageService.findById(request.getId());

        Message.MessageModel response = Message.MessageModel.newBuilder()
            .setId(messageModel.getId())
            .setMessage(messageModel.getMessage())
            .setChatId(messageModel.getChatId())
            .setDate(messageModel.getDate())
            .setUserSentId(messageModel.getUserSentId())
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }



    @Override public void findAllMessagesForAChat(
        Message.ChatIdRequested request,
        StreamObserver<Message.MessageModel> responseObserver) {
        super.findAllMessagesForAChat(request, responseObserver);
    }

    @Override public void saveMessage(Message.MessageModel request,
        StreamObserver<Message.MessageModel> responseObserver) {
        super.saveMessage(request, responseObserver);
    }

    @Override public void deleteMessage(Message.MessageIdRequested request,
        StreamObserver<Message.MessageDeleted> responseObserver) {
        super.deleteMessage(request, responseObserver);
    }
}
