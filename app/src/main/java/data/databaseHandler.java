package data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.SyncStateContract;

import java.util.ArrayList;

import model.Food;

/**
 * Created by test on 12/22/2017.
 */

public class databaseHandler extends SQLiteOpenHelper {
    private final ArrayList<Food> foodList = new ArrayList<>();

    public databaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
