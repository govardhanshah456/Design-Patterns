import java.util.Stack;

public class CommandManager {
    private Stack<ICommand> commandStack = new Stack<>();

    public void executeCommand(ICommand command){
        command.execute();
        commandStack.push(command);
    }

    public void undoCommand(){
        if(!commandStack.empty()){
            ICommand command = commandStack.pop();
            command.undo();
        }
    }
}
