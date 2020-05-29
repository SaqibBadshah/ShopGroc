package com.example.shopgroc.utility;

public class Constant {
    public static class DataType{
        public static final String BUNDLE = "bundle";
        public static final String PRODUCT = "product";
        public static final String CART_ITEM = "cartItem";
    }

    public static class SharedPrefKey{
        public static final String PREF_NAME = "shopGroc_api";
        public static final String USER_ID="userId";
        public static final String USER_NAME="name";
        public static final String USER_EMAIL="email";
        public static final String USER_PHONE="phone";
        public static final String USER_ADDRESS="address";
        public static final String USER_IMAGE="userImage";
    }
    public static class Messege{
        public static final String EMPTY_EMAIL_ERROR = "Email must not be empty!";
        public static final String EMPTY_PASSWORD_ERROR = "Password must not be empty!";
        public static final String EMPTY_NAME_ERROR = "Name must not be empty!";
        public static final String EMPTY_PHONE_ERROR = "Phone must not be empty!";
        public static final String EMPTY_ADDRESS_ERROR = "Address must not be empty!";
    }

    public static class DatabaseTableKey{
        public static final String USER_TABLE= "User";
    }

    public static class DatabaseKey{
        public static final String USER_NAME="name";
        public static final String USER_EMAIL="email";
        public static final String USER_PHONE="phone";
        public static final String USER_ADDRESS="address";
        public static final String USER_IMAGE="image";
    }
}
