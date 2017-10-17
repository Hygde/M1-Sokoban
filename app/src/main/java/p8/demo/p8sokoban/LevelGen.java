package p8.demo.p8sokoban;

/**
 * Created by Samuel on 12/10/2017.
 */

public class LevelGen {
    static final int    CST_block     = 0;
    static final int    CST_diamant   = 1;
    static final int    CST_perso     = 2;
    static final int    CST_zone      = 3;
    static final int    CST_vide      = 4;

    public static int [][] MapGen2(){
        int [][] map = {
                {CST_vide, CST_block, CST_block,CST_block, CST_block, CST_block, CST_block, CST_block, CST_block, CST_vide},
                {CST_block, CST_block, CST_block,CST_vide, CST_vide, CST_vide, CST_vide, CST_block, CST_block, CST_block},
                {CST_block, CST_block, CST_vide,CST_vide, CST_vide, CST_vide, CST_vide, CST_vide, CST_vide, CST_block},
                {CST_block, CST_vide, CST_vide, CST_block, CST_block, CST_vide, CST_block, CST_vide, CST_vide, CST_block},
                {CST_block, CST_vide, CST_vide, CST_vide, CST_vide, CST_vide, CST_vide, CST_zone, CST_vide, CST_block},
                {CST_block, CST_vide, CST_vide, CST_vide, CST_vide, CST_block, CST_vide, CST_block, CST_vide, CST_block},
                {CST_block, CST_vide, CST_zone, CST_block, CST_zone, CST_block, CST_vide, CST_vide, CST_vide, CST_block},
                {CST_block, CST_vide, CST_vide, CST_vide, CST_vide, CST_vide, CST_vide, CST_vide, CST_vide, CST_block},
                {CST_block, CST_block, CST_vide,CST_vide, CST_block, CST_zone, CST_vide, CST_vide, CST_block, CST_block},
                {CST_vide, CST_block, CST_block,CST_block, CST_block, CST_block, CST_block, CST_block, CST_block, CST_vide}
        };
        return map;
    }

    public static int[][] diamants_2(){
       int[][] diamants = {
           {2, 3},
           {2, 6},
           {4, 2},
           {6, 6}
       };
       return diamants;
    }
}
