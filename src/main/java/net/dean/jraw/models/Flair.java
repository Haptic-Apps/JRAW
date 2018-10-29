package net.dean.jraw.models;

import net.dean.jraw.RedditClient;

/**
 * Immutable class representing the flair of a user or submission in a specific subreddit.
 */
public final class Flair {
    private final String cssClass;
    private final String text;
    private final String textColor;
    private final String backgroundColor;
    private final String type;
    private final String templateId;

    /**
     * Instantiates a new Flair
     *
     * @param cssClass The name of the class in the subreddit's stylesheet.
     */
    public Flair(String cssClass, String text, String textColor, String backgroundColor, String type, String templateId) {
        this.cssClass = cssClass;
        this.text = text;
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
        this.type = type;
        this.templateId = templateId;
    }

    /**
     * Gets the name of the class in the subreddit's stylesheet.
     *
     * @see RedditClient#getStylesheet(String)
     */
    public String getCssClass() {
        return cssClass;
    }

    /** Gets the value of the flair. */
    public String getText() {
        return text;
    }

    public String getTextColor() {
        return textColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getType() {
        return type;
    }

    public String getTemplateId() {
        return templateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flair flair = (Flair) o;

        return !(cssClass != null ? !cssClass.equals(flair.cssClass) : flair.cssClass != null) &&
                !(text != null ? !text.equals(flair.text) : flair.text != null);

    }

    @Override
    public int hashCode() {
        int result = cssClass != null ? cssClass.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flair {" +
                "cssClass='" + cssClass + '\'' +
                ", text='" + text + '\'' +
                ", textColor='" + textColor + '\'' +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", type='" + type + '\'' +
                ", templateId='" + templateId + '\'' +
                '}';
    }
}
