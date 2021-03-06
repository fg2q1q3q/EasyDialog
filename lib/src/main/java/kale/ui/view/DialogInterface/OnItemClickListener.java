package kale.ui.view.DialogInterface;

import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Jack Tony
 * @date 2015/10/10
 */
public abstract class OnItemClickListener implements Parcelable {

    /**
     * Callback method to be invoked when an item in this AdapterView has
     * been clicked.
     * <p>
     * Implementers can call getItemAtPosition(position) if they need
     * to access the data associated with the selected item.
     *
     * @param position The position of the item in the adapter.
     */
    public abstract void onItemClick(DialogInterface dialog, int position);

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
