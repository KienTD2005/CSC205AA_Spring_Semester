package org.example.FluentAPI;

public class Widget {
    private double length;
    private double width;
    private double height;

    @Override
    public String toString() {
        return "Widget{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public static WidgetBuilder create() {
        return new WidgetBuilder();
    }

    public static final class WidgetBuilder {
        private final Widget widget;

        public WidgetBuilder() {
            widget = new Widget();
        }


        public WidgetBuilder withLength(double length) {
            this.widget.length = length;
            return this;
        }

        public WidgetBuilder withWidth(double width) {
            this.widget.width = width;
            return this;
        }

        public WidgetBuilder withHeight(double height) {
            this.widget.height = height;
            return this;
        }

        public Widget build() {
            return widget;
        }
    } // Inner class


}
