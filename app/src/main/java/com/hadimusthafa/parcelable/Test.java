package com.hadimusthafa.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Test implements Parcelable {
    String name;

    public Test(String name) {
        this.name = name;
    }

    protected Test(Parcel in) {
        name = in.readString();
    }

    public static final Creator<Test> CREATOR = new Creator<Test>() {
        @Override
        public Test createFromParcel(Parcel in) {
            return new Test(in);
        }

        @Override
        public Test[] newArray(int size) {
            return new Test[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
    }
}
