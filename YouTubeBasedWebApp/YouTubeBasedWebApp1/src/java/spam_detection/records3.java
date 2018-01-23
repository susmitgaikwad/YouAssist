/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spam_detection;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author SHRIYA JAISWAL
 */
public class records3 {
      private String vid;
    private String title;
    private String user;
    private String category;
    private float view;
    private float age;
    private float length;
    private float nrating;
    private float comment;
    private float arating;
    private int hasspam;
    private int count;

    /**
     * @return the vid
     */
    public String getVid() {
        return vid;
    }

    /**
     * @param vid the vid to set
     */
    public void setVid(String vid) {
        this.vid = vid;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the view
     */
    public float getView() {
        return view;
    }

    /**
     * @param view the view to set
     */
    public void setView(float view) {
        this.view = view;
    }

    /**
     * @return the age
     */
    public float getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(float age) {
        this.age = age;
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(float length) {
        this.length = length;
    }

    /**
     * @return the nrating
     */
    public float getNrating() {
        return nrating;
    }

    /**
     * @param nrating the nrating to set
     */
    public void setNrating(float nrating) {
        this.nrating = nrating;
    }

    /**
     * @return the comment
     */
    public float getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(float comment) {
        this.comment = comment;
    }

    /**
     * @return the arating
     */
    public float getArating() {
        return arating;
    }

    /**
     * @param arating the arating to set
     */
    public void setArating(float arating) {
        this.arating = arating;
    }

    /**
     * @return the hasspam
     */
    public int isHasspam() {
        return hasspam;
    }

    /**
     * @param hasspam the hasspam to set
     */
    public void setHasspam(int hasspam) {
        this.hasspam = hasspam;

    }
    /**
     * @return the reco1
     */

    
    
    public static records3[] array_r=new records3[1464];

public void csvreader() throws FileNotFoundException, IOException
{
    
    
     
    
//    records2[] array_r=new records2[2000];
   //int con[]=new int[3];//    records2[] array_r=new records2[2000];
   //int con[]=new int[3];
        for ( int i=0; i<array_r.length; i++) {
        array_r[i]=new records3();
}

        
    //    for (int i=0;i<2000;i++) {
    
            CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Susmit\\Documents\\NetBeansProjects\\YouAssist\\Database\\NEW.csv"));
            String [] nextLine;
            int i=0;
            while ((nextLine = reader.readNext()) != null) {
                // nextLine[] is an array of values from the line
                //con[1]=Integer.parseInt(nextLine[1]);
                array_r[i].setVid(nextLine[0]);
                array_r[i].setTitle(nextLine[1]);
                array_r[i].setUser(nextLine[2]);
                array_r[i].setCategory(nextLine[3]);
                array_r[i].setAge(Float.valueOf(nextLine[4]));
                array_r[i].setLength(Float.valueOf(nextLine[5]));
                array_r[i].setView(Float.valueOf(nextLine[6]));
                array_r[i].setArating(Float.valueOf(nextLine[7]));
                array_r[i].setNrating(Float.valueOf(nextLine[8]));
                array_r[i].setComment(Float.valueOf(nextLine[9]));
                array_r[i].setHasspam(Integer.parseInt(nextLine[10]));
               //array_r[i].setUser(nextLine[2]);
                //array_r[i].setcomments(nextLine[2]);
                //array_r[i].setaratings(nextLine[3]);
            //System.out.println(array_r[i].getVid()+"\t"+array_r[i].getTitle()+"\t"+array_r[i].getUser()+"\t"+array_r[i].getCategory()+"\t"+array_r[i].getAge()+"\t"+array_r[i].getLength()+"\t"+array_r[i].getView()+"\t"+array_r[i].getArating()+"\t"+array_r[i].getNrating()+"\t"+array_r[i].getComment()+"\t"+array_r[i].isHasspam());
            
            i++;
            }
//for (int i=0;i<array_r.length;i++) {
  //          System.out.println(array_r[i].getetaratings() + array_r[i].getviews() + array_r[i].getR3());
    //    }                
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

}
