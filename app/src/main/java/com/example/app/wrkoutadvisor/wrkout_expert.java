package com.example.app.wrkoutadvisor;

import java.util.*;

public class wrkout_expert {
    List <String> getWrkouts (String wrkouttypes){

        List <String> workout= new ArrayList<String>();
        if(wrkouttypes.equals("Chest")){
            workout.add("Bench Press");
            workout.add("Cable Flys");
        }
        else if(wrkouttypes.equals("Biceps")){
            workout.add("Biceps Curls");
        }
        else if(wrkouttypes.equals("Triceps")){
            workout.add("Tricep Ext");
            workout.add("Tricep Pushdown");
        }
        else if(wrkouttypes.equals("Shoulders")){
            workout.add("Shoulder Press");
        }

        return workout;
    }
}
