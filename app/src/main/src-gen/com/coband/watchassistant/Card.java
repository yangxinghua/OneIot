package com.coband.watchassistant;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CARD".
 */
public class Card {

    private Long id;
    private int type;
    private long time;
    private String message;
    private int uncompleteStep;
    private int completedStep;
    private int stepCompletion;
    private int sleepTime;
    private int heartRate;

    public Card() {
    }

    public Card(Long id) {
        this.id = id;
    }

    public Card(Long id, int type, long time, String message, int uncompleteStep, int completedStep, int stepCompletion, int sleepTime, int heartRate) {
        this.id = id;
        this.type = type;
        this.time = time;
        this.message = message;
        this.uncompleteStep = uncompleteStep;
        this.completedStep = completedStep;
        this.stepCompletion = stepCompletion;
        this.sleepTime = sleepTime;
        this.heartRate = heartRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getUncompleteStep() {
        return uncompleteStep;
    }

    public void setUncompleteStep(int uncompleteStep) {
        this.uncompleteStep = uncompleteStep;
    }

    public int getCompletedStep() {
        return completedStep;
    }

    public void setCompletedStep(int completedStep) {
        this.completedStep = completedStep;
    }

    public int getStepCompletion() {
        return stepCompletion;
    }

    public void setStepCompletion(int stepCompletion) {
        this.stepCompletion = stepCompletion;
    }

    public int getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

}
