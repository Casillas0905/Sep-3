package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.EventModel;
import com.ServerSep3.Server.Model.MatchModel;
import com.ServerSep3.Server.Model.Message;
import com.ServerSep3.Server.Model.UserModel;

import java.util.List;

public interface MatchService {
    MatchModel findById(int id);
    MatchModel updateMatch(MatchModel matchModel);
    void deleteMatch(MatchModel matchModel);
    List<MatchModel> findByUserId(int id);
    boolean isMatch(MatchModel matchModel);
    void CreateMatchForUser(UserModel userModel);
    MatchModel createMatch(MatchModel matchModel);
}