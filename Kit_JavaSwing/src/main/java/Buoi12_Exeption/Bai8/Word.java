/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi12_Exeption.Bai8;

import java.util.Comparator;

/**
 *
 * @author NAM SYSTEM
 */
public class Word {

    private int id;
    private String en;
    private String vn;

    public Word(int id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }
    public static Comparator<Word> wordEnComparator = new Comparator<Word>() {

        public int compare(Word s1, Word s2) {
            String wordEn1 = s1.getEn().toUpperCase();
            String WordEn2 = s2.getEn().toUpperCase();

            //ascending order
            return wordEn1.compareTo(WordEn2);
        }
    };

    @Override
    public String toString() {
        return "Word{" + "id=" + id + ", en=" + en + ", vn=" + vn + '}';
    }

}
