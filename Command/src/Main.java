// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        CommandManager commandManager = new CommandManager();
        ICommand command1 = new TypeCommand(textEditor,"Ansh");
        ICommand command2 = new TypeCommand(textEditor,"Ansh SHah");
        commandManager.executeCommand(command1);
        commandManager.executeCommand(command2);
        textEditor.display();
        commandManager.undoCommand();
        textEditor.display();
    }
}