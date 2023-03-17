package com.fm.repository;

import com.fm.game.*;
import com.fm.unit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PlayerSearchPredicateFactory {
    public static List<Predicate<Player>> makeConditions(List<SearchCondition> searchConditions){
        List<Predicate<Player>> conditionList = new ArrayList<Predicate<Player>>() ;
        for (SearchCondition s: searchConditions){
            if (s.getField().equals("name")){
                conditionList.add( c -> c.getName().contains(s.getCondition()));
            }
            if (s.getField().equals("club")){
                conditionList.add( c -> c.getClub().contains(s.getCondition()));
            }
            if (s.getField().equals("nationality")){
                conditionList.add( c -> c.getNationality().contains(s.getCondition()));
            }
            if (s.getField().equals("position")){
                conditionList.add( c -> {
                    for(String position :c.getPositions()){
                        if (position.equals(s.getCondition())){
                            return true;
                        }
                    }
                    return false;
                });
            }
        }
        return conditionList;

    }
}
