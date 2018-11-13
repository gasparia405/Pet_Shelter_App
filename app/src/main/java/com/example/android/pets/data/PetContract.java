package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

public final class PetContract {

    public PetContract(){}

    // Identify Content Authority
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";

    // Create Base Content Uri
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public final static String PATH_PETS = "pets";

    public static final class PetEntry implements BaseColumns {

        // Create complete Content Uri
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

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
