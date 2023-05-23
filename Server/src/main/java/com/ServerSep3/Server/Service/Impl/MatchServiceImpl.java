package com.ServerSep3.Server.Service.Impl;
import com.ServerSep3.Server.Model.MatchModel;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Repository.MatchRepository;
import com.ServerSep3.Server.Repository.UserRepository;
import com.ServerSep3.Server.Service.MatchService;
import com.ServerSep3.Server.Service.UserService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {


    private final MatchRepository matchRepository;
    private final UserRepository userRepository;

    public MatchServiceImpl(MatchRepository matchRepository, UserRepository userRepository) {
        this.matchRepository = matchRepository;
        this.userRepository = userRepository;
    }

    @Override
    public MatchModel findById(int id) {
        return matchRepository.findById(id);
    }

    @Override
    public MatchModel updateMatch(MatchModel matchModel) {
        MatchModel existing=matchRepository.findById(matchModel.getId());
        if(isMatch(matchModel)){
            existing.setMatch(true);
        }
        existing.setMatchUser2(matchModel.getMatchUser2());
        existing.setMatchUser1(matchModel.getMatchUser2());
        return matchRepository.save(existing);
    }

    @Override
    public void deleteMatch(long id) {
        matchRepository.deleteById(id);
   }

    @Override
    public List<MatchModel> findByUserId(int id) {
        List<MatchModel> list1=matchRepository.findByUserId1(id);
        List<MatchModel> list2=matchRepository.findByUserId2(id);
        List<MatchModel> resultList = new ArrayList<>();
        resultList.addAll(list1);
        resultList.addAll(list2);
        return resultList;
    }

    @Override
    public boolean isMatch(MatchModel matchModel) {
        Boolean match1= matchModel.getMatchUser1();
        Boolean match2= matchModel.getMatchUser2();
        if(match1 & match2){
            return true;
        }
        return false;
    }


    @Override
    public void CreateMatchForUser(UserModel userModel){
        String gender=userModel.getGender();
        if (gender.equals("m")){
            gender= "f";
        } else  if (gender.equals("f")){
            gender= "m";
        }

        List<UserModel> matchList=userRepository.findByGender(gender);
        for (int i=0;i<matchList.size();i++){
            MatchModel matchModel= new MatchModel();
            matchModel.setUserId1(userModel.getId());
            matchModel.setUserId2(matchList.get(i).getId());

        }
    }

    @Override
    public MatchModel createMatch(MatchModel matchModel) {
        matchModel.setMatchUser1(null);
        matchModel.setMatchUser2(null);
        matchModel.setMatch(null);
        return matchRepository.save(matchModel);
    }


}
