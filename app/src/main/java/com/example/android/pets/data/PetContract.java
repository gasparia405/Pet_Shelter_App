package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {

    public PetContract(){}

    public static final class PetEntry implements BaseColumns {

        // Table name
        public final static String TABLE_NAME = "pets";

        // Column names - _id, name, breed, gender, weight
        public final static String COLUMN_PET_ID = "_id";
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";

        // Gender variables
        public final static int GENDER_UNKNOWN = 0;
        public final static int GENDER_MALE = 1;
        public final static int GENDER_FEMALE = 2;
    }
}
