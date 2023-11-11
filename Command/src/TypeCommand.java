public class TypeCommand implements ICommand{
    private TextEditor textEditor;
    private String text;
    public TypeCommand(TextEditor textEditor,String text){
        this.textEditor=textEditor;
        this.text=text;
    }
    @Override
    public void execute() {
        textEditor.type(text);
    }

    @Override
    public void undo() {
        textEditor.delete();
    }
}
