package com.antoine.goaltrackerbackend.models.enums;

public enum ColorPalette {
    BLUE("#E0F2FE", "#60A5FA", "#1E3A8A"),       // very light, light, dark
    GREEN("#DCFCE7", "#4ADE80", "#166534"),
    ORANGE("#FFEDD5", "#FB923C", "#9A3412"),
    PURPLE("#F3E8FF", "#A78BFA", "#5B21B6"),
    PINK("#FCE7F3", "#F472B6", "#9D174D"),
    TEAL("#CCFBF1", "#2DD4BF", "#134E4A"),
    YELLOW("#FEF9C3", "#FACC15", "#854D0E"),
    RED("#FEE2E2", "#F87171", "#7F1D1D");

    public final String background; // very light color
    public final String expected;   // light color
    public final String actual;     // dark color

    ColorPalette(String background, String expected, String actual) {
        this.background = background;
        this.expected = expected;
        this.actual = actual;
    }
}
