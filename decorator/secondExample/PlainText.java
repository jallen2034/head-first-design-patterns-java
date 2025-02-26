package patterns.decorator.secondExample;

// Concrete plain text class that will be "decorated" with different varieties of text formatters,
public class PlainText implements TextComponent {
    // Concrete plaintext class holds a string of text we will want to format in its internal state.
    private final String text;

    /* Constructor that will be used to take in a string and store it in this text decorators state.
     * When this object is instantiated somewhere else in our program. */
    public PlainText(String text) {
        if (text == null) {
            throw new NullPointerException("text is null");
        }

        this.text = text;
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public int getCharacterCount() {
        if (!text.isEmpty()) {
            return text.length();
        } else {
            return 0;
        }
    }
}
