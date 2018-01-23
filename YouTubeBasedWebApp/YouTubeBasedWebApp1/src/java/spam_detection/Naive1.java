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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SHRIYA JAISWAL
 */
public class Naive1 {

    private String vid;
    private String title;
    private String user;
    private String category;
    private String result;
    private String hasspamy;
    private double total_age_notspam;
    private double total_length_notspam;
    private double total_views_notspam;
    private double total_avgrating_notspam;
    private double total_no_rating_notspam;
    private double total_comment_notspam;
    private double total_age_spam;
    private double total_length_spam;
    private double total_views_spam;
    private double total_avgrating_spam;
    private double total_no_rating_spam;
    private double total_comment_spam;
    private double no_of_entries;
    private double no_of_attributes;
    private double count_notspam;
    private double count_spam;
    private double mean_age_notspam;
    private double mean_length_notspam;
    private double mean_views_notspam;
    private double mean_avgrating_notspam;
    private double mean_no_rating_notspam;
    private double mean_comment_notspam;
    private double var_length_notspam;
    private double var_age_notspam;
    private double var_views_notspam;
    private double var_avgrating_notspam;
    private double var_no_rating_notspam;
    private double var_comment_notspam;
    private double mean_age_spam;
    private double mean_length_spam;
    private double mean_views_spam;
    private double mean_avgrating_spam;
    private double mean_no_rating_spam;
    private double mean_comment_spam;
    private double var_length_spam;
    private double var_age_spam;
    private double var_views_spam;
    private double var_avgrating_spam;
    private double var_no_rating_spam;
    private double var_comment_spam;
    private double temp_length_notspam;
    private double temp_age_notspam;
    private double temp_views_notspam;
    private double temp_avgrating_notspam;
    private double temp_no_rating_notspam;
    private double temp_comment_notspam;
    private double temp_length_spam;
    private double temp_age_spam;
    private double temp_views_spam;
    private double temp_avgrating_spam;
    private double temp_no_rating_spam;
    private double temp_comment_spam;
    private double prob_notspam;
    private double prob_spam;
    private double prob_length_notspam;
    private double prob_age_notspam;
    private double prob_views_notspam;
    private double prob_avgrating_notspam;
    private double prob_no_rating_notspam;
    private double prob_comment_notspam;
    private double prob_length_spam;
    private double prob_age_spam;
    private double prob_views_spam;
    private double prob_avgrating_spam;
    private double prob_no_rating_spam;
    private double prob_comment_spam;
    private double sigma_length_notspam;
    private double sigma_age_notspam;
    private double sigma_views_notspam;
    private double sigma_avgrating_notspam;
    private double sigma_no_rating_notspam;
    private double sigma_comment_notspam;
    private double sigma_length_spam;
    private double sigma_age_spam;
    private double sigma_views_spam;
    private double sigma_avgrating_spam;
    private double sigma_no_rating_spam;
    private double sigma_comment_spam;
    private double x_age;
    private double x_length;
    private double x_view;
    private double x_avgrating;
    private double x_no_rating;
    private double x_comment;
    private double posterior_notspam;
    private double posterior_spam;
    private double posterior_numerator_notspam;
    private double posterior_numerator_spam;
    private int count;
    private int[] a;
    private int day;
    private int month;
    private int year;
    private String video_date;


    //   public Naive1(/*double x_age,double x_length,double x_view,double x_avgrating,double x_no_rating,double x_comment*/) 
  /*  {
            
     this.x_age = x_age;
     this.x_length = x_length;
     this.x_view = x_view;
     this.x_avgrating = x_avgrating;
     this.x_no_rating = x_no_rating;
     this.x_comment = x_comment;     
        
     total_age_notspam=0;
     total_length_notspam=0;
     total_views_notspam=0;
     total_avgrating_notspam=0;
     total_no_rating_notspam=0;
     total_comment_notspam=0;
     total_age_spam=0;
     total_length_spam=0;
     total_views_spam=0;
     total_avgrating_spam=0;
     total_no_rating_spam=0;
     total_comment_spam=0;
     count_notspam=0;
     count_spam=0;
     mean_age_notspam=0;
     mean_length_notspam=0;
     mean_views_notspam=0;
     mean_avgrating_notspam=0;
     mean_no_rating_notspam=0;
     mean_comment_notspam=0;
     var_length_notspam=0;
     var_age_notspam=0;
     var_views_notspam=0;
     var_avgrating_notspam=0;
     var_no_rating_notspam=0;
     var_comment_notspam=0;
     mean_age_spam=0;
     mean_length_spam=0;
     mean_views_spam=0;
     mean_avgrating_spam=0;
     mean_no_rating_spam=0;
     mean_comment_spam=0;
     var_length_spam=0;
     var_age_spam=0;
     var_views_spam=0;
     var_avgrating_spam=0;
     var_no_rating_spam=0;
     var_comment_spam=0;
     temp_length_notspam=0;
     temp_age_notspam=0;
     temp_views_notspam=0;
     temp_avgrating_notspam=0;
     temp_no_rating_notspam=0;
     temp_comment_notspam=0;
     temp_length_spam=0;
     temp_age_spam=0;
     temp_views_spam=0;
     temp_avgrating_spam=0;
     temp_no_rating_spam=0;
     temp_comment_spam=0;
     prob_notspam=0;
     prob_spam=0;
     prob_length_notspam=0;
     prob_age_notspam=0;
     prob_views_notspam=0;
     prob_avgrating_notspam=0;
     prob_no_rating_notspam=0;
     prob_comment_notspam=0;
     prob_length_spam=0;
     prob_age_spam=0;
     prob_views_spam=0;
     prob_avgrating_spam=0;
     prob_no_rating_spam=0;
     prob_comment_spam=0;
     sigma_length_notspam=0;
     sigma_age_notspam=0;
     sigma_views_notspam=0;
     sigma_avgrating_notspam=0;
     sigma_no_rating_notspam=0;
     sigma_comment_notspam=0;
     sigma_length_spam=0;
     sigma_age_spam=0;
     sigma_views_spam=0;
     sigma_length_notspam=0;
     sigma_age_notspam=0;
     sigma_views_notspam=0;
     x_length=0;
     x_age=0;
     x_view=0;
     x_comment=0;
     x_avgrating=0;
     x_no_rating=0;
     posterior_notspam=0;
     posterior_spam=0;
     posterior_numerator_notspam=0;
     posterior_numerator_spam=0;
     count=0;
     }*/
    public String getHasspamy() {
        return hasspamy;
    }

