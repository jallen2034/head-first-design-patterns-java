package patterns.decorator.secondExample;

public class UnderlineDecorator extends TextDecorator {
    public UnderlineDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getText() {
        return "__" + super.getText() + "__";  // Markdown-style underline.
    }

    @Override
    public int getCharacterCount() {
        return super.getCharacterCount() + 4; // Adds '__' on both sides.
    }
}

