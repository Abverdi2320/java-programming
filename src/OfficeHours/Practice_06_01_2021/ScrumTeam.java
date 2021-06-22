package OfficeHours.Practice_06_01_2021;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ScrumTeam {
    String productOwner;
    String scrumMaster;
    String businessAnalyst;
    ArrayList<Tester>allTesters = new ArrayList<>();
    ArrayList<Developer>allDevelopers = new ArrayList<>();
    int sprintNumber;

    public ScrumTeam(String productOwner,String scrumMaster, String businessAnalyst){
        this.productOwner=productOwner;
        this.scrumMaster=scrumMaster;
        this.businessAnalyst=businessAnalyst;
        allDevelopers = new ArrayList<>();
        allDevelopers = new ArrayList<>();

    }
}
