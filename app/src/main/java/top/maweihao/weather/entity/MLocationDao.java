package top.maweihao.weather.entity;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MLOCATION".
*/
public class MLocationDao extends AbstractDao<MLocation, Void> {

    public static final String TABLENAME = "MLOCATION";

    /**
     * Properties of entity MLocation.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property LocateType = new Property(0, int.class, "locateType", false, "LOCATE_TYPE");
        public final static Property RawBaiduLocateCode = new Property(1, int.class, "rawBaiduLocateCode", false, "RAW_BAIDU_LOCATE_CODE");
        public final static Property NeedGeocode = new Property(2, boolean.class, "needGeocode", false, "NEED_GEOCODE");
        public final static Property Latitude = new Property(3, float.class, "latitude", false, "LATITUDE");
        public final static Property Longitude = new Property(4, float.class, "longitude", false, "LONGITUDE");
        public final static Property Province = new Property(5, String.class, "province", false, "PROVINCE");
        public final static Property City = new Property(6, String.class, "city", false, "CITY");
        public final static Property County = new Property(7, String.class, "county", false, "COUNTY");
        public final static Property Street = new Property(8, String.class, "street", false, "STREET");
    }


    public MLocationDao(DaoConfig config) {
        super(config);
    }
    
    public MLocationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MLOCATION\" (" + //
                "\"LOCATE_TYPE\" INTEGER NOT NULL ," + // 0: locateType
                "\"RAW_BAIDU_LOCATE_CODE\" INTEGER NOT NULL ," + // 1: rawBaiduLocateCode
                "\"NEED_GEOCODE\" INTEGER NOT NULL ," + // 2: needGeocode
                "\"LATITUDE\" REAL NOT NULL ," + // 3: latitude
                "\"LONGITUDE\" REAL NOT NULL ," + // 4: longitude
                "\"PROVINCE\" TEXT," + // 5: province
                "\"CITY\" TEXT," + // 6: city
                "\"COUNTY\" TEXT," + // 7: county
                "\"STREET\" TEXT);"); // 8: street
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MLOCATION\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MLocation entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getLocateType());
        stmt.bindLong(2, entity.getRawBaiduLocateCode());
        stmt.bindLong(3, entity.getNeedGeocode() ? 1L: 0L);
        stmt.bindDouble(4, entity.getLatitude());
        stmt.bindDouble(5, entity.getLongitude());
 
        String province = entity.getProvince();
        if (province != null) {
            stmt.bindString(6, province);
        }
 
        String city = entity.getCity();
        if (city != null) {
            stmt.bindString(7, city);
        }
 
        String county = entity.getCounty();
        if (county != null) {
            stmt.bindString(8, county);
        }
 
        String street = entity.getStreet();
        if (street != null) {
            stmt.bindString(9, street);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MLocation entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getLocateType());
        stmt.bindLong(2, entity.getRawBaiduLocateCode());
        stmt.bindLong(3, entity.getNeedGeocode() ? 1L: 0L);
        stmt.bindDouble(4, entity.getLatitude());
        stmt.bindDouble(5, entity.getLongitude());
 
        String province = entity.getProvince();
        if (province != null) {
            stmt.bindString(6, province);
        }
 
        String city = entity.getCity();
        if (city != null) {
            stmt.bindString(7, city);
        }
 
        String county = entity.getCounty();
        if (county != null) {
            stmt.bindString(8, county);
        }
 
        String street = entity.getStreet();
        if (street != null) {
            stmt.bindString(9, street);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public MLocation readEntity(Cursor cursor, int offset) {
        MLocation entity = new MLocation( //
            cursor.getInt(offset + 0), // locateType
            cursor.getInt(offset + 1), // rawBaiduLocateCode
            cursor.getShort(offset + 2) != 0, // needGeocode
            cursor.getFloat(offset + 3), // latitude
            cursor.getFloat(offset + 4), // longitude
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // province
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // city
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // county
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // street
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MLocation entity, int offset) {
        entity.setLocateType(cursor.getInt(offset + 0));
        entity.setRawBaiduLocateCode(cursor.getInt(offset + 1));
        entity.setNeedGeocode(cursor.getShort(offset + 2) != 0);
        entity.setLatitude(cursor.getFloat(offset + 3));
        entity.setLongitude(cursor.getFloat(offset + 4));
        entity.setProvince(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCity(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setCounty(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setStreet(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(MLocation entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(MLocation entity) {
        return null;
    }

    @Override
    public boolean hasKey(MLocation entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
