package com.lehoczky.petra.android.windscreenstock.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class WindscreenContract {

    public static final String CONTENT_AUTHORITY = "com.lehoczky.petra.android.windscreenstock";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_PRODUCTS = "products";
    private WindscreenContract() {
    }

    public final static class WindscreenEntry implements BaseColumns {

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PRODUCTS);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCTS;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCTS;

        public final static String PRODUCTS_TABLE_NAME = "products";

        public final static String COLUMN_PRODUCT_NAME = "name";
        public final static String COLUMN_PRODUCT_PRICE = "price";
        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";
        public final static String COLUMN_PRODUCT_VENDOR_EMAIL = "vendor_email";
        public final static String COLUMN_PRODUCT_IMAGE = "image";
    }
}