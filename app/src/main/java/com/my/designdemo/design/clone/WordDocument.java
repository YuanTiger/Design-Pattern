package com.my.designdemo.design.clone;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：mengyuan
 * Date  : 2017/7/17下午2:22
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class WordDocument implements Cloneable {
    //文本
    private String text;
    //作者
    private String author;
    //图片集合
    private ArrayList<String> imageList;

    @Override
    protected WordDocument clone() {
        WordDocument document = null;
        try {
            document = (WordDocument) super.clone();
            document.text = this.text;
            document.author = this.author;
            document.imageList = (ArrayList<String>) imageList.clone();
            return document;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }


    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(ArrayList<String> imageList) {
        this.imageList = imageList;
    }

    public void addImage(String image) {
        if (imageList == null) {
            imageList = new ArrayList<>();
        }
        imageList.add(image);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("author：").append(author).append("\n");
        stringBuilder.append("text：").append(text).append("\n");
        if (imageList != null) {
            for (String s : imageList) {
                stringBuilder.append("imageList：").append(s).append("\n");
            }
        }

        stringBuilder.append("----------------------------------------------------------").append("\n");
        return stringBuilder.toString();
    }
}
