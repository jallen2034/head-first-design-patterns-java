package patterns.decorator.secondExample;

public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getText() {
        return "*" + super.getText() + "*";  // Markdown-style italics.
    }

    @Override
    public int getCharacterCount() {
        return super.getCharacterCount() + 2; // Adds '*' on both sides.
    }
}
