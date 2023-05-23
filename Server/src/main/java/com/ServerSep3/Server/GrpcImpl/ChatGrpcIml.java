package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.ChatsGrpc;
import com.ServerSep3.Server.Service.ChatService;
import io.grpc.stub.StreamObserver;

public class ChatGrpcIml extends ChatsGrpc.ChatsImplBase {

    ChatService chatService;


    @Override public void findById(GrpcClasses.Chat.lookUpById request,
        StreamObserver<GrpcClasses.Chat.ChatModel> responseObserver) {
        super.findById(request, responseObserver);
    }

    @Override public void saveChat(GrpcClasses.Chat.ChatModel request,
        StreamObserver<GrpcClasses.Chat.ChatModel> responseObserver) {
        super.saveChat(request, responseObserver);
    }

    @Override public void deleteChat(GrpcClasses.Chat.lookUpById request,
        StreamObserver<GrpcClasses.Chat.Empty> responseObserver) {
        super.deleteChat(request, responseObserver);
    }

    @Override public void findByUserId(GrpcClasses.Chat.lookUpByUserId request,
        StreamObserver<GrpcClasses.Chat.ChatModel> responseObserver) {
        super.findByUserId(request, responseObserver);
    }
}
