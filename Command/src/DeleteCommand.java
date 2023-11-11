public class DeleteCommand implements ICommand{

    private TextEditor textEditor;

    private String deletedText;
    public DeleteCommand(TextEditor textEditor){
        this.textEditor = textEditor;
    }
    @Override
    public void execute() {
        deletedText = textEditor.delete();
    }

    @Override
    public void undo() {
        textEditor.type(deletedText);
    }
}
