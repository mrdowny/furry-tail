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
                    "Просто стрижка, под ноль :)",
                    R.drawable.man_hair),
            new Hair("Женская стрижка",
                    "Стрижка женская модельная(шампунь,бальзам,сушка по форме стрижки) Короткие, cредние, длинные, cтрижка челки",
                    R.drawable.women_hair),
            new Hair("Окрашивание волос",
                    "Л’Ореаль – щадящие составы, великолепный результат Мелирование, блондирование (любые виды мелирования и осветления волос)",
                    R.drawable.color_hair)};

}
