package patterns.decorator.secondExample;

public class TextFormatterDemo {
    public static void main(String[] args) {
        // Create a base text component
        TextComponent plainText = new PlainText("Hello World");
        System.out.println("Plain text: " + plainText.getText());
        System.out.println("Character count: " + plainText.getCharacterCount());
        System.out.println();

        // Single decorators
        TextComponent boldText = new BoldDecorator(plainText);
        System.out.println("Bold text: " + boldText.getText());
        System.out.println("Character count: " + boldText.getCharacterCount());

        TextComponent italicText = new ItalicDecorator(plainText);
        System.out.println("Italic text: " + italicText.getText());
        System.out.println("Character count: " + italicText.getCharacterCount());
        System.out.println();

        // Multiple decorators - first approach (bold + italic).
        TextComponent italicPlainText = new ItalicDecorator(plainText);
        TextComponent boldItalicText = new BoldDecorator(italicPlainText);
        System.out.println("Bold + Italic: " + boldItalicText.getText());
        System.out.println("Character count: " + boldItalicText.getCharacterCount());

        // Multiple decorators - second approach (italic + bold).
        TextComponent boldPlainText = new BoldDecorator(plainText);
        TextComponent italicBoldText = new ItalicDecorator(boldPlainText);
        System.out.println("Italic + Bold: " + italicBoldText.getText());
        System.out.println("Character count: " + italicBoldText.getCharacterCount());
        System.out.println();

        // Triple decoration.
        TextComponent italicBasicText = new ItalicDecorator(plainText);
        TextComponent boldItalicBasicText = new BoldDecorator(italicBasicText);
        TextComponent allFormatting = new UnderlineDecorator(boldItalicBasicText);
        System.out.println("All formatting: " + allFormatting.getText());
        System.out.println("Character count: " + allFormatting.getCharacterCount());
    }
}