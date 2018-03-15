package com.example.tanya.geoquiz;

/**
 * Created by tanya on 12.03.2018.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mIsAnswered;
    private boolean mIsCheater;

    //id вопроса и правильный ответ
    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mIsAnswered = false;
        mIsCheater = false;
    }

    public int getTextResId() {
        return mTextResId;
    }


    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isAnswered() {
        return mIsAnswered;
    }
    public void setIsAnswered(boolean answer){
        mIsAnswered = answer;
    }

    public boolean isCheater() {
        return mIsCheater;
    }

    public void setCheater(boolean cheater) {
        mIsCheater = cheater;
    }
}
