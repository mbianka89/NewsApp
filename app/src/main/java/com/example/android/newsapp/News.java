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
     * Url of the section
     */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param title        of the article
     * @param sectionsName is the name of the section
     * @param sectionsUrl  is the url of the section
     */
    public News(String title, String sectionsName, String sectionsUrl) {

        mTitle = title;
        mSectionsName = sectionsName;
        mUrl = sectionsUrl;
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

    /**
     * Returns the url of the section
     */
    public String getmUrl() {
        return mUrl;
    }
}
