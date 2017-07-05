package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bianka Matyas on 04/07/2017.
 */

    /**
     * An {@link NewsAdapter} knows how to create a list item layout for each news
     * in the data source (a list of {@link News} objects).
     *
     * These list item layouts will be provided to an adapter view like ListView
     * to be displayed to the user.
     */
    public class NewsAdapter extends ArrayAdapter<News> {

        /**
         * The part of the location string from the USGS service that we use to determine
         * whether or not there is a location offset present ("5km N of Cairo, Egypt").
         */
        private static final String LOCATION_SEPARATOR = " of ";

        /**
         * Constructs a new {@link NewsAdapter}.
         *
         * @param context of the app
         * @param news is the list of news, which is the data source of the adapter
         */
        public NewsAdapter(Context context, List<News> news) {
            super(context, 0, news);
        }

        /**
         * Returns a list item view that displays information about the news at the given position
         * in the list of news.
         */
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if there is an existing list item view (called convertView) that we can reuse,
            // otherwise, if convertView is null, then inflate a new list item layout.
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.news_list_item, parent, false);
            }

            // Find the news at the given position in the list of news
            News currentnews = getItem(position);

            // Find the TextView with view ID title
            TextView titleView = (TextView) listItemView.findViewById(R.id.title_of_the_article_list_item);
            // Display the author of the current news in that TextView
            titleView.setText(currentnews.getmTitle());

            // Find the TextView with view ID section
            TextView sectionView = (TextView) listItemView.findViewById(R.id.name_of_the_section_list_item);
            // Display the title of the current news in that TextView
            sectionView.setText(currentnews.getmSectionsName());


            // Return the list item view that is now showing the appropriate data
            return listItemView;
        }
    }