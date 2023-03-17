package com.fm.repository;

import com.fm.unit.*;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PlayerQuery {
    public static List<Player> query(List<Player> players, List<Predicate<Player>> conditions){
        //your code here
        List<Player> playerList = players.stream().filter(p ->{
            for (Predicate<Player> c:conditions){
                if (!c.test(p)) return false;
            }
            return true;
        }).collect(Collectors.toList());
        return playerList;
    }
}