package com.example.androidtraining;

import android.os.Parcel;
import android.os.Parcelable;

public class TrueFalse {
	private int mQuestion;
	private boolean mTrueQuestion;
	private boolean mHasCheated;
	
	private int mData;
	
	public TrueFalse(int question, boolean trueQuestion, boolean hasCheated) {
		mQuestion = question;
		mTrueQuestion = trueQuestion;
		mHasCheated = hasCheated;
	}

	public boolean isHasCheated() {
		return mHasCheated;
	}

	public void setHasCheated(boolean hasCheated) {
		mHasCheated = hasCheated;
	}

	public int getQuestion() {
		return mQuestion;
	}

	public void setQuestion(int question) {
		mQuestion = question;
	}

	public boolean isTrueQuestion() {
		return mTrueQuestion;
	}

	public void setTrueQuestion(boolean trueQuestion) {
		mTrueQuestion = trueQuestion;
	}

//	@Override
//	public int describeContents() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void writeToParcel(Parcel dest, int flags) {
//		dest.writeInt(mData);
//	}
//	
//	public static final Parcelable.Creator<TrueFalse> CREATOR
//    		= new Parcelable.Creator<TrueFalse>() {
//		public TrueFalse createFromParcel(Parcel in) {
//			return new TrueFalse(in);
//		}
//
//		public TrueFalse[] newArray(int size) {
//			return new TrueFalse[size];
//		}
//	};
//	
//	private TrueFalse(Parcel in) {
//        mData = in.readInt();
//    }
//
//	
}
