package com.example.android.pets;

import android.content.Context;
import android.database.Cursor;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import static com.example.android.pets.data.PetContract.PetEntry;

public class PetCursorAdapter extends CursorAdapter {

    public PetCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.pet_list_item, parent, false);
    }

    /**
     * This method binds the pet data (in the current row pointed to by cursor) to the given
     * list item layout. For example, the name for the current pet can be set on the name TextView
     * in the list item layout.
     *
     * @param view    Existing view, returned earlier by newView() method
     * @param context app context
     * @param cursor  The cursor from which to get the data. The cursor is already moved to the
     *                correct row.
     */
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Find individual views that we want to modify in the list item layout
        TextView nameTextView = (TextView) view.findViewById(R.id.pet_name);
        TextView summaryTextView = (TextView) view.findViewById(R.id.pet_breed);

        // Find the columns of pet attributes that we're interested in
        int nameColumnIndex = cursor.getColumnIndex(PetEntry.COLUMN_PET_NAME);
        int breedColumnIndex = cursor.getColumnIndex(PetEntry.COLUMN_PET_BREED);

        // Read the pet attributes from the Cursor for the current pet
        String petName = cursor.getString(nameColumnIndex);
        String petBreed = cursor.getString(breedColumnIndex);

        // If the pet breed is empty string or null, then use some default text
        // that says "Unknown breed", so the TextView isn't blank.
        if (TextUtils.isEmpty(petBreed)) {
            petBreed = context.getString(R.string.unknown_breed);
        }

        // Update the TextViews with the attributes for the current pet
        nameTextView.setText(petName);
        summaryTextView.setText(petBreed);
    }
}
