package com.example.android.miwok;

/**
 * Created by billwen on 2017/2/28.
 */

public class Word {
    private final static int NO_IMAGE_PROVIDED = -1;
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    /**
     * Create a new word object
     *
     * @param miwokTranslation   is the word in miwok language
     * @param englishTranslation is the word in english language
     * @param audioResourceId    is the word audio resource id
     */
    public Word(String miwokTranslation, String englishTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new word object
     *
     * @param miwokTranslation   is the word in miwok language
     * @param englishTranslation is the word in english language
     * @param imageResourceId    is the resource id of image
     * @param audioResourceId    is the word audio resource id
     */
    public Word(String miwokTranslation, String englishTranslation, int imageResourceId, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mEnglishTranslation='" + mEnglishTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getEnglishTranslation() {
        return mEnglishTranslation;

    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


    /**
     * Return whether or not there is an image for this word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
