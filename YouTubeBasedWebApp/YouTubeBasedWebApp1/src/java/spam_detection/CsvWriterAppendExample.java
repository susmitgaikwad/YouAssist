/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spam_detection;

/**
 *
 * @author shishir
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.csvreader.CsvWriter;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CsvWriterAppendExample {

    private String vid;
    private String title;
    private String user;
    private String category;
    private String view;
    private String age;
    private String length;
    private String nrating;
    private String comment;
    private String arating;
    private String hasspam;
    private String count;

    public void writer(CsvWriterAppendExample o) throws FileNotFoundException, IOException {
        String query_vid = getVid();
        CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Susmit\\Documents\\NetBeansProjects\\YouAssist\\Database\\NEW.csv"));

        String[] nextLine;

        int count = 0;

        nextLine = reader.readNext();
        setVid(nextLine[0]);

        System.out.println("The first entry" + getVid());

        while (!"eof".equals(vid)) {

            if (getVid().equals(query_vid)) {
                System.out.println("match found!Entry will be added to the reviewentry.csv" + getVid());
                break;
            } else {
                nextLine = reader.readNext();
                setVid(nextLine[0]);
                count++;
                System.out.println(count);
                System.out.println(getVid());
            }
        }
        //System.out.println("The entry is addded to newentry.csv");
        //if(vid=="eof")
        //System.out.println("The entry is addded to newentry.csv");
        if (getVid() != null) {
            if (getVid().equals(query_vid)) {
                String outputFile1 = "C:\\Users\\Susmit\\Documents\\NetBeansProjects\\YouAssist\\Database\\reviewentry.csv";

                // before we open the file check to see if it already exists
                boolean alreadyExists = new File(outputFile1).exists();

                try {
                    //  FileWriter constructor that specifies open for appending
                    CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile1, true), ',');

                    // write out our record
                    csvOutput.write(query_vid);
                    csvOutput.write(o.getTitle());
                    csvOutput.write(o.getUser());
                    csvOutput.write(o.getCategory());
                    csvOutput.write(o.getAge());
                    csvOutput.write(o.getLength());
                    csvOutput.write(o.getView());
                    csvOutput.write(o.getArating());
                    csvOutput.write(o.getNrating());
                    csvOutput.write(o.getComment());
                    csvOutput.write(o.getHasspam());
                    csvOutput.endRecord();

                    csvOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if ("eof".equals(getVid())) {
            System.out.println("Entry to be added to the NEWentry.csv");
            String outputFile2 = "C:\\Users\\Susmit\\Documents\\NetBeansProjects\\YouAssist\\Database\\NEWentry.csv";

            // before we open the file check to see if it already exists
            boolean alreadyExists = new File(outputFile2).exists();

            try {
                //  FileWriter constructor that specifies open for appending
                CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile2, true), ',');

                // write out our record
                csvOutput.write(query_vid);
                csvOutput.write(o.getTitle());
                csvOutput.write(o.getUser());
                csvOutput.write(o.getCategory());
                csvOutput.write(o.getAge());
                csvOutput.write(o.getLength());
                csvOutput.write(o.getView());
                csvOutput.write(o.getArating());
                csvOutput.write(o.getNrating());
                csvOutput.write(o.getComment());
                csvOutput.write(o.getHasspam());
                csvOutput.endRecord();

                csvOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void csvwriter(String vid, String title, String user, String category, String age, String length, String view, String arating, String nrating, String comment, String hasspam) throws IOException {

        CsvWriterAppendExample o = new CsvWriterAppendExample();
        o.setVid(vid);
        
        o.setTitle(title);
        o.setUser(user);
        o.setCategory(category);
        o.setAge(age);
        o.setLength(length);
        o.setView(view);
        o.setArating(arating);
        o.setNrating(nrating);
        o.setComment(comment);
        o.setHasspam(hasspam);
        o.writer(o);

    }

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
    public String getView() {
        return view;
    }

    /**
     * @param view the view to set
     */
    public void setView(String view) {
        this.view = view;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the length
     */
    public String getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     * @return the nrating
     */
    public String getNrating() {
        return nrating;
    }

    /**
     * @param nrating the nrating to set
     */
    public void setNrating(String nrating) {
        this.nrating = nrating;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the arating
     */
    public String getArating() {
        return arating;
    }

    /**
     * @param arating the arating to set
     */
    public void setArating(String arating) {
        this.arating = arating;
    }

    /**
     * @return the hasspam
     */
    public String getHasspam() {
        return hasspam;
    }

    /**
     * @param hasspam the hasspam to set
     */
    public void setHasspam(String hasspam) {
        this.hasspam = hasspam;
    }

    /**
     * @return the count
     */
    public String getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(String count) {
        this.count = count;
    }

}
