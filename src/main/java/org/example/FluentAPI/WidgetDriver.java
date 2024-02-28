package org.example.FluentAPI;

public class WidgetDriver {
    public static void main(String[] args) {

        Widget widget = Widget.create()
                .withHeight(1.0)
                .withLength(5.0)
                .withWidth(4.0)
                .build();
        // a more fluent way to create a constructor.
        System.out.println(widget);
    }
}
