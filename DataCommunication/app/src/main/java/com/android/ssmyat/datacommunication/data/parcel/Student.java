package com.android.ssmyat.datacommunication.data.parcel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Lenovo on 3/4/2018.
 */

public class Student implements Parcelable {
    private String name;
    private String address;
    private String education;
    private String occupation;

    private static Student instance;

    public static Student getInstance(){
        if(instance == null){
            instance = new Student();
        }
        return instance;
    }

    private Student() {

    }

    protected Student(Parcel in) {
        name = in.readString();
        address = in.readString();
        education = in.readString();
        occupation = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeString(education);
        dest.writeString(occupation);
    }
}
