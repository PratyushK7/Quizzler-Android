package com.londonappbrewery.quizzler;

public class TrueFalse {

    private  int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(int questionID, boolean trueFalse) {
        mQuestionID = questionID;
        mAnswer = trueFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean trueFalse) {
        mAnswer = trueFalse;
    }
}
