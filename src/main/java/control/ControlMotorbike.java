package control;

import infomotorbike.GeneralInfo;

import java.util.ArrayList;

public class ControlMotorbike {
    private ArrayList<GeneralInfo> infos = new ArrayList<>();

    public boolean save(GeneralInfo info){
        if(info != null){
            infos.add(info);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<GeneralInfo> returnAll(){
        return infos;
    }
}
