package patterns.decorator.secondExample;

// Implements the TextComponent interface.
public abstract class TextDecorator implements TextComponent {
    // field to store a reference to a wrapped TextComponent object
    protected TextComponent textComponent;

    /* Has a constructor that takes a TextComponent parameter.
     * The object passed in here is a reference to a wrapped TextComponent object. */
    public TextDecorator(TextComponent textComponent) {
        this.textComponent = textComponent;
    }

    // Implements the interface methods to delegate to the wrapped component.
    public String getText() {
        return textComponent.getText();
    }

    public int getCharacterCount() {
        return textComponent.getCharacterCount();
    }
}
