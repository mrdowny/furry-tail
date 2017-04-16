package com.example.lesson6;


public class Hair {

    private String name;
    private String description;
    private int imageResourceId;

    public Hair(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }

    // nails - массив с элементами Nail
    public static final Hair[] hairs = {
            new Hair("Мужская стрижка",
                    "-----------------------",
                    R.drawable.kl_man),
            new Hair("Женская стрижка",
                    "------------------------",
                    R.drawable.ap_man),
            new Hair("Окрашивание волос",
                    "------------------------",
                    R.drawable.ap_ped)};

}
