package day32_arrays_split;

import java.util.*;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("---- Starting deployment of Etsy app to AWS zones....");

        String []zonesToDeploy = zones.split(",");
        System.out.println(app+ " = "+ Arrays.toString(zonesToDeploy));

        for(String each:zonesToDeploy){
            System.out.println("Deploying ["+app+"]" + each +"....");
            System.out.println("Deployment completed for " + each +".....");
        }

        System.out.println("--- All deployments complete, traffic enabled ----");

    }
}
