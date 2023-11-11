import java.util.Stack;

public class TextEditor {
    private StringBuilder content = new StringBuilder();
    Stack<String>st=new Stack<String>();
    public void type(String text){
        content.append(text);
        st.push(text);
        System.out.println("Typed: "+text);
    }

    public String delete(){
        if(!st.empty()){
            String last=st.peek();
            int index=content.lastIndexOf(last);
            if(index!=-1){
                content.delete(index,index+last.length());
            }
            System.out.println("Deleted: "+last);
            return last;
        }else {
            System.out.println("No words to delete");
            return "";
        }
    }

    public void display() {
        System.out.println("Current text: "+content);
    }
}
