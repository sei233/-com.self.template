package com.self.template.food;

/**
 * Created by 石乾 on 2017/11/1.
 */

public class food {
    public food(String name, int imageId, int comment, String price) {
        this.name = name;
        this.imageId = imageId;
        this.comment = comment;
        this.price=price;

    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public int getComment() {
        return comment;
    }

    public String getPrice() {
        return price;
    }


    private String name;
    private int imageId;
    private int comment;
    private String price;

}
