package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Message;
import GrpcClasses.MessagesGrpc;
import com.ServerSep3.Server.Model.MessageModel;
import com.ServerSep3.Server.Service.Impl.MessageServiceImpl;
import com.ServerSep3.Server.Service.MessageService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@GRpcService
public class MessageGrpcImpl extends MessagesGrpc.MessagesImplBase {

    @Autowired
    MessageService service;

    @Override
    public void findById(Message.MessageIdRequested request, StreamObserver<Message.MessageModel> responseObserver) {
        MessageModel messageModel = service.findById(request.getId());
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

    @Override
    public void findAllMessagesForAChat(Message.ChatIdRequested request, StreamObserver<Message.MessageModel> responseObserver) {

        System.out.println("find all messages");
        List<MessageModel> list = service.findAllMessagesForAChat(request.getChatId());
        List<Message.MessageModel> listGrpc = new ArrayList<>();
        for (int i=0;i< list.size();i++){
            Message.MessageModel messageModel = Message.MessageModel.newBuilder()
                .setId(list.get(i).getId())
                .setMessage(list.get(i).getMessage())
                .setChatId(list.get(i).getChatId())
                .setDate(list.get(i).getDate())
                .setUserSentId(list.get(i).getUserSentId())
                .build();
            listGrpc.add(messageModel);
        }
        for (Message.MessageModel messageModel : listGrpc) {
            responseObserver.onNext(messageModel);
        }
        responseObserver.onCompleted();
        System.out.println("Messages send");
    }

    @Override
    public void saveMessage(Message.MessageModel request, StreamObserver<Message.MessageModel> responseObserver) {
        System.out.println("Save message");
        service.saveMessage(new MessageModel(request.getId(), request.getUserSentId(), request.getChatId(), request.getDate(), request.getDate()));
        responseObserver.onCompleted();
        System.out.println("Message saved");
    }

    @Override
    public void deleteMessage(Message.MessageIdRequested request, StreamObserver<Message.MessageDeleted> responseObserver) {
        System.out.println("deleting message");
        service.deleteMessage((long) request.getId());
        responseObserver.onCompleted();
        System.out.println("Message deleted");
    }
}
