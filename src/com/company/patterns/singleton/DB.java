package com.company.patterns.singleton;

public class DB {
    private static DB instance;

    public static DB getInstance() {
        if (DB.instance == null) {
            DB.instance = new DB();
        }

        return DB.instance;
    }

    public String getUser() {
        return "Aibar Yelemessov";
    }

    private DB() { }
}