    public void setHasspamy(String hasspamy) {
        this.hasspamy = hasspamy;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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
     * @return the total_age_notspam
     */
    public double getTotal_age_notspam() {
        return total_age_notspam;
    }

    /**
     * @param total_age_notspam the total_age_notspam to set
     */
    public void setTotal_age_notspam(double total_age_notspam) {
        this.total_age_notspam = total_age_notspam;
    }

    /**
     * @return the total_length_notspam
     */
    public double getTotal_length_notspam() {
        return total_length_notspam;
    }

    /**
     * @param total_length_notspam the total_length_notspam to set
     */
    public void setTotal_length_notspam(double total_length_notspam) {
        this.total_length_notspam = total_length_notspam;
    }

    /**
     * @return the total_views_notspam
     */
    public double getTotal_views_notspam() {
        return total_views_notspam;
    }

    /**
     * @param total_views_notspam the total_views_notspam to set
     */
    public void setTotal_views_notspam(double total_views_notspam) {
        this.total_views_notspam = total_views_notspam;
    }

    /**
     * @return the total_avgrating_notspam
     */
    public double getTotal_avgrating_notspam() {
        return total_avgrating_notspam;
    }

    /**
     * @param total_avgrating_notspam the total_avgrating_notspam to set
     */
    public void setTotal_avgrating_notspam(double total_avgrating_notspam) {
        this.total_avgrating_notspam = total_avgrating_notspam;
    }

    /**
     * @return the total_no_rating_notspam
     */
    public double getTotal_no_rating_notspam() {
        return total_no_rating_notspam;
    }

    /**
     * @param total_no_rating_notspam the total_no_rating_notspam to set
     */
    public void setTotal_no_rating_notspam(double total_no_rating_notspam) {
        this.total_no_rating_notspam = total_no_rating_notspam;
    }

    /**
     * @return the total_comment_notspam
     */
    public double getTotal_comment_notspam() {
        return total_comment_notspam;
    }

    /**
     * @param total_comment_notspam the total_comment_notspam to set
     */
    public void setTotal_comment_notspam(double total_comment_notspam) {
        this.total_comment_notspam = total_comment_notspam;
    }

    /**
     * @return the total_age_spam
     */
    public double getTotal_age_spam() {
        return total_age_spam;
    }

    /**
     * @param total_age_spam the total_age_spam to set
     */
    public void setTotal_age_spam(double total_age_spam) {
        this.total_age_spam = total_age_spam;
    }

    /**
     * @return the total_length_spam
     */
    public double getTotal_length_spam() {
        return total_length_spam;
    }

    /**
     * @param total_length_spam the total_length_spam to set
     */
    public void setTotal_length_spam(double total_length_spam) {
        this.total_length_spam = total_length_spam;
    }

    /**
     * @return the total_views_spam
     */
    public double getTotal_views_spam() {
        return total_views_spam;
    }

    /**
     * @param total_views_spam the total_views_spam to set
     */
    public void setTotal_views_spam(double total_views_spam) {
        this.total_views_spam = total_views_spam;
    }

    /**
     * @return the total_avgrating_spam
     */
    public double getTotal_avgrating_spam() {
        return total_avgrating_spam;
    }

    /**
     * @param total_avgrating_spam the total_avgrating_spam to set
     */
    public void setTotal_avgrating_spam(double total_avgrating_spam) {
        this.total_avgrating_spam = total_avgrating_spam;
    }

    /**
     * @return the total_no_rating_spam
     */
    public double getTotal_no_rating_spam() {
        return total_no_rating_spam;
    }

    /**
     * @param total_no_rating_spam the total_no_rating_spam to set
     */
    public void setTotal_no_rating_spam(double total_no_rating_spam) {
        this.total_no_rating_spam = total_no_rating_spam;
    }

    /**
     * @return the total_comment_spam
     */
    public double getTotal_comment_spam() {
        return total_comment_spam;
    }

    /**
     * @param total_comment_spam the total_comment_spam to set
     */
    public void setTotal_comment_spam(double total_comment_spam) {
        this.total_comment_spam = total_comment_spam;
    }

    /**
     * @return the no_of_entries
     */
    public double getNo_of_entries() {
        return no_of_entries;
    }

    /**
     * @param no_of_entries the no_of_entries to set
     */
    public void setNo_of_entries(double no_of_entries) {
        this.no_of_entries = no_of_entries;
    }

    /**
     * @return the no_of_attributes
     */
    public double getNo_of_attributes() {
        return no_of_attributes;
    }

    /**
     * @param no_of_attributes the no_of_attributes to set
     */
    public void setNo_of_attributes(double no_of_attributes) {
        this.no_of_attributes = no_of_attributes;
    }

    /**
     * @return the count_notspam
     */
    public double getCount_notspam() {
        return count_notspam;
    }

    /**
     * @param count_notspam the count_notspam to set
     */
    public void setCount_notspam(double count_notspam) {
        this.count_notspam = count_notspam;
    }

    /**
     * @return the count_spam
     */
    public double getCount_spam() {
        return count_spam;
    }

    /**
     * @param count_spam the count_spam to set
     */
    public void setCount_spam(double count_spam) {
        this.count_spam = count_spam;
    }

    /**
     * @return the mean_age_notspam
     */
    public double getMean_age_notspam() {
        return mean_age_notspam;
    }

    /**
     * @param mean_age_notspam the mean_age_notspam to set
     */
    public void setMean_age_notspam(double mean_age_notspam) {
        this.mean_age_notspam = mean_age_notspam;
    }

    /**
     * @return the mean_length_notspam
     */
    public double getMean_length_notspam() {
        return mean_length_notspam;
    }

    /**
     * @param mean_length_notspam the mean_length_notspam to set
     */
    public void setMean_length_notspam(double mean_length_notspam) {
        this.mean_length_notspam = mean_length_notspam;
    }

    /**
     * @return the mean_views_notspam
     */
    public double getMean_views_notspam() {
        return mean_views_notspam;
    }

    /**
     * @param mean_views_notspam the mean_views_notspam to set
     */
    public void setMean_views_notspam(double mean_views_notspam) {
        this.mean_views_notspam = mean_views_notspam;
    }

    /**
     * @return the mean_avgrating_notspam
     */
    public double getMean_avgrating_notspam() {
        return mean_avgrating_notspam;
    }

    /**
     * @param mean_avgrating_notspam the mean_avgrating_notspam to set
     */
    public void setMean_avgrating_notspam(double mean_avgrating_notspam) {
        this.mean_avgrating_notspam = mean_avgrating_notspam;
    }

    /**
     * @return the mean_no_rating_notspam
     */
    public double getMean_no_rating_notspam() {
        return mean_no_rating_notspam;
    }

    /**
     * @param mean_no_rating_notspam the mean_no_rating_notspam to set
     */
    public void setMean_no_rating_notspam(double mean_no_rating_notspam) {
        this.mean_no_rating_notspam = mean_no_rating_notspam;
    }

    /**
     * @return the mean_comment_notspam
     */
    public double getMean_comment_notspam() {
        return mean_comment_notspam;
    }

    /**
     * @param mean_comment_notspam the mean_comment_notspam to set
     */
    public void setMean_comment_notspam(double mean_comment_notspam) {
        this.mean_comment_notspam = mean_comment_notspam;
    }

    /**
     * @return the var_length_notspam
     */
    public double getVar_length_notspam() {
        return var_length_notspam;
    }

    /**
     * @param var_length_notspam the var_length_notspam to set
     */
    public void setVar_length_notspam(double var_length_notspam) {
        this.var_length_notspam = var_length_notspam;
    }

    /**
     * @return the var_age_notspam
     */
    public double getVar_age_notspam() {
        return var_age_notspam;
    }

    /**
     * @param var_age_notspam the var_age_notspam to set
     */
    public void setVar_age_notspam(double var_age_notspam) {
        this.var_age_notspam = var_age_notspam;
    }

    /**
     * @return the var_views_notspam
     */
    public double getVar_views_notspam() {
        return var_views_notspam;
    }

    /**
     * @param var_views_notspam the var_views_notspam to set
     */
    public void setVar_views_notspam(double var_views_notspam) {
        this.var_views_notspam = var_views_notspam;
    }

    /**
     * @return the var_avgrating_notspam
     */
    public double getVar_avgrating_notspam() {
        return var_avgrating_notspam;
    }

    /**
     * @param var_avgrating_notspam the var_avgrating_notspam to set
     */
    public void setVar_avgrating_notspam(double var_avgrating_notspam) {
        this.var_avgrating_notspam = var_avgrating_notspam;
    }

    /**
     * @return the var_no_rating_notspam
     */
    public double getVar_no_rating_notspam() {
        return var_no_rating_notspam;
    }

    /**
     * @param var_no_rating_notspam the var_no_rating_notspam to set
     */
    public void setVar_no_rating_notspam(double var_no_rating_notspam) {
        this.var_no_rating_notspam = var_no_rating_notspam;
    }

    /**
     * @return the var_comment_notspam
     */
    public double getVar_comment_notspam() {
        return var_comment_notspam;
    }

    /**
     * @param var_comment_notspam the var_comment_notspam to set
     */
    public void setVar_comment_notspam(double var_comment_notspam) {
        this.var_comment_notspam = var_comment_notspam;
    }

    /**
     * @return the mean_age_spam
     */
    public double getMean_age_spam() {
        return mean_age_spam;
    }

    /**
     * @param mean_age_spam the mean_age_spam to set
     */
    public void setMean_age_spam(double mean_age_spam) {
        this.mean_age_spam = mean_age_spam;
    }

    /**
     * @return the mean_length_spam
     */
    public double getMean_length_spam() {
        return mean_length_spam;
    }

    /**
     * @param mean_length_spam the mean_length_spam to set
     */
    public void setMean_length_spam(double mean_length_spam) {
        this.mean_length_spam = mean_length_spam;
    }

    /**
     * @return the mean_views_spam
     */
    public double getMean_views_spam() {
        return mean_views_spam;
    }

    /**
     * @param mean_views_spam the mean_views_spam to set
     */
    public void setMean_views_spam(double mean_views_spam) {
        this.mean_views_spam = mean_views_spam;
    }

    /**
     * @return the mean_avgrating_spam
     */
    public double getMean_avgrating_spam() {
        return mean_avgrating_spam;
    }

    /**
     * @param mean_avgrating_spam the mean_avgrating_spam to set
     */
    public void setMean_avgrating_spam(double mean_avgrating_spam) {
        this.mean_avgrating_spam = mean_avgrating_spam;
    }

    /**
     * @return the mean_no_rating_spam
     */
    public double getMean_no_rating_spam() {
        return mean_no_rating_spam;
    }

    /**
     * @param mean_no_rating_spam the mean_no_rating_spam to set
     */
    public void setMean_no_rating_spam(double mean_no_rating_spam) {
        this.mean_no_rating_spam = mean_no_rating_spam;
    }

    /**
     * @return the mean_comment_spam
     */
    public double getMean_comment_spam() {
        return mean_comment_spam;
    }

    /**
     * @param mean_comment_spam the mean_comment_spam to set
     */
    public void setMean_comment_spam(double mean_comment_spam) {
        this.mean_comment_spam = mean_comment_spam;
    }

    /**
     * @return the var_length_spam
     */
    public double getVar_length_spam() {
        return var_length_spam;
    }

    /**
     * @param var_length_spam the var_length_spam to set
     */
    public void setVar_length_spam(double var_length_spam) {
        this.var_length_spam = var_length_spam;
    }

    /**
     * @return the var_age_spam
     */
    public double getVar_age_spam() {
        return var_age_spam;
    }

    /**
     * @param var_age_spam the var_age_spam to set
     */
    public void setVar_age_spam(double var_age_spam) {
        this.var_age_spam = var_age_spam;
    }

    /**
     * @return the var_views_spam
     */
    public double getVar_views_spam() {
        return var_views_spam;
    }

    /**
     * @param var_views_spam the var_views_spam to set
     */
    public void setVar_views_spam(double var_views_spam) {
        this.var_views_spam = var_views_spam;
    }

    /**
     * @return the var_avgrating_spam
     */
    public double getVar_avgrating_spam() {
        return var_avgrating_spam;
    }

    /**
     * @param var_avgrating_spam the var_avgrating_spam to set
     */
    public void setVar_avgrating_spam(double var_avgrating_spam) {
        this.var_avgrating_spam = var_avgrating_spam;
    }

    /**
     * @return the var_no_rating_spam
     */
    public double getVar_no_rating_spam() {
        return var_no_rating_spam;
    }

    /**
     * @param var_no_rating_spam the var_no_rating_spam to set
     */
    public void setVar_no_rating_spam(double var_no_rating_spam) {
        this.var_no_rating_spam = var_no_rating_spam;
    }

    /**
     * @return the var_comment_spam
     */
    public double getVar_comment_spam() {
        return var_comment_spam;
    }

    /**
     * @param var_comment_spam the var_comment_spam to set
     */
    public void setVar_comment_spam(double var_comment_spam) {
        this.var_comment_spam = var_comment_spam;
    }

    /**
     * @return the temp_length_notspam
     */
    public double getTemp_length_notspam() {
        return temp_length_notspam;
    }

    /**
     * @param temp_length_notspam the temp_length_notspam to set
     */
    public void setTemp_length_notspam(double temp_length_notspam) {
        this.temp_length_notspam = temp_length_notspam;
    }

    /**
     * @return the temp_age_notspam
     */
    public double getTemp_age_notspam() {
        return temp_age_notspam;
    }

    /**
     * @param temp_age_notspam the temp_age_notspam to set
     */
    public void setTemp_age_notspam(double temp_age_notspam) {
        this.temp_age_notspam = temp_age_notspam;
    }

    /**
     * @return the temp_views_notspam
     */
    public double getTemp_views_notspam() {
        return temp_views_notspam;
    }

    /**
     * @param temp_views_notspam the temp_views_notspam to set
     */
    public void setTemp_views_notspam(double temp_views_notspam) {
        this.temp_views_notspam = temp_views_notspam;
    }

    /**
     * @return the temp_avgrating_notspam
     */
    public double getTemp_avgrating_notspam() {
        return temp_avgrating_notspam;
    }

    /**
     * @param temp_avgrating_notspam the temp_avgrating_notspam to set
     */
    public void setTemp_avgrating_notspam(double temp_avgrating_notspam) {
        this.temp_avgrating_notspam = temp_avgrating_notspam;
    }

    /**
     * @return the temp_no_rating_notspam
     */
    public double getTemp_no_rating_notspam() {
        return temp_no_rating_notspam;
    }

    /**
     * @param temp_no_rating_notspam the temp_no_rating_notspam to set
     */
    public void setTemp_no_rating_notspam(double temp_no_rating_notspam) {
        this.temp_no_rating_notspam = temp_no_rating_notspam;
    }

    /**
     * @return the temp_comment_notspam
     */
    public double getTemp_comment_notspam() {
        return temp_comment_notspam;
    }

    /**
     * @param temp_comment_notspam the temp_comment_notspam to set
     */
    public void setTemp_comment_notspam(double temp_comment_notspam) {
        this.temp_comment_notspam = temp_comment_notspam;
    }

    /**
     * @return the temp_length_spam
     */
    public double getTemp_length_spam() {
        return temp_length_spam;
    }

    /**
     * @param temp_length_spam the temp_length_spam to set
     */
    public void setTemp_length_spam(double temp_length_spam) {
        this.temp_length_spam = temp_length_spam;
    }

    /**
     * @return the temp_age_spam
     */
    public double getTemp_age_spam() {
        return temp_age_spam;
    }

    /**
     * @param temp_age_spam the temp_age_spam to set
     */
    public void setTemp_age_spam(double temp_age_spam) {
        this.temp_age_spam = temp_age_spam;
    }

    /**
     * @return the temp_views_spam
     */
    public double getTemp_views_spam() {
        return temp_views_spam;
    }

    /**
     * @param temp_views_spam the temp_views_spam to set
     */
    public void setTemp_views_spam(double temp_views_spam) {
        this.temp_views_spam = temp_views_spam;
    }

    /**
     * @return the temp_avgrating_spam
     */
    public double getTemp_avgrating_spam() {
        return temp_avgrating_spam;
    }

    /**
     * @param temp_avgrating_spam the temp_avgrating_spam to set
     */
    public void setTemp_avgrating_spam(double temp_avgrating_spam) {
        this.temp_avgrating_spam = temp_avgrating_spam;
    }

    /**
     * @return the temp_no_rating_spam
     */
    public double getTemp_no_rating_spam() {
        return temp_no_rating_spam;
    }

    /**
     * @param temp_no_rating_spam the temp_no_rating_spam to set
     */
    public void setTemp_no_rating_spam(double temp_no_rating_spam) {
        this.temp_no_rating_spam = temp_no_rating_spam;
    }

    /**
     * @return the temp_comment_spam
     */
    public double getTemp_comment_spam() {
        return temp_comment_spam;
    }

    /**
     * @param temp_comment_spam the temp_comment_spam to set
     */
    public void setTemp_comment_spam(double temp_comment_spam) {
        this.temp_comment_spam = temp_comment_spam;
    }

    /**
     * @return the prob_notspam
     */
    public double getProb_notspam() {
        return prob_notspam;
    }

    /**
     * @param prob_notspam the prob_notspam to set
     */
    public void setProb_notspam(double prob_notspam) {
        this.prob_notspam = prob_notspam;
    }

    /**
     * @return the prob_spam
     */
    public double getProb_spam() {
        return prob_spam;
    }

    /**
     * @param prob_spam the prob_spam to set
     */
    public void setProb_spam(double prob_spam) {
        this.prob_spam = prob_spam;
    }

    /**
     * @return the prob_length_notspam
     */
    public double getProb_length_notspam() {
        return prob_length_notspam;
    }

    /**
     * @param prob_length_notspam the prob_length_notspam to set
     */
    public void setProb_length_notspam(double prob_length_notspam) {
        this.prob_length_notspam = prob_length_notspam;
    }

    /**
     * @return the prob_age_notspam
     */
    public double getProb_age_notspam() {
        return prob_age_notspam;
    }

    /**
     * @param prob_age_notspam the prob_age_notspam to set
     */
    public void setProb_age_notspam(double prob_age_notspam) {
        this.prob_age_notspam = prob_age_notspam;
    }

    /**
     * @return the prob_views_notspam
     */
    public double getProb_views_notspam() {
        return prob_views_notspam;
    }

    /**
     * @param prob_views_notspam the prob_views_notspam to set
     */
    public void setProb_views_notspam(double prob_views_notspam) {
        this.prob_views_notspam = prob_views_notspam;
    }

    /**
     * @return the prob_avgrating_notspam
     */
    public double getProb_avgrating_notspam() {
        return prob_avgrating_notspam;
    }

    /**
     * @param prob_avgrating_notspam the prob_avgrating_notspam to set
     */
    public void setProb_avgrating_notspam(double prob_avgrating_notspam) {
        this.prob_avgrating_notspam = prob_avgrating_notspam;
    }

    /**
     * @return the prob_no_rating_notspam
     */
    public double getProb_no_rating_notspam() {
        return prob_no_rating_notspam;
    }

    /**
     * @param prob_no_rating_notspam the prob_no_rating_notspam to set
     */
    public void setProb_no_rating_notspam(double prob_no_rating_notspam) {
        this.prob_no_rating_notspam = prob_no_rating_notspam;
    }

    /**
     * @return the prob_comment_notspam
     */
    public double getProb_comment_notspam() {
        return prob_comment_notspam;
    }

    /**
     * @param prob_comment_notspam the prob_comment_notspam to set
     */
    public void setProb_comment_notspam(double prob_comment_notspam) {
        this.prob_comment_notspam = prob_comment_notspam;
    }

    /**
     * @return the prob_length_spam
     */
    public double getProb_length_spam() {
        return prob_length_spam;
    }

    /**
     * @param prob_length_spam the prob_length_spam to set
     */
    public void setProb_length_spam(double prob_length_spam) {
        this.prob_length_spam = prob_length_spam;
    }

    /**
     * @return the prob_age_spam
     */
    public double getProb_age_spam() {
        return prob_age_spam;
    }

    /**
     * @param prob_age_spam the prob_age_spam to set
     */
    public void setProb_age_spam(double prob_age_spam) {
        this.prob_age_spam = prob_age_spam;
    }

    /**
     * @return the prob_views_spam
     */
    public double getProb_views_spam() {
        return prob_views_spam;
    }

    /**
     * @param prob_views_spam the prob_views_spam to set
     */
    public void setProb_views_spam(double prob_views_spam) {
        this.prob_views_spam = prob_views_spam;
    }

    /**
     * @return the prob_avgrating_spam
     */
    public double getProb_avgrating_spam() {
        return prob_avgrating_spam;
    }

    /**
     * @param prob_avgrating_spam the prob_avgrating_spam to set
     */
    public void setProb_avgrating_spam(double prob_avgrating_spam) {
        this.prob_avgrating_spam = prob_avgrating_spam;
    }

    /**
     * @return the prob_no_rating_spam
     */
    public double getProb_no_rating_spam() {
        return prob_no_rating_spam;
    }

    /**
     * @param prob_no_rating_spam the prob_no_rating_spam to set
     */
    public void setProb_no_rating_spam(double prob_no_rating_spam) {
        this.prob_no_rating_spam = prob_no_rating_spam;
    }

    /**
     * @return the prob_comment_spam
     */
    public double getProb_comment_spam() {
        return prob_comment_spam;
    }

    /**
     * @param prob_comment_spam the prob_comment_spam to set
     */
    public void setProb_comment_spam(double prob_comment_spam) {
        this.prob_comment_spam = prob_comment_spam;
    }

    /**
     * @return the sigma_length_notspam
     */
    public double getSigma_length_notspam() {
        return sigma_length_notspam;
    }

    /**
     * @param sigma_length_notspam the sigma_length_notspam to set
     */
    public void setSigma_length_notspam(double sigma_length_notspam) {
        this.sigma_length_notspam = sigma_length_notspam;
    }

    /**
     * @return the sigma_age_notspam
     */
    public double getSigma_age_notspam() {
        return sigma_age_notspam;
    }

    /**
     * @param sigma_age_notspam the sigma_age_notspam to set
     */
    public void setSigma_age_notspam(double sigma_age_notspam) {
        this.sigma_age_notspam = sigma_age_notspam;
    }

    /**
     * @return the sigma_views_notspam
     */
    public double getSigma_views_notspam() {
        return sigma_views_notspam;
    }

    /**
     * @param sigma_views_notspam the sigma_views_notspam to set
     */
    public void setSigma_views_notspam(double sigma_views_notspam) {
        this.sigma_views_notspam = sigma_views_notspam;
    }

    /**
     * @return the sigma_avgrating_notspam
     */
    public double getSigma_avgrating_notspam() {
        return sigma_avgrating_notspam;
    }

    /**
     * @param sigma_avgrating_notspam the sigma_avgrating_notspam to set
     */
    public void setSigma_avgrating_notspam(double sigma_avgrating_notspam) {
        this.sigma_avgrating_notspam = sigma_avgrating_notspam;
    }

    /**
     * @return the sigma_no_rating_notspam
     */
    public double getSigma_no_rating_notspam() {
        return sigma_no_rating_notspam;
    }

    /**
     * @param sigma_no_rating_notspam the sigma_no_rating_notspam to set
     */
    public void setSigma_no_rating_notspam(double sigma_no_rating_notspam) {
        this.sigma_no_rating_notspam = sigma_no_rating_notspam;
    }

    /**
     * @return the sigma_comment_notspam
     */
    public double getSigma_comment_notspam() {
        return sigma_comment_notspam;
    }

    /**
     * @param sigma_comment_notspam the sigma_comment_notspam to set
     */
    public void setSigma_comment_notspam(double sigma_comment_notspam) {
        this.sigma_comment_notspam = sigma_comment_notspam;
    }

    /**
     * @return the sigma_length_spam
     */
    public double getSigma_length_spam() {
        return sigma_length_spam;
    }

    /**
     * @param sigma_length_spam the sigma_length_spam to set
     */
    public void setSigma_length_spam(double sigma_length_spam) {
        this.sigma_length_spam = sigma_length_spam;
    }

    /**
     * @return the sigma_age_spam
     */
    public double getSigma_age_spam() {
        return sigma_age_spam;
    }

    /**
     * @param sigma_age_spam the sigma_age_spam to set
     */
    public void setSigma_age_spam(double sigma_age_spam) {
        this.sigma_age_spam = sigma_age_spam;
    }

    /**
     * @return the sigma_views_spam
     */
    public double getSigma_views_spam() {
        return sigma_views_spam;
    }

    /**
     * @param sigma_views_spam the sigma_views_spam to set
     */
    public void setSigma_views_spam(double sigma_views_spam) {
        this.sigma_views_spam = sigma_views_spam;
    }

    /**
     * @return the sigma_avgrating_spam
     */
    public double getSigma_avgrating_spam() {
        return sigma_avgrating_spam;
    }

    /**
     * @param sigma_avgrating_spam the sigma_avgrating_spam to set
     */
    public void setSigma_avgrating_spam(double sigma_avgrating_spam) {
        this.sigma_avgrating_spam = sigma_avgrating_spam;
    }

    /**
     * @return the sigma_no_rating_spam
     */
    public double getSigma_no_rating_spam() {
        return sigma_no_rating_spam;
    }

    /**
     * @param sigma_no_rating_spam the sigma_no_rating_spam to set
     */
    public void setSigma_no_rating_spam(double sigma_no_rating_spam) {
        this.sigma_no_rating_spam = sigma_no_rating_spam;
    }

    /**
     * @return the sigma_comment_spam
     */
    public double getSigma_comment_spam() {
        return sigma_comment_spam;
    }

    /**
     * @param sigma_comment_spam the sigma_comment_spam to set
     */
    public void setSigma_comment_spam(double sigma_comment_spam) {
        this.sigma_comment_spam = sigma_comment_spam;
    }

    /**
     * @return the x_age
     */
    public double getX_age() {
        return x_age;
    }

    /**
     * @param x_age the x_age to set
     */
    public void setX_age(double x_age) {
        this.x_age = x_age;
    }

    /**
     * @return the x_length
     */
    public double getX_length() {
        return x_length;
    }

    /**
     * @param x_length the x_length to set
     */
    public void setX_length(double x_length) {
        this.x_length = x_length;
    }

    /**
     * @return the x_view
     */
    public double getX_view() {
        return x_view;
    }

    /**
     * @param x_view the x_view to set
     */
    public void setX_view(double x_view) {
        this.x_view = x_view;
    }

    /**
     * @return the x_avgrating
     */
    public double getX_avgrating() {
        return x_avgrating;
    }

    /**
     * @param x_avgrating the x_avgrating to set
     */
    public void setX_avgrating(double x_avgrating) {
        this.x_avgrating = x_avgrating;
    }

    /**
     * @return the x_no_rating
     */
    public double getX_no_rating() {
        return x_no_rating;
    }

    /**
     * @param x_no_rating the x_no_rating to set
     */
    public void setX_no_rating(double x_no_rating) {
        this.x_no_rating = x_no_rating;
    }

    /**
     * @return the x_comment
     */
    public double getX_comment() {
        return x_comment;
    }

    /**
     * @param x_comment the x_comment to set
     */
    public void setX_comment(double x_comment) {
        this.x_comment = x_comment;
    }

    /**
     * @return the posterior_notspam
     */
    public double getPosterior_notspam() {
        return posterior_notspam;
    }

    /**
     * @param posterior_notspam the posterior_notspam to set
     */
    public void setPosterior_notspam(double posterior_notspam) {
        this.posterior_notspam = posterior_notspam;
    }

    /**
     * @return the posterior_spam
     */
    public double getPosterior_spam() {
        return posterior_spam;
    }

    /**
     * @param posterior_spam the posterior_spam to set
     */
    public void setPosterior_spam(double posterior_spam) {
        this.posterior_spam = posterior_spam;
    }

    /* @return the posterior_numerator_notspam
     */
    public double getPosterior_numerator_notspam() {
        return posterior_numerator_notspam;
    }

    /**
     * @param posterior_numerator_notspam the posterior_numerator_notspam to set
     */
    public void setPosterior_numerator_notspam(double posterior_numerator_notspam) {
        this.posterior_numerator_notspam = posterior_numerator_notspam;
    }

    /**
     * @return the posterior_numerator_spam
     */
    public double getPosterior_numerator_spam() {
        return posterior_numerator_spam;
    }

    /**
     * @param posterior_numerator_spam the posterior_numerator_spam to set
     */
    public void setPosterior_numerator_spam(double posterior_numerator_spam) {
        this.posterior_numerator_spam = posterior_numerator_spam;
    }

    public void mean() {
        for (int i = 0; i < records3.array_r.length; i++) {
            if (records3.array_r[i].isHasspam() == 0) {
                total_length_notspam = total_length_notspam + records3.array_r[i].getLength();              // Here, we assume that the 2nd column in the file is Length
                total_age_notspam = total_age_notspam + records3.array_r[i].getAge();                    // Here, we assume that the 3rd column in the file is Age
                total_views_notspam = total_views_notspam + records3.array_r[i].getView();                // Here, we assume that the 4th column in the file is views
                total_avgrating_notspam = total_avgrating_notspam + records3.array_r[i].getArating();      // Here, we assume that the 5th column in the file is avgrating
                total_no_rating_notspam = total_no_rating_notspam + records3.array_r[i].getNrating();      // Here, we assume that the 6th column in the file is no of rating
                total_comment_notspam = total_comment_notspam + records3.array_r[i].getComment();          // Here, we assume that the 7th column in the file is comment count
                count_notspam = count_notspam + 1;

            } else {
                total_length_spam = total_length_spam + records3.array_r[i].getLength();
                total_age_spam = total_age_spam + records3.array_r[i].getAge();
                total_views_spam = total_views_spam + records3.array_r[i].getView();
                total_avgrating_spam = total_avgrating_spam + records3.array_r[i].getArating();
                total_no_rating_spam = total_no_rating_spam + records3.array_r[i].getNrating();
                total_comment_spam = total_comment_spam + records3.array_r[i].getComment();
                count_spam = count_spam + 1;
            }
        }
        mean_length_notspam = total_length_notspam / count_notspam;
        mean_age_notspam = total_age_notspam / count_notspam;
        mean_views_notspam = total_views_notspam / count_notspam;
        mean_avgrating_notspam = total_avgrating_notspam / count_notspam;
        mean_no_rating_notspam = total_no_rating_notspam / count_notspam;
        mean_comment_notspam = total_comment_notspam / count_notspam;

        mean_length_spam = total_length_spam / count_spam;
        mean_age_spam = total_age_spam / count_spam;
        mean_views_spam = total_views_spam / count_spam;
        mean_avgrating_spam = total_avgrating_spam / count_spam;
        mean_no_rating_spam = total_no_rating_spam / count_spam;
        mean_comment_spam = total_comment_spam / count_spam;
    }

    public void variance() {
        for (int i = 0; i < records3.array_r.length; i++) {
            if (records3.array_r[i].isHasspam() == 0) {
                temp_length_notspam = temp_length_notspam + Math.pow((records3.array_r[i].getLength() - mean_length_notspam), 2);
            } else {
                temp_length_spam = temp_length_spam + Math.pow((records3.array_r[i].getLength() - mean_length_spam), 2);
            }
        }

        var_length_notspam = temp_length_notspam / count_notspam;
        sigma_length_notspam = Math.sqrt(var_length_notspam);

        var_length_spam = temp_length_spam / count_spam;
        sigma_length_spam = Math.sqrt(var_length_spam);

        for (int i = 0; i < records3.array_r.length; i++) {
            if (records3.array_r[i].isHasspam() == 0) {
                temp_age_notspam = temp_age_notspam + Math.pow((records3.array_r[i].getAge() - mean_age_notspam), 2);
            } else {
                temp_age_spam = temp_age_spam + Math.pow((records3.array_r[i].getAge() - mean_age_spam), 2);
            }
        }

        var_age_notspam = temp_age_notspam / count_notspam;
        sigma_age_notspam = Math.sqrt(var_age_notspam);

        var_age_spam = temp_age_spam / count_spam;
        sigma_age_spam = Math.sqrt(var_age_spam);

        for (int i = 0; i < records3.array_r.length; i++) {
            if (records3.array_r[i].isHasspam() == 0) {
                temp_views_notspam = temp_views_notspam + Math.pow((records3.array_r[i].getView() - mean_views_notspam), 2);
            } else {
                temp_views_spam = temp_views_spam + Math.pow((records3.array_r[i].getView() - mean_views_spam), 2);
            }
        }

        var_views_notspam = temp_views_notspam / count_notspam;
        sigma_views_notspam = Math.sqrt(var_views_notspam);

        var_views_spam = temp_views_spam / count_spam;
        sigma_views_spam = Math.sqrt(var_views_spam);

        for (int i = 0; i < records3.array_r.length; i++) {
            if (records3.array_r[i].isHasspam() == 0) {
                temp_avgrating_notspam = temp_avgrating_notspam + Math.pow((records3.array_r[i].getArating() - mean_avgrating_notspam), 2);
            } else {
                temp_avgrating_spam = temp_avgrating_spam + Math.pow((records3.array_r[i].getArating() - mean_avgrating_spam), 2);
            }
        }

        var_avgrating_notspam = temp_avgrating_notspam / count_notspam;
        sigma_avgrating_notspam = Math.sqrt(var_avgrating_notspam);

        var_avgrating_spam = temp_avgrating_spam / count_spam;
        sigma_avgrating_spam = Math.sqrt(var_avgrating_spam);

        for (int i = 0; i < records3.array_r.length; i++) {
            if (records3.array_r[i].isHasspam() == 0) {
                temp_no_rating_notspam = temp_no_rating_notspam + Math.pow((records3.array_r[i].getNrating() - mean_no_rating_notspam), 2);
            } else {
                temp_no_rating_spam = temp_no_rating_spam + Math.pow((records3.array_r[i].getNrating() - mean_no_rating_spam), 2);
            }
        }

        var_no_rating_notspam = temp_no_rating_notspam / count_notspam;
        sigma_no_rating_notspam = Math.sqrt(var_no_rating_notspam);

        var_no_rating_spam = temp_no_rating_spam / count_spam;
        sigma_no_rating_spam = Math.sqrt(var_no_rating_spam);

        for (int i = 0; i < records3.array_r.length; i++) {
            if (records3.array_r[i].isHasspam() == 0) {
                temp_comment_notspam = temp_comment_notspam + Math.pow((records3.array_r[i].getComment() - mean_comment_notspam), 2);
            } else {
                temp_comment_spam = temp_comment_spam + Math.pow((records3.array_r[i].getComment() - mean_comment_spam), 2);
            }
        }

        var_comment_notspam = temp_comment_notspam / count_notspam;
        sigma_comment_notspam = Math.sqrt(var_comment_notspam);

        var_comment_spam = temp_comment_spam / count_spam;
        sigma_comment_spam = Math.sqrt(var_comment_spam);

    }

    public void probability() {

        prob_notspam = count_notspam / records3.array_r.length;
        prob_spam = count_spam / records3.array_r.length;

        prob_length_notspam = (1 / (Math.sqrt(2 * Math.PI) * sigma_length_notspam)) * Math.exp((-(x_length - mean_length_notspam) * (x_length - mean_length_notspam)) / (2 * sigma_length_notspam * sigma_length_notspam));
        prob_age_notspam = (1 / (Math.sqrt(2 * Math.PI) * sigma_age_notspam)) * Math.exp((-(x_age - mean_age_notspam) * (x_age - mean_age_notspam)) / (2 * sigma_age_notspam * sigma_age_notspam));
        prob_views_notspam = (1 / (Math.sqrt(2 * Math.PI) * sigma_views_notspam)) * Math.exp((-(x_view - mean_views_notspam) * (x_view - mean_views_notspam)) / (2 * sigma_views_notspam * sigma_views_notspam));
        prob_avgrating_notspam = (1 / (Math.sqrt(2 * Math.PI) * sigma_avgrating_notspam)) * Math.exp((-(x_avgrating - mean_avgrating_notspam) * (x_avgrating - mean_avgrating_notspam)) / (2 * sigma_avgrating_notspam * sigma_avgrating_notspam));
        prob_no_rating_notspam = (1 / (Math.sqrt(2 * Math.PI) * sigma_no_rating_notspam)) * Math.exp((-(x_no_rating - mean_no_rating_notspam) * (x_no_rating - mean_no_rating_notspam)) / (2 * sigma_no_rating_notspam * sigma_no_rating_notspam));
        prob_comment_notspam = (1 / (Math.sqrt(2 * Math.PI) * sigma_comment_notspam)) * Math.exp((-(x_comment - mean_comment_notspam) * (x_comment - mean_comment_notspam)) / (2 * sigma_comment_notspam * sigma_comment_notspam));

        prob_length_spam = (1 / (Math.sqrt(2 * Math.PI) * sigma_length_spam)) * Math.exp((-(x_length - mean_length_spam) * (x_length - mean_length_spam)) / (2 * sigma_length_spam * sigma_length_spam));
        prob_age_spam = (1 / (Math.sqrt(2 * Math.PI) * sigma_age_spam)) * Math.exp((-(x_age - mean_age_spam) * (x_age - mean_age_spam)) / (2 * sigma_age_spam * sigma_age_spam));
        prob_views_spam = (1 / (Math.sqrt(2 * Math.PI) * sigma_views_spam)) * Math.exp((-(x_view - mean_views_spam) * (x_view - mean_views_spam)) / (2 * sigma_views_spam * sigma_views_spam));
        prob_avgrating_spam = (1 / (Math.sqrt(2 * Math.PI) * sigma_avgrating_spam)) * Math.exp((-(x_avgrating - mean_avgrating_spam) * (x_avgrating - mean_avgrating_spam)) / (2 * sigma_avgrating_spam * sigma_avgrating_spam));
        prob_no_rating_spam = (1 / (Math.sqrt(2 * Math.PI) * sigma_no_rating_spam)) * Math.exp((-(x_no_rating - mean_no_rating_spam) * (x_no_rating - mean_no_rating_spam)) / (2 * sigma_no_rating_spam * sigma_no_rating_spam));
        prob_comment_spam = (1 / (Math.sqrt(2 * Math.PI) * sigma_comment_spam)) * Math.exp((-(x_comment - mean_comment_spam) * (x_comment - mean_comment_spam)) / (2 * sigma_comment_spam * sigma_comment_spam));

        posterior_numerator_notspam = ((prob_notspam * prob_length_notspam * prob_age_notspam * prob_views_notspam * prob_avgrating_notspam * prob_no_rating_notspam * prob_comment_notspam));
        posterior_numerator_spam = ((prob_spam * prob_length_spam * prob_age_spam * prob_views_spam * prob_avgrating_spam * prob_no_rating_spam * prob_comment_spam));

        if (posterior_numerator_notspam > posterior_numerator_spam) {
            result = "We predict the sample is NOT a spam video";
            setResult(result);
            hasspamy = "0";
            setHasspamy(hasspamy);
        } else {
            result = "We predict the sample is a spam video";
            setResult(result);
            hasspamy = "1";
            setHasspamy(hasspamy);
        }
    }

    public void accept(String date, double length, double views, double avgrating, double noofrating, double comment) {
        setVideo_date(date);
        setMonth(month);
        setYear(year);
        setX_length(length);
        setX_view(views);
        setX_avgrating(avgrating);
        setX_no_rating(noofrating);
        setX_comment(comment);

    }

    public void calc_age() throws ParseException
    {
        
/*         setDay(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
         setMonth(Calendar.getInstance().get(Calendar.MONTH) + 1);
         setYear(Calendar.getInstance().get(Calendar.YEAR));

        int no_of_days = Math.abs(getDay() - getDay());
        int no_of_months = Math.abs(getMonth() - getMonth());
        int no_of_years = Math.abs(getYear() - getYear());

        if(getMonth()>getMonth() || no_of_years == 0)
        {
            setX_age((no_of_years )*365 + (no_of_months)*30 + no_of_days);
        }
        else
        {
            no_of_months = (12 - getMonth()) + month ;
            setX_age((no_of_years -1 )*365 + (no_of_months)*30 + no_of_days);

        }*/
        
  
    Date date = new Date();


    long oneday = 24*60*60*1000;
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    Date day1 = formatter.parse(getVideo_date());
    setX_age(Math.abs(date.getTime() - day1.getTime())/oneday);
    
        
       
        
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the video_date
     */
    public String getVideo_date() {
        return video_date;
    }

    /**
     * @param video_date the video_date to set
     */
    public void setVideo_date(String video_date) {
        this.video_date = video_date;
    }
};
