package patterns.decorator.secondExample;

import java.awt.*;

public class BoldDecorator extends TextDecorator {
    public BoldDecorator(TextComponent component) {
        super(component);
    }

    @Override
    public String getText() {
        return "**" + super.getText() + "**";
    }

    @Override
    public int getCharacterCount() {
        return super.getCharacterCount() + 4; // Two `**` on each side
    }
}
