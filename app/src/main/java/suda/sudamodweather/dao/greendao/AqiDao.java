package suda.sudamodweather.dao.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import suda.sudamodweather.dao.greendao.Aqi;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "AQI".
*/
public class AqiDao extends AbstractDao<Aqi, Void> {

    public static final String TABLENAME = "AQI";

    /**
     * Properties of entity Aqi.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Areaid = new Property(0, String.class, "areaid", false, "AREAID");
        public final static Property Aqi = new Property(1, Integer.class, "aqi", false, "AQI");
        public final static Property Quality = new Property(2, String.class, "quality", false, "QUALITY");
        public final static Property Pm2_5 = new Property(3, Integer.class, "pm2_5", false, "PM2_5");
        public final static Property Pm10 = new Property(4, Integer.class, "pm10", false, "PM10");
        public final static Property So2 = new Property(5, Integer.class, "so2", false, "SO2");
        public final static Property No2 = new Property(6, Integer.class, "no2", false, "NO2");
    };


    public AqiDao(DaoConfig config) {
        super(config);
    }
    
    public AqiDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"AQI\" (" + //
                "\"AREAID\" TEXT," + // 0: areaid
                "\"AQI\" INTEGER," + // 1: aqi
                "\"QUALITY\" TEXT," + // 2: quality
                "\"PM2_5\" INTEGER," + // 3: pm2_5
                "\"PM10\" INTEGER," + // 4: pm10
                "\"SO2\" INTEGER," + // 5: so2
                "\"NO2\" INTEGER);"); // 6: no2
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"AQI\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Aqi entity) {
        stmt.clearBindings();
 
        String areaid = entity.getAreaid();
        if (areaid != null) {
            stmt.bindString(1, areaid);
        }
 
        Integer aqi = entity.getAqi();
        if (aqi != null) {
            stmt.bindLong(2, aqi);
        }
 
        String quality = entity.getQuality();
        if (quality != null) {
            stmt.bindString(3, quality);
        }
 
        Integer pm2_5 = entity.getPm2_5();
        if (pm2_5 != null) {
            stmt.bindLong(4, pm2_5);
        }
 
        Integer pm10 = entity.getPm10();
        if (pm10 != null) {
            stmt.bindLong(5, pm10);
        }
 
        Integer so2 = entity.getSo2();
        if (so2 != null) {
            stmt.bindLong(6, so2);
        }
 
        Integer no2 = entity.getNo2();
        if (no2 != null) {
            stmt.bindLong(7, no2);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public Aqi readEntity(Cursor cursor, int offset) {
        Aqi entity = new Aqi( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // areaid
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // aqi
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // quality
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // pm2_5
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // pm10
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // so2
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6) // no2
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Aqi entity, int offset) {
        entity.setAreaid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setAqi(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setQuality(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPm2_5(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setPm10(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setSo2(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setNo2(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(Aqi entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(Aqi entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
