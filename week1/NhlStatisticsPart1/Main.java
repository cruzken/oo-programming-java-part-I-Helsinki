
/**
 *
 * @author www.github.com/cruzken
 */

import java.util.Scanner;
import nhlstats.NHLStatistics;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
         
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("");
         
        System.out.println("Top 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("");
         
        System.out.println("Stats for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("");
         
        System.out.println("Stats for Philadelhia Flysers");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("");
         
        System.out.println("Stats of ANA by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
         
    }
}