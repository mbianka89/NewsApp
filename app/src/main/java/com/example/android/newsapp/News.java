package com.example.android.newsapp;

/**
 * Created by Bianka Matyas on 04/07/2017.
 */

public class News {

    /**
     * Title of the article
     */
    private String mTitle;

    /**
     * Name of the section
     */
    private String mSectionsName;

    /**
     * Constructs a new {@link News} object.
     *
     * @param title        of the article
     * @param sectionsName is the name of the section
     */
    public News(String title, String sectionsName) {

        mTitle = title;
        mSectionsName = sectionsName;
    }

    public News(String title, String section, String url) {
    }

    /**
     * Returns the title of the article
     */
    public String getmTitle() {
        return mTitle;
    }


    /**
     * Returns the name of the section
     */
    public String getmSectionsName() {
        return mSectionsName;
    }
}
